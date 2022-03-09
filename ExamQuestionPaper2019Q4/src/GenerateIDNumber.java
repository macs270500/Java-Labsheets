import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GenerateIDNumber {
    //Creates the frame
    static JFrame frame = new JFrame("Generate ID Number");
    //Creates the panel to hold the components
    static JPanel panel = new JPanel( );
    //Creates the labels to identify the text fields
    static JLabel FnameL, LnameL, DOBL;
    //Creates the text fields to enter the data
    static JTextField txtFirstName, txtLastName, txtDay, txtMonth, txtYear, txtIDNum;
    //Creates the buttons
    static JButton btnGenerateIDNum, btnReset;

    public GenerateIDNumber() {

        //initialization of the labels
        FnameL = new JLabel("First Name:");
        LnameL = new JLabel("Last Name:");
        DOBL = new JLabel("Date of Birth:");

        //initialization of the text fields
        txtFirstName = new JTextField(25);
        txtLastName = new JTextField(25);
        txtDay = new JTextField("Day", 2);
        txtMonth = new JTextField("Month", 2);
        txtYear = new JTextField("Year", 2);
        txtIDNum = new JTextField(25);

        //initialization of the buttons
        btnGenerateIDNum = new JButton("Generate ID Number");
        btnReset = new JButton("Reset");

        //Output textField settings
        txtIDNum.setEditable(false);

        //Adding color to the text fields
        txtDay.setForeground(Color.LIGHT_GRAY);
        txtMonth.setForeground(Color.LIGHT_GRAY);
        txtYear.setForeground(Color.LIGHT_GRAY);

        //Buttons action listeners
        //Generate the random number based on the inputs given
        btnGenerateIDNum.addActionListener(e -> {
            try {
                //initialization of the variables to be used
                String lastname = txtLastName.getText( );
                char initial = lastname.charAt(0);
                int day = Integer.parseInt(txtDay.getText( ));
                int month = Integer.parseInt(txtMonth.getText( ));
                int year = Integer.parseInt(txtYear.getText( ));

                String Day;
                String Month;
                String Year;

                //Checks if the days are single digit or double digits
                if (day > 0 && day <= 9) {
                    Day = "0" + day;
                } else {
                    Day = String.valueOf(day);
                }

                //Checks if the months are single digit or double digits
                if (month > 0 && month <= 9) {
                    Month = "0" + month;
                } else {
                    Month = String.valueOf(month);
                }

                //retrieves the last 2 values of the year
                Year = String.valueOf(year).substring(2);

                //creates an array to save the random numbers
                int[] rand = new int[7];

                //generating and saving the random numbers
                for (int i = 0; i < 7; i++) {
                    rand[i] = (int) (Math.random( ) * (9 + 1) + 0);
                }

                //Appending the random numbers
                StringBuilder random = new StringBuilder( );
                for (int i = 0; i < 7; i++) {
                    random.append(rand[i]);
                }

                //Prints the generated Identification number
                txtIDNum.setText(String.valueOf(initial).toUpperCase( ) + Day + Month + Year + random);

            } catch (StringIndexOutOfBoundsException SIOOBE) {
                JOptionPane.showMessageDialog(null, "Year should contain 4 characters", "Error", JOptionPane.ERROR_MESSAGE);

            }
        });

        //Resets all the text fields
        btnReset.addActionListener(e -> {
            txtFirstName.setText("");
            txtLastName.setText("");
            txtDay.setText("Day");
            txtMonth.setText("Month");
            txtYear.setText("Year");
            txtIDNum.setText("");

            txtDay.setForeground(Color.LIGHT_GRAY);
            txtMonth.setForeground(Color.LIGHT_GRAY);
            txtYear.setForeground(Color.LIGHT_GRAY);
        });

        //Adding Focus Listeners to the text fields
        txtDay.addFocusListener(new FocusAdapter( ) {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtDay.getText( ).trim( ).equals("Day")) {
                    txtDay.setText("");
                }
                txtDay.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtDay.getText( ).trim( ).equals("")) {
                    txtDay.setText("Day");
                    txtDay.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        txtMonth.addFocusListener(new FocusAdapter( ) {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtMonth.getText( ).trim( ).equals("Month")) {
                    txtMonth.setText("");
                }
                txtMonth.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtMonth.getText( ).trim( ).equals("")) {
                    txtMonth.setText("Month");
                    txtMonth.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        txtYear.addFocusListener(new FocusAdapter( ) {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtYear.getText( ).trim( ).equals("Year")) {
                    txtYear.setText("");
                }
                txtYear.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtYear.getText( ).trim( ).equals("")) {
                    txtYear.setText("Year");
                    txtYear.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        //settings of the panel
        panel.setLayout(new FlowLayout( ));

        //Adding components to the panel
        panel.add(FnameL);
        panel.add(txtFirstName);
        panel.add(LnameL);
        panel.add(txtLastName);
        panel.add(DOBL);
        panel.add(txtDay);
        panel.add(txtMonth);
        panel.add(txtYear);
        panel.add(btnGenerateIDNum);
        panel.add(txtIDNum);
        panel.add(btnReset);

        //Adding components to the frame
        frame.add(panel);

        //settings of the frame
        frame.setSize(new Dimension(300, 250));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}