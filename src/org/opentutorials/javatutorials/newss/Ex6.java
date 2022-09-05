package org.opentutorials.javatutorials.newss;

public class Ex6{
    public static void main(String[] args) {
        Study s = new Study();
        s.name = "hong gle donh";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("name:" + s.name);
        System.out.println("Total:" + s.getTotal());
        System.out.println("Average:" + s.getAerage());
    }
}
class Study{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Study(){};

    Study(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    float getTotal(){
        return kor+eng+math;
    }
    float getAerage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
    } 
    public String info() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAerage();
    }
}
