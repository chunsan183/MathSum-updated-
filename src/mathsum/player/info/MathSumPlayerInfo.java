/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsum.player.info;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author studentadmin
 */

public class MathSumPlayerInfo {

    public static Player [] playerDatabase = new Player[10];
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        for (int i = 0; i < playerDatabase.length; i++){
            
            playerDatabase[i] = new Player();
            
        }
        LoadData.loadFile();
        
        for (int i = 0; i < playerDatabase.length; i++){
            
            if(playerDatabase[i].getPlayerName().equals("-") == false){
                System.out.println(playerDatabase[i].getPlayerName());
                System.out.println(playerDatabase[i].getHighScore());
                System.out.println(playerDatabase[i].getLowScore());
                System.out.println(Arrays.toString(playerDatabase[i].getHighToLow()));
                System.out.println(Arrays.toString(playerDatabase[i].getLowToHigh()));
            }
            
            else{
                break;
            }
            
        }
        /*
        Random rand = new Random();
        int index = 0;
        char a = 'a';
        
        for (int i = 0; i < playerDatabase.length; i++){
            
            int [] scores = new int [10];
            String playerName = Character.toString(a);
            a++;
            //System.out.println(playerName);
            int highScore = 10;
            int lowScore = 1;
            
            for (int j = 0; j < scores.length; j++){
                
                int randNum = rand.nextInt(36);
                scores[j] = randNum;
                
            }
            
            playerDatabase[i] = new Player(playerName, highScore, lowScore, scores, scores);
            //index++;
        }
        
        int [] scores = new int [10];
        scores = playerDatabase[3].getHighToLow();
        
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " ");
        }
        
        scores = playerDatabase[3].SortHighToLow();
       
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " ");
            
        }
        
        scores = playerDatabase[3].SortLowToHigh();
        System.out.println();
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " ");
        }*/
    }
}