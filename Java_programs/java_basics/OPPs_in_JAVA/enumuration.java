package java_basics.OPPs_in_JAVA;

// enum - it is like class
// it is used to manage the constant values
// it is just like the struct in c language

public class enumuration {
    enum three{ // enum contains constant values
        LAND,
        SKY,
        SEA
    };
    public static void main(String[] args) {
        three a = three.SEA; // it is the syntax to assign enum values to the variable
        System.out.println(a);

        //enum in the switch case
        switch(a){
            case LAND:
            System.out.println("i am a land");
            break;

            case SKY:
            System.out.println("i am a sky");
            break;

            case SEA:
            System.out.println("i am a sea");
            break;
            
    }

        // enum in enhanced for loop
        for(three b : three.values()){
            System.out.println(b);
        }
}
}
