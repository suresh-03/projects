package java_basics;

public class stringBufferAndBuilderInJava {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("suresh");
        s.append(" kumar");
        System.out.println(s);
        s.insert(0, "hello ");
        System.out.println(s);
        System.out.println(s.length());
        s.replace(0, 5, "hiiii");
        System.out.println(s);
        s.delete(0, 5);
        System.out.println(s);
        System.out.println(s.capacity());//default 16, if increase it increase by [{old capacity * 2} + 2]


        //StringBuilder in java

        StringBuilder ss = new StringBuilder("hello");
        ss.append(" suresh");
        ss.insert(12, " kumar");
        System.out.println(ss);
        ss.reverse();
        System.out.println(ss);
        System.out.println(ss.charAt(5));
        ss.setCharAt(0, 'S');
        System.out.println(ss);

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// default 16

    }
}
