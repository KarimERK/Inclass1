/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
       
        
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        //This was created in GitHub
        Card eightHrts = new Card("Hearts", 8);
        eightHrts.setSuit("Hearts");
        eightHrts.setValue(8);
        System.out.println("The card is: " + eightHrts.getValue()+ " of " + eightHrts.getSuit());
        
        //New Card created in NetBeans
        Card fourClbs = new Card("Clubs", 4);
        fourClbs.setSuit("Clubs");
        fourClbs.setValue(4);
        System.out.println("The card is: " + fourClbs.getValue()+ " of " + fourClbs.getSuit());
    }
}
