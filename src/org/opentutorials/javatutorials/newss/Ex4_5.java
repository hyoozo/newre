package org.opentutorials.javatutorials.newss;

public class Ex4_5 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;

        for (int i = 1; i <= 6; i++ ){
            for (int y = 1; y <= 6; y++){
                
                sum = i + y;

                if(sum==6){
                    cnt++;
                }
                 
            }
        }

        System.out.println(cnt);
    }
}
