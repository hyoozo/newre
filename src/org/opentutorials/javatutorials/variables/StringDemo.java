package org.opentutorials.javatutorials.variables;

public class StringDemo {
    public static void main(String[] args) {
        for (int k = 1; k <6; k++){
            for(int h = 5; h > k; h--){
                System.out.print(" ");
            }
            for(int h = 1; h <= k*2-1; h++){
                System.out.print("*");
            }
            System.out.println();
         } 
        for(int k = 4; k > 0; k--){
            for(int h = 5; h > k; h--){
                System.out.print(" ");
            }
            for(int h = 1; h <= k*2-1; h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
