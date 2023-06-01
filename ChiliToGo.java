// Project 1, 5/22/2023, ChiliToGo.java, Stacey Chaiken

import java.util.Scanner;

public class ChiliToGo
{	

   public static void main(String[] args)
   {
      final int ADULT_MEAL = 7, CHILDREN_MEAL = 4;
      int choiceAdu, choiceChi, total;
      String choiceAduChar, choiceChilChar;
      Scanner input = new Scanner(System.in);
     {
     		System.out.println("***************************************");
			System.out.println("Welcome to Chili To Go Ordering System!");
			System.out.println("***************************************");
		} // end of intro() method
      
      //user input for adult meals
      System.out.println("Please enter the amount of Adult meals: ");
      choiceAduChar = input.nextLine();
      choiceAdu = Integer.parseInt(choiceAduChar);
      
      //user input for children's meal
      System.out.println("Please enter maount of Children meals: ");
      choiceChilChar = input.nextLine();
      choiceChi = Integer.parseInt(choiceChilChar);
      
      //computing totals
      choiceAdu *= ADULT_MEAL;
      choiceChi *= CHILDREN_MEAL;
      total = choiceAdu + choiceChi;
      
      //displaying totals
      System.out.println("Total Adults meals: " + choiceAdu + 
                         "\nTotal Childrens meals: " + choiceChi +
                         "\nTotal balance: " + total);
   }//end main

}//end class

