package com.company;

import javax.swing.*;
import javax.swing.JLabel;
class HelloFrame extends JFrame {

    //contructor for HelloWorldFrame
    HelloFrame() {
        super("Hello World Frame");
        JLabel jlbHelloWorld = new JLabel("Hello CA 2 Students",SwingConstants.CENTER);
        add(jlbHelloWorld);
    }
}
public class HelloWorld {
    public static void main (String args[]){
        HelloFrame helloframe = new HelloFrame();
        helloframe.setSize(400, 200);
        helloframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        helloframe.setVisible(true);

    }
}
