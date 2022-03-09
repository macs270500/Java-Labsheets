package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JButton plainJButton;
    private JButton fancyJButton1, fancyJButton2;

    public ButtonFrame(){
        super("Testing Buttons");
        setLayout(new FlowLayout());
//        plainJButton = new JButton("Plain Button");
//        add(plainJButton);

        Icon bug1 = new ImageIcon( getClass().getResource("ic1.jpg") );
        Icon bug2 = new ImageIcon( getClass().getResource("ic22.JPG"));
        fancyJButton1 = new JButton( "FancyButton 1",bug1 );
        fancyJButton1.setRolloverIcon(bug2);
        add(fancyJButton1);

        Icon bug3 = new ImageIcon( getClass().getResource("ic2.jpg") );
        Icon bug4 = new ImageIcon( getClass().getResource("ic11.JPG"));
        fancyJButton2 = new JButton( "FancyButton 2",bug3 );
        fancyJButton2.setRolloverIcon(bug4);
        add(fancyJButton2);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton1.addActionListener( handler );
        fancyJButton2.addActionListener( handler );
//        plainJButton.addActionListener(handler);
    }
    private class  ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s",event.getActionCommand()));
        }
    }
}
