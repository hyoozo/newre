package org.opentutorials.javatutorials.newss;
import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("(4) +5");
            System.out.println("원하는 메뉴 (1~4)를 선택하세요. (종료 : 0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1<=menu && menu<=4)){
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }
            for(;;){
                System.out.print("계산할 값을 입력하세요. (계산종료 :0, 전체종료:99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num==0)
                    break;
                if(num==99)
                    break outer;
                switch(menu) {
                    case 1:
                        System.out.println("result="+num*num);
                        break;
                    case 2:
                        System.out.println(("result="+Math.sqrt(num)));
                        break;
                    case 3:
                        System.out.println(("result="+Math.log(num)));
                        break;   
                    case 4:
                        System.out.println("result="+(num+5));
                        break;
                }
            }
            }
        }
}
