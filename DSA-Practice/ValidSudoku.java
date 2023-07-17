public class ValidSudoku {
    public static void main(String[] args) {
       char[][] board = 
{{'8','3','.','.','7','.','.','.','4'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','.','.','.','.','.','6','.'}
,{'.','8','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            int rs=0,re=0,cs=0,ce=0;
            if(i >= 0 && i <= 2){
                rs = 0;
                re = 2;
                if(i == 0){
                    cs = 0;
                    ce = 2;
                }
                else if(i == 1){
                    cs = 3;
                    ce = 5;
                }
                else{
                    cs = 6;
                    ce = 8;
                }
            }
            else if(i >= 3 && i <= 5){
                rs = 3;
                re = 5;
                if(i == 3){
                    cs = 0;
                    ce = 2;
                }
                else if(i == 4){
                    cs = 3;
                    ce = 5;
                }
                else{
                    cs = 6;
                    ce = 8;
                }
            }
           else if(i >= 6 && i <= 8){
                rs = 6;
                re = 8;
                if(i == 6){
                    cs = 0;
                    ce = 2;
                }
                else if(i == 7){
                    cs = 3;
                    ce = 5;
                }
                else{
                    cs = 6;
                    ce = 8;
                }
            }
            int r = rs;
            int c = cs;
            for(int j = 0; j < 9; j++){
                char target = board[r][c];
                if(target != '.'){
                    for(int k = rs; k <= re; k++){
                        for(int l = cs; l <= ce; l++){
                            if(k == r && l == c){
                              continue;
                            }
                            else{
                                if(target == board[k][l]){
                                    return false;
                                }
                            }
                        }
                    }
                    for(int ro = r; ro <= r; ro++){
                        for(int co = 0; co < 9; co++){
                            if(ro == r && co == c){
                                continue;
                            }
                            if(target == board[ro][co]){
                                return false;
                            }
                        }
                    }
                    for(int co = c; co <= c; co++){
                        for(int ro = 0; ro < 9; ro++){
                            if(ro == r && co == c){
                                continue;
                            }
                            if(target == board[ro][co]){
                                return false;
                            }
                        }
                    }
                }
           
                if(c != ce){
                    c++;
                }
                else{
                    r++;
                    c=cs;
                }
            }
        }
        return true;
    }
}
