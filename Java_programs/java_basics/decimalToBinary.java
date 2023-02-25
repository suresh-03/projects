package java_basics;

public class decimalToBinary {
    public static void main(String[] args) {
        int a = 342;
        String bin = "";
        String binary = "";

        while(a >= 2){
            int temp = a % 2;
            bin += Integer.toString(temp);
            a /= 2;
        }
        if(a == 1){
            bin += Integer.toString(a);
        }

        //System.out.println(bin);

        int b = Integer.parseInt(bin);
        int c = bin.length();


        while(c != 0){
            int temp = b % 10;
            binary += Integer.toString(temp);
            b /= 10;
            c--;
        }

        System.out.println(binary);
    }
}
