import java.util.Arrays;

public class definedStringArray {
    public static void main(String[] args) {
        //creating string array object
        String[] names = new String[3];

        names[0] = "suresh";
        names[1] = "sharadha";
        names[2] = "saravanan";

        //converting array to string for print purpose
        System.out.println(Arrays.toString(names));

        //print using for loop
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
