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
        System.out.print("done");
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
    
}
