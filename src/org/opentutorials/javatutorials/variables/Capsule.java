package org.opentutorials.javatutorials.variables;


class Capsule {
     private int num = 0;

     public int getNum() {
        return num;
     }; 

     public void setNum(int a) {
        this.num = a;
    }

}

class Gugudan {
    

    public void cal() {
        for (int i = 1; i < 10; i++) {
            for (int y = 1; y < 10; y++) {
                System.out.println(i + " * " + y + " = " + (i*y));
            }


        }
        
    }
}



class A {
    public static void main(String[] args) {
        Gugudan a = new Gugudan();
        a.cal();

    }
}

