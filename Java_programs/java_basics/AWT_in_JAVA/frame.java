package java_basics.AWT_in_JAVA;

import java.awt.*;
import java.awt.event.*;

// frame - it is a inbuild class used to create the frame

// method 1:
public class frame {
    public static void main(String[] args) {
        Frame frm = new Frame("hello");
        frm.setLayout(null);
        frm.setSize(1200,500);
        frm.setVisible(true);
      

        Button btn = new Button("click");
        btn.setBounds(600, 600, 150, 60);
        btn.setVisible(true);
        frm.add(btn);
    }
}
