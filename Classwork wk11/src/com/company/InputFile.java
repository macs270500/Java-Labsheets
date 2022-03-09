package com.company;
import java.io.FileNotFoundException;
import java.util.Formatter;
//Paul Gavin m 78 88 85 696-2315
public class InputFile {
    public static void write() {
        try {
        Formatter outfile = new Formatter("student.txt");
        outfile.format("%s %1s %d %d %d %8s\n","Madvi Pen","F",45,56,34,"752-2222");
        outfile.format("%s %1s %d %d %d %8s\n","Paul Gavin","M",78,88,85,"696-2315");
        outfile.format("%s %1s %d %d %d %8s\n","John Smith","M",85,88,90,"696-2642");
        outfile.format("%s %1s %d %d %d %8s\n","Mary Jane","F",88,95,90,"696-2642");
        outfile.format("%s %1s %d %d %d %8s\n","William Glasgow","M",60,48,20,"696-2642");
        outfile.format("%s %1s %d %d %d %8s\n","Illeana Williams","F",63,10,70,"696-2642");
        outfile.close();
            } catch(FileNotFoundException fnfe) {
                System.out.println("File Not Found");
            }catch(SecurityException se){
                System.out.println("No Permission");
            }
    }
}
