package org.opentutorials.javatutorials.variables;

public class Star02 {
    public static void main(String[] args) {
        // int n =1;
        // for(int i = 0; i <=5; i++){
        //     for (int j = 0; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     n++;
        // }
        for (int i = 0; i <= 5; i++){
            for ( int j = 0; j < i; j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
    
}
