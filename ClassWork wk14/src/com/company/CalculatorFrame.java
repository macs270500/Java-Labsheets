package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame{

    private JPanel NPanel;
    private JPanel SPanel;

    JTextField aTxt;

    JButton[] btnArray = new JButton[16];
    String[] btnNames =  {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};

    public CalculatorFrame(){
        NPanel = new JPanel();
        SPanel = new JPanel();

        aTxt = new JTextField( 400 );

        ButtonHandler handler = new ButtonHandler();
        NPanel.add(aTxt);
        for (int i = 0; i<btnArray.length;i++){
            String buttonText = btnNames[i];
            JButton abtn = new JButton( buttonText );
            btnArray[i] = abtn;
            SPanel.add(btnArray[i]);
        }
        SPanel.setLayout(new GridLayout( 4,4 ));
        setTitle("Calculator");
        getContentPane().add(NPanel,BorderLayout.NORTH);
        getContentPane().add(SPanel,BorderLayout.CENTER);
    }
    class ButtonHandler  implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public static void main(String[] args) {
        CalculatorFrame calculatorFrame = new CalculatorFrame();
        calculatorFrame.setVisible(true);
        calculatorFrame.setSize(400,400);
        calculatorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
