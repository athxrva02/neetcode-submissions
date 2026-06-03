class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                if(!seen.add(board[i][j]))
                    return false;
            }
        }

        for(int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] == '.') 
                    continue;
                if(!seen.add(board[j][i]))
                    return false;
            }
        }

        for(int k = 0; k < 9; k++) {
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (k / 3) * 3 + i;
                    int col = (k % 3) * 3 + j;

                    if(board[row][col] == '.')
                        continue;
                    if(!seen.add(board[row][col]))
                        return false;
                }
            }
        }

        return true;
    }
}
