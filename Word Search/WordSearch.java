class WordSearch {
    private boolean isPresent(char[][] board, int row, int col, boolean[][] covered, int index, String word) {
        if(index == word.length()){
            return true;
        }
        
        if(row < 0 || col < 0 || row > board.length-1 ||
           col > board[0].length-1 || word.charAt(index) != board[row][col]) {
            return false;
        }
        
        if(covered[row][col]) {
            return false;
        } 
        covered[row][col] = true;
        boolean left = false, right = false, down = false, up = false;
        
        left = isPresent(board,row,col-1, covered, index+1, word);
        up = isPresent(board,row-1,col,covered, index+1, word);
        down = isPresent(board,row+1,col,covered, index+1,word);
        right = isPresent(board,row,col+1,covered, index+1, word);
        
        covered[row][col] = false;
        return left || right || down || up;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] covered = new boolean[board.length][board[0].length];
        
        boolean present=false;
        for(int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)) {
                    present |= isPresent(board,i,j,covered, 0,word);
                    if(present){
                        break;
                    }
                }
            }
        }
        return present;
    }
}