package com.company;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Administrator {

    public Staff staff;
    public Administrator() throws ParseException {
        staff = new Staff("0001","MACS","123456789","27/05/00",
                "Silicon Valley,California",59998999,"Male");
    }

}
