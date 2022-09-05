package org.opentutorials.javatutorials.newss;

public class star {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");   // frint 줄바꿈 안함 ! 생각하기!
            }
            System.out.println();
        }
    }
}

class star2 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){     // i를 대입해서 같이 늘어가는 개념
                System.out.print("*");
    }
        System.out.println();
    }       
}
}