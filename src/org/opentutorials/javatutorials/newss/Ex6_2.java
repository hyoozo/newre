package org.opentutorials.javatutorials.newss;

class Tv{
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --  channel;
    }
}
public class Ex6_2 {
    
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t2 = t1;
        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");

        t1.channel = 6;
        System.out.println("t1의 channel값을 6으로 변경하였습니다.");

        t1.channelDown();
        System.out.println("t1의 channel값은"+t1.channel+"입니다.");
        System.out.println("t2의 channel값은"+t2.channel+"입니다.");

        
    }
    
}