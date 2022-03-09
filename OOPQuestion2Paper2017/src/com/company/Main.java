package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee( "Emp1","HR" );
        Employee e2 = new Employee( "Emp2","Finance" );
        Employee e3 = new Employee( "Emp2","Store" );

        System.out.println("Count using e1: "+e1.count );
        System.out.println("Count using e2: "+e2.count );
        System.out.println("Count using e3: "+e3.count );


//        try {
//            Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\OOPQuestion2Paper2017\\src\\com\\company\\employees.txt"));
//            File prepaid = new File("prepaid.txt");
//            File postpaid = new File("postpaid.txt");
//
//            while (sc.hasNext( )) {
//
//                String data = sc.nextLine( );
//                String[] brokenData = data.split(" ");
//
//                FileWriter fw;
//                if (brokenData[5].equals("Prepaid")) {
//                    fw = new FileWriter(prepaid, true);
//                    for (int i = 0; i < 5; i++) {
//                        fw.write(brokenData[i]+" ");
//                    }
//                }else{
//                    fw = new FileWriter(postpaid, true);
//                    for (int i = 0; i < 5; i++) {
//                        fw.write(brokenData[i]+" ");
//                    }
//                }
//                fw.write("\n");
//                fw.close( );
////                System.out.println(data);/
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace( );
//        } catch (IOException e) {
//            e.printStackTrace( );
//        }

//        int[] arr = {10,20,30,40,50};
//        int count = 0;
//        while(count< arr.length){
//            System.out.println("arr["+count+"] = "+arr[count])
//            ;
//            count++;
//        }
    }
}
