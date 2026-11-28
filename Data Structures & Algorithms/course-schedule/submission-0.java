class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // given: [a,b] where b is prereq of a and must be taken before a

        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indeg = new int[n];

        for(int[] p: prerequisites) {
            adj.get(p[1]).add(p[0]);
            indeg[p[0]]++; // how many prerequisities does a course have?
        }

        Queue<Integer> ready = new ArrayDeque<>();
        int taken = 0;

        for(int i = 0; i < n; i++) {
            if(indeg[i] == 0) { // no prereq
                ready.add(i);
            }
        }

        while(!ready.isEmpty()) {
            int u = ready.poll();
            taken++;
            for(int v: adj.get(u)) {
                if(--indeg[v] == 0) {
                    ready.add(v);
                }
            }
        }

        return taken == n;
    }
}