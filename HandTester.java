/*this is to test the hand class to make sure it is working correctly
 * Created by Foster Stulen on 4/23/18
 */
import java.util.Scanner;

public class HandTester
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    System.out.println("Please enter the limit amout of the cards");
    int limit=in.nextInt();
    Hand myHand= new Hand(limit);
    
    
    //testing cards
    Card a=new Card(2,12);
    Card b=new Card(4,14);
    Card c= new Card(1,6);
    Card d= new Card(3,12);
    Card e= new Card(3,11);
    Card f= new Card(2,5);
     //testing the booleans to make sure they are working correctly
    System.out.println("Checking if hand is empty");
    System.out.println(myHand.isEmpty());
    System.out.println("Checking if hand is full");
    System.out.println(myHand.isFull());
//testing to make sure that they are displaying and that the limit is being followed
    myHand.addCard(a);
    System.out.println(myHand.toString());
    myHand.addCard(b);
    System.out.println(myHand.toString());
    //testing to see if the empty still works
    System.out.println("Checking if hand is empty");
    System.out.println(myHand.isEmpty());
    myHand.addCard(c);
    System.out.println(myHand.toString());
    myHand.addCard(d);
    System.out.println(myHand.toString());
    myHand.addCard(e);
    System.out.println(myHand.toString());
    myHand.addCard(f);
    System.out.println(myHand.toString());
    
//testing to see if they full is working correctly
    System.out.println("Checking if hand is full");
    System.out.println(myHand.isFull());
    myHand.removeCard();
    
    
    myHand.getHand();
    System.out.println(myHand.toString());
    myHand.removeCard(c);
    myHand.getHand();
    System.out.println(myHand.getCount()+" cards in the hand now");
    
    myHand.addCard(c);
    myHand.addCard(f);
    
    myHand.sortByRank();
     System.out.println(myHand.toString());
    myHand.sortBySuit();
    System.out.println(myHand.toString());
    myHand.reset();
    System.out.println("Testing if the rest worked (so correct if it equals true) "+myHand.isEmpty());
    System.out.println(myHand.toString());
  }
}