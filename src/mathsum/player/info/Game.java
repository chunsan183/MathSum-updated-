/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsum.player.info;

/**
 *
 * @author studentadmin
 */
import java.util.Random;
import java.util.Scanner;
public class Game {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("Welcome to the Math Game! You will be presented with a total of 12 questions, beginning with 6 addition/subtraction questions followed by 6 multiplication/division questions.");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("The point system works as follows:\n - One point added for every addition question answered correctly\n - Two pointsadded for every subtraction question answered correctly\n - Three points added for every multiplication questions answered correctly\n - Four points added for every division question answered correctly\n - One point deducted for every question answered incorrectly");
    System.out.println("");  
    int points = 0;
    
    Random rand = new Random();
    
    for (int i = 0; i <= 5; i++){
        
        int rand_int1 = rand.nextInt(100);
            rand_int1 += -50;
            
        int rand_int2 = rand.nextInt(100);
            rand_int2 += -50;
            
        int additionorSubtraction = rand.nextInt(2);
            
            if (additionorSubtraction == 0){
                System.out.println("What is " + rand_int1 + "+" + rand_int2);
                Scanner add = new Scanner(System.in);
                int answer = add.nextInt();
                int correctAnswer = rand_int1 + rand_int2;
                
                if (answer == correctAnswer){
                    System.out.println("You are correct!");
                    points++;
                    System.out.println("Point Total: " + points);
                }
                
                else {
                    System.out.println("You are WRONG!");
                    points--;
                    System.out.println("The correct answer is " + correctAnswer);
                    System.out.println("Point Total: " + points);
                }
            }
            else {
                System.out.println("What is " + rand_int1 + "-" + rand_int2);
                    Scanner subtract = new Scanner(System.in);
                    int answer = subtract.nextInt();
                    int correctAnswer = rand_int1 - rand_int2;
                
                if (answer == correctAnswer){
                    System.out.println("You are correct!");
                    points+= 2;
                    System.out.println("Point Total: " + points);
                }
                
                else {
                    System.out.println("You are WRONG!");
                    points-= 1;
                    System.out.println("Point Total: " + points);
                }
                
            }   
            
            }
    
        int numberofRounds = 0;
        while (numberofRounds < 6){
        
            int rand_int1 = rand.nextInt(100);
            rand_int1 += -50;
            
            int rand_int2 = rand.nextInt(100);
            rand_int2 += -50;
            
            if (rand_int1 % rand_int2 == 0){
            
            int divisionorMultiplication = rand.nextInt(2);
            
                if (divisionorMultiplication == 0){
                System.out.println("What is " + rand_int1 + "x" + rand_int2);
                Scanner multiply = new Scanner(System.in);
                int answer = multiply.nextInt();
                int correctAnswer = rand_int1 * rand_int2;
                
                    if (answer == correctAnswer){
                        System.out.println("You are correct!");
                        points+= 3;
                        System.out.println("Point Total: " + points);
                    }
                
                    else {
                        System.out.println("You are WRONG!");
                        points--;
                        System.out.println("The correct answer is " + correctAnswer);
                        System.out.println("Point Total: " + points);
                    }
                    numberofRounds++;
                }
            
                else {
                    System.out.println("What is " + rand_int1 + "/" + rand_int2);
                    Scanner divide = new Scanner(System.in);
                    int answer = divide.nextInt();
                    int correctAnswer = rand_int1 / rand_int2;
                
                    if (answer == correctAnswer){
                        System.out.println("You are correct!");
                        points+= 4;
                        System.out.println("Point Total: " + points);
                    }
                
                    else {
                        System.out.println("You are WRONG!");
                        points--;
                        System.out.println("The correct answer is " + correctAnswer);
                        System.out.println("Point Total: " + points);
                    }
                    numberofRounds++;
                }
            }
        }
    }
}
    
