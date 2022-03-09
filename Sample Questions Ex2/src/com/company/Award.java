package com.company;

public class Award {
    private static int science;
    private static int humanitiesAndManagement;
    private static int departmental;
    //Accessors
    public int getScience(){return this.science;}
    public int getHumanitiesAndManagement(){return this.humanitiesAndManagement;}
    public int getDepartmental(){return this.departmental;}
    //Mutators
    private void setScience(int marks){this.science = marks;}
    private void setHumanitiesAndManagement(int marks){this.humanitiesAndManagement = marks;}
    private void setDepartmental(int marks){this.departmental = marks;}

    public void Award(int science, int humanitiesAndManagement,int departmental){
        setScience(science);
        setHumanitiesAndManagement(humanitiesAndManagement);
        setDepartmental(departmental);
    }

    public int computeTotal(){
        return getScience()+getHumanitiesAndManagement()+getDepartmental();
    }

    public void displayMarks(){
        System.out.println("Science: "+getScience());
        System.out.println("Humanities and Management: "+getHumanitiesAndManagement());
        System.out.println("Departmental: "+getDepartmental());
    }


}
