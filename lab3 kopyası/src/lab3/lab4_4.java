package lab3;

public class lab4_4 {


			 public enum Rank {
			     ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
			 }

			 public static void main(String[] args) {
			    
			     Rank highCard, faceCard, card1, card2;

			  
			     highCard = Rank.ACE;// rank git ace al
			     faceCard = Rank.QUEEN;
			     card1 = Rank.FOUR;
			     card2 = Rank.SEVEN;

			     System.out.println("A blackjack hand: " + highCard.name().toLowerCase() + " and " + faceCard.name().toLowerCase());

			     
			     int card1Val = card1.ordinal() + 1; //0 dan başlar +1 ile kendi değeri olan 4 alır ordinalla değeri alır
			     int card2Val = card2.ordinal() + 1;//0 dan başlar +1 ile kendi değeri olan 7 alır

			      System.out.println("A two card hand: " + card1.name().toLowerCase() + " and " + card2.name().toLowerCase());
			     System.out.println("Hand value: " + (card1Val + card2Val));
			 }
			
	}


