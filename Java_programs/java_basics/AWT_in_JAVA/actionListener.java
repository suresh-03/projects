package java_basics.AWT_in_JAVA;

import java.awt.*;
import java.awt.event.*; // this package is used to access the action listener

// action listener - this is used to perform the actions done by the users

class app extends Frame implements ActionListener{


    public app(){
        super("hello bro");
        setVisible(true);
        setLayout(null);
        setSize(1200,500);
    
        Button b = new Button("click");
        b.setBounds(900, 550, 200, 100);
        add(b);

        this.addWindowListener(new WindowAdapter(){

        });
    }
   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

public class actionListener {
    
}
