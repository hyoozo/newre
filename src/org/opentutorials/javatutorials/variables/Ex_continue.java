package org.opentutorials.javatutorials.variables;

public class Ex_continue {
    public static void main(String[] args) {
        
        int sum = 0;

        System.out.print("숫자 : ");

        for (int i = 1; i <= 10; i++){
            if(i == 3 || i == 6 || i == 9){
                continue;
            }
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("");
        System.out.println("총합 : " + sum);
    }
    
}
