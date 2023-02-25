import java.util.Scanner;

public class P288 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();



        int length = 1;
        int j = 0;

        String dates = "";

        String months = "";

        String yeart = "";
        String years = "";
      

        for(int i = 0; i < 4; i++){
            yeart += n.charAt(n.length() - length);
            length++;
        }
        length = 1;
        for(int i = 0; i < 4; i++){
            years += yeart.charAt(yeart.length() - length);
            length++;
        }


        while(n.charAt(j) != '-'){
            dates += n.charAt(j);
            j++;
        }

        int k = j + 1;

        while(n.charAt(k) != '-'){
            months += n.charAt(k);
            k++;
        }

        
          Integer year = Integer.parseInt(years);
          Integer month = Integer.parseInt(months);
          Integer date = Integer.parseInt(dates);


          int md = month * date;
          int count = 0;

          String mds = Integer.toString(md);
          int len = mds.length();
          int temp_len = len;

          if(len == 1){
            int tempy = year % 10;
            if(tempy == md){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
          }
          else{
            while(temp_len != 0){
                int tempy = year % 10;
                int tempmd = md % 10;
                if(tempy == tempmd){
                    count++;
                }
                year /= 10;
                md /= 10;
                temp_len--;
            }
            if(count == len){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
          }
       
          



        
    }
}
