
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class payment {
      private String cardID;
    
    public payment(String id){
        setcardID(id);
    }
    String getcardID(){
        return cardID;
    }
   public void setcardID(String i){
          if(i.length() == 16) {
           boolean cardid = true ;
}
   }
   /// vared kardan email va pass
     /*Scanner input = new Scanner(System.in);
    try{
        String m = input.nextLine();
        if(m.contains("@")&& m.endsWith(".com")){
            System.out.print("correct");
            
    }else
            System.out.print("not coorect");
    }catch(Exception e){
            System.out.print("invalid");
            
            }
   
    }*/
}
