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

import java.io.*;

public class LoadData {
    
    public static void loadFile() throws IOException{
        
        BufferedReader dataIn;
        dataIn = new BufferedReader (new FileReader("datafile.txt"));
        
        int numberofLines = 0;
        
        while (dataIn.readLine() != null){
            numberofLines++;
        }
        
        int numberofPlayers = numberofLines/5;
        
        dataIn = new BufferedReader (new FileReader("datafile.txt"));
        
        for (int i = 0; i < numberofPlayers; i++){
            String playerName = dataIn.readLine();
            int highScore = Integer.parseInt(dataIn.readLine());
            int lowScore = Integer.parseInt(dataIn.readLine());
            String temporary = dataIn.readLine();
            String [] temporaryArray = temporary.split(",");
            int hightoLow[] = new int [temporaryArray.length];
            int lowtoHigh[] = new int [temporaryArray.length];
            
            for (int j = 0; j < hightoLow.length; j++){
                hightoLow[j] = Integer.parseInt(temporaryArray[j]);
            }
            
            for (int j = 0; j < lowtoHigh.length; j++){
                lowtoHigh[j] = Integer.parseInt(temporaryArray[j]);
            }
            
            
            MathSumPlayerInfo.playerDatabase[i] = new Player(playerName, highScore, lowScore, hightoLow,hightoLow);
            
        }
        
    }
    
}
