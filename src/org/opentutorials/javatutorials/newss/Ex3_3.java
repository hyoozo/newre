package org.opentutorials.javatutorials.newss;

public class Ex3_3 {
    public static void main(String[] args) {
        // int num = 456;
        // System.out.println((long)num/100*100.00);
        
        int numOfApples = 123;
        int sizeOfBucket = 10;
        final int numOfBucket = (numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1:0));

        System.out.println("필요한 바구니의 수 :" + numOfBucket);
            // int 간의 이항연산자 결과는 int 이기 때문에 12.5 실수값이 나오지 않는다.
            //그러므로 나머지 연산자 (%)를 이용해서 나눗셈연산에서 나머지가 발생하는지 확인 후 바구니 개수에 1을 더해줘야 한다.
        }
    }
    
