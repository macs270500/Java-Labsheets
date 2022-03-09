package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {
    private JComboBox imagesJComboBox;
    private JLabel label;

    private static final String[] names={"ic1.jpg","ic2.jpg","ic11.JPG","ic22.JPG"};
    private Icon[] icons = {
            new ImageIcon(getClass( ).getResource(names[0] )),
            new ImageIcon(getClass( ).getResource(names[1] )),
            new ImageIcon(getClass( ).getResource(names[2] )),
            new ImageIcon(getClass( ).getResource(names[3] )),
    };

    public ComboBoxFrame(){
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox( names );
        imagesJComboBox.setMaximumRowCount(3);

        imagesJComboBox.addItemListener(
                new ItemListener( ) {
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange()==ItemEvent.SELECTED){
                        label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );
        add(imagesJComboBox);
        label = new JLabel( icons[0] );
        add(label);
    }
}
