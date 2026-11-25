class Solution {

    private static final class Room {
        final int id;
        long freeAt;

        Room(int id) {
            this.id = id;
        }
    }

    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0], b[0])); // sort meetings in the order of their lowest start

        PriorityQueue<Room> idle = new PriorityQueue<>(Comparator.comparingInt(r -> r.id));

        PriorityQueue<Room> busy = new PriorityQueue<>(Comparator.comparingLong(r -> r.freeAt));


        for(int i = 0; i < n; i++) {
            idle.offer(new Room(i));
        }

        int[] meetingsHeld = new int[n];

        long now = 0;

        for(int[] meeting: meetings) {
            now = Math.max(now, meeting[0]);
            release(busy, idle, now);

            if(idle.isEmpty()) {
                now = busy.peek().freeAt;
                release(busy, idle, now);
            }

            Room room = idle.poll();
            meetingsHeld[room.id]++;

            long duration = meeting[1] - meeting[0];
            room.freeAt = now + duration;

            busy.offer(room);
        }

        int best = 0;

        for(int i = 1; i < meetingsHeld.length; i++) {
            if(meetingsHeld[i] > meetingsHeld[best]) {
                best = i;
            }
        }

        return best;
    }


    private void release(PriorityQueue<Room> busy, PriorityQueue<Room> idle, long now) {
        
        while(!busy.isEmpty() && busy.peek().freeAt <= now) {
            idle.offer(busy.poll());
        }
    }

}