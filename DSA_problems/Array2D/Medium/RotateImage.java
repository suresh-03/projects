package DSA_problems.Array2D.Medium;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {6,7,8},
            {11,12,13} 
        };
     
      rotate(arr);
      // optimalRotate(arr);
    }
    static void rotate(int[][] arr){
        int ind = 0;
        int cl = 0;
        int ch = arr[0].length - 1;
        int rl = 0;
        int rh = arr.length-1;

        

        while(rl < rh && cl < ch){
            int[] temp = new int[(rh-rl)+1];
            for(int i = cl; i <= ch; i++){
                temp[ind] = arr[i][ch];
                arr[i][ch] = arr[rl][i];
                ind++;
            }
            arr[rh][ch] = temp[0];
            ind = 1;
            temp[0] = temp[temp.length - 1];
    
            for(int i = ch-1; i >= cl; i--){
                int t = arr[rh][i];
                arr[rh][i] = temp[ind];
                temp[ind] = t;
                ind++;
            }
            ind = 1;
            temp[0] = temp[temp.length-1];
            
            for(int i = rh-1; i >= rl; i--){
                int t = arr[i][cl];
                arr[i][cl] = temp[ind];
                temp[ind] = t;
                ind++;
            }
            ind = 0;
            for(int i = cl; i <= ch; i++){
                arr[rl][i] = temp[ind];
                ind++;
            }
            ind = 0;
            rl++;
            rh--;
            cl++;
            ch--;
    
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void optimalRotate(int[][] matrix){
       
        
                //Transpose
                for(int i=0;i<matrix.length;i++){
                    for(int j=i;j<matrix[0].length;j++){
                        int temp=matrix[i][j];
                        matrix[i][j]=matrix[j][i];
                        matrix[j][i]=temp;
                    }
                }
        
                //Reverse
                 for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<matrix[0].length/2;j++){
                        int temp=matrix[i][j];
                        matrix[i][j]=matrix[i][matrix.length-1-j];
                        matrix[i][matrix.length-1-j]=temp;
                    }
                }
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix[i].length; j++){
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

