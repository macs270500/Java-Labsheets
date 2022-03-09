package com.company;

import javax.swing.*;

public class HelloWorldFrame extends JFrame {

    public static void main(String[] args) {
	new HelloWorldFrame();
    }
    HelloWorldFrame(){
        JLabel jlbHelloWorld = new JLabel("Hello World!");
        add(jlbHelloWorld);
        this.setSize(200,100);
        setVisible(true);
    }
}
