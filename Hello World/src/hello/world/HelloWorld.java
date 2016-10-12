/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author acbrust0
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       
        ArrayList<String> lines = new ArrayList<>();
        FileReader F = new FileReader(args[0]);
        BufferedReader BR = new BufferedReader(F);
        String line = "";
        
        while((line = BR.readLine()) != null)
        {
            lines.add(line);
        }
        
        for(String s: lines)
        {
            System.out.printf("  -->%s%n",s);
        }
        
        
    }
    
}
