package java_basics.AWT_in_JAVA;

import java.awt.*;


class app extends Frame{ // new class is created to use the frame
    public app(){
        super("hello bro");
        setVisible(true);
        setLayout(null);
        setSize(1200,500);

        Button b = new Button("click");
        b.setBounds(900, 550, 200, 100);
        add(b);
    }
}

public class frame_Button_M3 {
    public static void main(String[] args) {
        app frm = new app();
    }
}
