class Solution {

    private List<String> construct(char[][]board){
        ArrayList<String> res = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }

    private void solve (int col, List<List<String>> result,char[][] board){
        if(col==board.length){
            result.add(construct(board));
            return;
        }
       for(int row=0;row<board.length;row++){
            if(validate(board,row,col)){
                board[row][col]='Q';
                solve(col+1,result,board);
                board[row][col]='.';
            }
       }
    }

    private boolean validate(char[][] board,int row,int col){
        int duprow=row;
        int dupcol=col;

        while(duprow>=0 && dupcol>=0){
            if(board[duprow][dupcol]=='Q'){
                return false;
            }
            duprow--;
            dupcol--;
        }

        
         dupcol=col;

         while(dupcol>=0){
            if(board[row][dupcol]=='Q'){
                return false;
            }
            dupcol--;
        }

        duprow=row;
        dupcol=col;

        while(dupcol>=0 && duprow<board.length){
            if(board[duprow][dupcol]=='Q'){
                return false;
            }
            dupcol--;
            duprow++;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] ='.';
            }
        }

        solve(0,result,board);
        return result;
    }
}