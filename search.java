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


public class search {
     public void parseFile(String fileName,String searchStr) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase();
            if(line.contains(searchStr)){
                System.out.println(line);
            }
        }
    }
     
}

