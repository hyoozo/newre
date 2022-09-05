package org.opentutorials.javatutorials.newss;

public class Ex6_16 {

    public static void change(String straaa){ // String straaa = "ABC123";
        straaa += "456";  //ABC123456
        System.out.println("After:" + straaa);
    } //straaa 소멸 없어져 

    public static void main(String[] args) {
        String str = "ABC123";
        String straaa = "";
        System.out.println(str);
        change(str);

        System.out.println("After:" + straaa);



    } 
    
}
