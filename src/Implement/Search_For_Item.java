package Implement;
import java.util.Scanner;
import java.util.*;
public class Search_For_Item {
     public static String Select_category()
     { Scanner im= new Scanner(System.in);
       String cat;
       cat=im.nextLine();
         
    return cat; }
     public static void Search_For_Item(String b)
     { Vector<Item>I=new Vector<>();
     for(int i=0;i<I.size();i++ )
     { if(I.elementAt(i).getCategory().equals(b))
         System.out.print(I.elementAt(i).getImage1()+I.elementAt(i).getDescription());
     else if(!I.contains(b))
         System.out.print("Not in the database");break;
         
     }}
     
     
     public static void Verify_person(boolean x)
     {if(x==false)
         System.out.print("You have just answered the question wrong you are not the real owner");
     if(x==true)
         System.out.print("You can take it ");
     }
     public static boolean Answer_security_Questions(Vector<String>Sec_quest,Vector<String>Answers)
       {  Scanner input=new Scanner(System.in);
          boolean P=true;
           Vector<String>User_Answer=new Vector<>();
          for(int i=0;i<Sec_quest.size();i++)
          { String Put_answer=input.nextLine();
            User_Answer.add(Put_answer);
          
          }    
          for(int i=0;i<Answers.size();i++)
          { if(!User_Answer.elementAt(i).equals(Answers.elementAt(i)))
                      Verify_person(!P);
          
          }Verify_person(P);
             
           
     return false;}
     
     {



         
     }
  
    
    
}
