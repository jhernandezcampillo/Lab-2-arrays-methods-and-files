/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Judith
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] names = new String [80];
        int [] scores = new int [80];
        
        readFile(names, scores, args[0]);
        //System.out.print("done");
        
        output(names, scores);
        
        System.out.println("\n"+"Average: " + scoreAvg(scores) +"\n");
    }
    
    public static void readFile (String [] names, int [] scores, String filename){
        
        try {
            File file = new File(filename); 
            Scanner scan = new Scanner(file);
            int i = 0;
            while(scan.hasNext()){
                names[i] = scan.next();
                
                scores[i] = scan.nextInt();
                
                i++;
                
                        
            }
        }
        catch (FileNotFoundException ex){
            System.out.print("Error");
        }
        
    }
    
    public static void output (String[] nameVar, int[] scoreVar){
        
        for (int i = 0; i < scoreVar.length; i++){
            String nameDisplay = String.format("%-20s %d", nameVar[i], scoreVar[i]);
            System.out.println(nameDisplay);
        }
    }
    
    public static double scoreAvg (int [] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return (double) sum/scores.length;
    }
    
}
