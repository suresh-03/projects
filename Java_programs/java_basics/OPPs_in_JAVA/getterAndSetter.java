package java_basics.OPPs_in_JAVA;


//getter and setter is a methods used to access hidden data by outside class

class rectangle{
    private int length,width;

    //getter methods

    int getLength(){
        return length;
    }

    int getWidth(){
        return width;
    }

    //setter methods

    void setLength(int l){
        if(l > 0){
            length = l;
        }
        else{
            length = 0;
        }
    }

    void setWidth(int w){
        if(w > 0){
            width = w;
        }
        else{
            width = 0;
        }
    }

    int area(){
        return (length * width);
    }
    
}

public class getterAndSetter {
    public static void main(String[] args) {
        rectangle o1 = new rectangle();

        // o1.length = 10; it is not possible because the property length is private(hidden)

        // we can access it by getter and setter methods

        // setter
        o1.setLength(10); 
        o1.setWidth(5);
        System.out.println("area of the rectangle: " + o1.area());

        //getter
        System.out.println("length of rectangle: " + o1.getLength());
        System.out.println("width of rectangle: " + o1.getWidth());
        
    }
}
