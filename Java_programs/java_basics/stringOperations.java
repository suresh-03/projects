package java_basics;

public class stringOperations {
    public static void main(String[] args) {
        String s1 = "suresh";
        String s2 = "kumar";

        System.out.println("hashcode of s1 : " + s1.hashCode());
        System.out.println("hashcode of s2 : " + s2.hashCode());
        System.out.println("equals : " + s1.equals(s2));
        System.out.println("equals (ignore case) : " + s1.equalsIgnoreCase(s2));
        System.out.println("uppercase of s1 : " + s1.toUpperCase());
        System.out.println("lowercase of s2 : " + s2.toLowerCase());
        System.out.println("replacing : " + s2.replace("Suresh", "kumar"));
        System.out.println("starting of s1 : " + s1.startsWith("su"));
        System.out.println("ending of s2 : " + s2.endsWith("ar"));
        System.out.println("contains : " + s1.contains("ur"));
        System.out.println("is s1 empty? : " + s1.isEmpty());
        System.out.println("substring of s1 : " + s1.substring(0));
        System.out.println("substring of s2 : " + s2.substring(0, 3));

        //string to character array

        char[] carray = s1.toCharArray();
        
        for(char a : carray){
            System.out.print(a + " ");
        }

        System.out.println();

        //trim in string

        String s = " suresh ";

        System.out.println("before trim:" + s);
        System.out.println("after tirm:" + s.trim());
        System.out.println("length before trim: " + s.length());
        System.out.println("length after trim: " + s.trim().length());


    }   
}
