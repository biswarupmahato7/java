package Opps;

import Opps.student;


public class opps {
    
    // public static class Student{
    //     String name;
    //     int roll;
    //     double percentage;
    // }
    public static void fun(int x,String name){
        System.out.println(x+" "+name);
       
    }
    // public static void fun2(Student x){
    //     System.out.println(x.name+" "+x.roll);

    // }
    // public static void change(Student s){
       
    //     s.name="Bipul";
    //     s.roll=44;
    // }
    public static void main(String[] args) {

        //Student s1=new Student();
        student s1=new student();

        // s1.name="Biswarup";
        // s1.roll=45;
        // s1.percentage=85.6;

        //System.out.println(s1.name+" "+s1.roll+" "+s1.percentage);
       //fun(s1.roll, s1.name);
        //fun2(s1);
        // s1.name="Ronaldo";
        // s1.roll=7;
        // System.out.println(s1.name+" "+s1.roll);
        // change(s1);
        // System.out.println(s1.name+" "+s1.roll);



        System.out.println(s1.name+" "+s1.getroll()+" "+s1.getpersentage());

        s1.name="Biswarup";
        s1.setpercentage(80.9);
        s1.setroll(45);

        System.out.println(s1.name+" "+s1.getpersentage()+" "+s1.getroll());
        
    }
    
}
