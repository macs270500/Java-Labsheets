package com.company;

import javax.swing.*;
import java.awt.*;

public class ButtonTest {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    ButtonFrame buttonFrame = new ButtonFrame();
    buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buttonFrame.setSize(450,160);
    buttonFrame.setVisible(true);
    }
}
