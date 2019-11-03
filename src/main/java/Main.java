
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class Main {
    public static void main(String[] args) {

    double length = 0, width = 0, area1 = 0, length2 = 0, width2 = 0, area2=0;

    Scanner keyboard = new Scanner(System.in);

    System.out.print ("Enter the length of the first tract of land: ");
    length = keyboard.nextDouble();
    
    System.out.print ("Enter the width of the first tract of land: ");
    width = keyboard.nextDouble();

    LandTract land1 = new LandTract(length,width);

    area1=LandTract.findArea(length,width);

    land1.setArea(area1);

    System.out.print ("\nEnter the length of the second tract of land: ");
    length2 = keyboard.nextDouble();
    
    System.out.print ("Enter the width of the second tract of land: ");
    width2 = keyboard.nextDouble();    

    LandTract land2 = new LandTract(length2,width2);

    area2=LandTract.findArea(length2,width2);

    land2.setArea(area2);
    
    System.out.println("\nFirst land track: \n" + land1.toString());
    System.out.println("\nSecond land track: \n" + land2.toString());
    
    if (land1.equals(land2))
          System.out.println("\nBoth areas are the same.");
        else
          System.out.println("\nThe areas are different.");
          
          
          
    }
}