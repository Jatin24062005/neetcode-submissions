class Solution {
    

    public boolean isValid(int row,int col,char[][] board){
        //complete row iteration
        for(int i =0;i<9;i++){
            if(col == i) {
                continue;
                }

            if(board[row][i] == board[row][col]){
                return false;
            }
        }
         for(int i =0;i<9;i++){
            if(row == i){
                continue;
            }
            
            if(board[i][col] == board[row][col]){
                return false;
            }
        }

        int r = row/3;  //block coordinates
        int c = col/3;

        for(int i = 0 ; i<3;i++){
            for(int j =0;j<3;j++){

                if (r * 3 + i == row && c * 3 + j == col) continue;

                if(board[r*3+i][c*3+j] == board[row][col]){
                    return false;
                }
            }
        }
         
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for(int i =0;i<9;i++){ //rows
          for(int j =0;j<9;j++){
            if (board[i][j] == '.') continue; // Skip empty cells
            
            if(!isValid(i,j,board)){
                 return false;

            }
          }
        }
        return true;
    }
}
