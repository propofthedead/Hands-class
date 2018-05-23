/*This is the hand class to pull the cards to a hand
 * Using a linkedlist to with a cap on how many card there can be per game
 * reated by foster Stulen on 4/23/18 for CSE 271
 */

import java.util.*;


public class Hand
{
  LinkedList<Card> hand= new LinkedList<Card>();
   private int limit=0;
   private int amount=0;
  //gives thehand a limit to how much you can draw
   public Hand(int count)
  {
    limit=count;
  }
  //makes it so the hand checks if its empty or full before adding a card to the list
  public boolean addCard(Card a)
  {
    
   
    if(amount==limit)
    {
      return false;
    }
    else{
     amount++;
      hand.addLast(a);
    return true;
    }
  }
  //retrives the list of cards from the object
  public LinkedList<Card> getHand()
  {
     return hand;
  }
  //checks if the hand is full by checking if the amount is same as the limit
  public boolean isFull()
  {
    if (amount==limit)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //checks if the hand isempty by if the amount is the same as zero
  public boolean isEmpty()
  {
    if(amount==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //prints hand out simply just the cards though
  public void showHand()
  {
    ListIterator<Card> iter= hand.listIterator();
    for (int i=0; i<amount;i++)
    {
      Card a=iter.next();
      System.out.println(a.getRankAsString() +" "+a.getSuitAsString());
    }
  }
  //clears the hand out and zets the amount to zero but keeps the limit the same
  public void reset()
  {
    amount=0;
    hand.clear();
  }
  //removes the first card in your hand
  public void removeCard()
  {
    hand.remove();
    amount--;
  }
  //removes the specific card from your hand
  public void removeCard(Card unwanted)
  {
    ListIterator<Card> iter= hand.listIterator();
    for(int i=0;i<amount;i++)
    {
      Card check=iter.next();
      if(check.getSuit()==unwanted.getSuit() &&check.getRank()==unwanted.getRank())
      {
        iter.remove();
        amount--;
      }
    }
  }
  //sorts the hand by rank
  public void sortByRank()
  {
    //ListIterator<Card> iter= hand.listIterator();
   
    boolean done=false;
    while(done==false)
    {
       int n=0;
    int m=1;
      int flag=0;
    for(int i=1;i<amount;i++)
    {
      
      Card a= hand.get(n);

      Card b= hand.get(m);
      if(a.getRank()>b.getRank())
      {
        Collections.swap(hand, n,m);
        flag++;
      }
      
     // iter.previous();
      n++;
      m++;
    }
    if(flag==0)
    {
      done=true;
    }
    }
  }
  //sorts the hand by suit value spade=1 and diamon=4
  public void sortBySuit()
  {
    //ListIterator<Card> iter= hand.listIterator();
    
    boolean done=false;
    while(done==false)
    {
      int n=0;
    int m=1;
      int flag=0;
    for(int i=1;i<amount;i++)
    {
      
      Card a= hand.get(n);
      
      Card b= hand.get(m);
      
      if(a.getSuit()>b.getSuit())
      {
        //System.out.println("\n \n swap \n \n");
        Collections.swap(hand, n,m);
        flag++;
      }
      else if(a.getSuit()==b.getSuit() && a.getRank()>b.getRank())
      {
        Collections.swap(hand, n,m);
        flag++;
      }
      n++;
      m++;
    }
    if(flag==0)
    {
      done=true;
    }
    }
  }
  //shows your hand and the limit of the hand
  public String toString()
  {
    ListIterator<Card> iter= hand.listIterator();
    String answer= "The cards in your hands are '\n'";
    for(int i=0; i<amount;i++)
    {
      Card a=iter.next();
      answer=answer+a.getSuitAsString()+" "+a.getRankAsString()+"'\n'";
    }
    answer=answer+"The limit to the hand is: "+limit;
    return answer;
  }
  //returns how many cards there are in the hand
  public int getCount()
  {
    return amount;
  }
  
}