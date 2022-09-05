package org.opentutorials.javatutorials.variables;

import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, d;
        do{
            System.out.println("출력하는 줄 수를 입력하세요." + "(" + "종료하려면 '0'입력" + ")" );
            a = scan.nextInt();
        }

        while ( a %2 == 0 && a != 0);
        if (a == 0){
            System.out.print("");
        } else{
            b = (a+1/2);
            c = d = b;
            System.out.println();
            
            for (int i = 1; i <= a; i++){
                for (int j = 1; j <= d; j++){
                    if (j < c){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
                if (i < b){
                    c--;
                    d++;
                } else {
                    c++;
                    d--;
                }

            }
        };
        scan.close();
    };

};
