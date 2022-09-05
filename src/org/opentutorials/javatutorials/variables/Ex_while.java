package org.opentutorials.javatutorials.variables;

import java.util.Scanner;

public class Ex_while {
    public static void main(String[] args) {
        System.out.println("카운트를 입력하세요.");
        try (Scanner scaa = new Scanner(System.in)) {
            int balsa = scaa.nextInt();

            System.out.println("카운트 다운을 시작합니다..");

            while(balsa >= 1){
                System.out.println(balsa+"!");
                balsa--;
            }
        }
        System.out.println("발사!");
        }
    }

