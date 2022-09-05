package org.opentutorials.javatutorials.newss;

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
public class Ex6_3 {
    public static void main(String[] args) {
         System.out.println("Card width="+Card.width);
         System.out.println("Card height="+Card.height);

         Card card1 = new Card();
         card1.kind = "Heart";
         card1.number = 7;

         Card card2 = new  Card();
         card2.kind = "Spade";
         card2.number = 6;

         System.out.println("card1은"+card1.kind+","+card1.number+"이며,크기는"+ Card.width +"," + Card.height);
    }
    
}
