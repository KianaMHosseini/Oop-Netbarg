/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Searchs {
     public void parseFile(String fileNames,String searchStrs) throws FileNotFoundException{
        Scanner scans = new Scanner(new File(fileNames));
        while(scans.hasNext()){
            String line = scans.nextLine().toLowerCase();
            if(line.contains(searchStrs)){
                System.out.println(line);
            }
        }
     }
}


