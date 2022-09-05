package org.opentutorials.javatutorials.variables;


public class Star10 {
    public static void main(String[] args) {
        // for(int i = 0; i < 5; i++){

        //     for (int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 5; j > i; j--){
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }
        int i, j, k;
        for(i = 1; i <= 5; i++){
            for(j = 5; j >= i; j--){
                System.out.printf(" ");
            }
            for(k = 1; k <= 2* (i - 1) + 1; k++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    
}
