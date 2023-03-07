package java_basics.AWT_in_JAVA;

import java.awt.*;
// Frame is the class (inbuild)

public class frame_Button_M2 extends Frame { // frame is inherited by this class

    public frame_Button_M2(){
        super("tutor joes"); // super() is used to set title for the frame
        setVisible(true);
        setLayout(null);
        setSize(1200,500);

        Button but = new Button("click");
        but.setBounds(900, 550, 100, 50);
        add(but);
    }
 
    public static void main(String[] args) {
        frame_Button_M2 frm = new frame_Button_M2(); // creating the object for this own class
                                                     // it is used to call the frame
    }
}
