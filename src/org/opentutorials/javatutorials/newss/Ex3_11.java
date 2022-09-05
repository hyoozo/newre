package org.opentutorials.javatutorials.newss;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        // System.out.println(pi);
        // System.out.println(pi*1000);
        // System.out.println(Math.round(pi*1000)/1000);
        // System.out.println(Math.round(pi*1000)/1000.0);  //3.142

        System.out.println(pi*1000);
        System.out.println((int)(pi*1000));
        System.out.println((int)(pi*1000)/1000);
        System.out.println((int)(pi*1000)/1000.0); //3.141 반올림 안함

    //     double shortPi = Math.round(pi * 1000) / 1000.0;
    //     System.out.println(shortPi);
     }   
}

  