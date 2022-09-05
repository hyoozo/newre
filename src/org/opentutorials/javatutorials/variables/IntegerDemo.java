package org.opentutorials.javatutorials.variables;
import java.util.Scanner;
public class IntegerDemo {
    public static void main(String[] args) {

        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            for(int i = 1; i < 10; i++){
                System.out.println(number + "x" + i + "=" + (number*i));
            }
            System.out.println("구구단 끝!");
            scanner.close();
            } 
        }
    
