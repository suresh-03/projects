import java.util.Scanner;

public class P289 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ms = in.next();

        int a = 2;

        int b = 2;

        String m = "";

        String s = "";

        for(int i = 0; i < ms.length() - 3; i++){
            if(ms.charAt(i) != ':'){
                m += ms.charAt(i);
            }
        }

        while(a != 0){
            s += ms.charAt(ms.length() - b);
            b--;
            a--;
        }

        // System.out.println(m + s);

       int min = Integer.parseInt(m);
        int sec = Integer.parseInt(s);

        System.out.println((min * 60) + sec);

    }
}
