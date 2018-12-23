package Implement;
import java.util.Scanner;
import java.util.*;
public class Search_For_Item {
     public static String Select_category()
     { Scanner im= new Scanner(System.in);
       String cat;
       cat=im.nextLine();
         
    return cat; }
     public static void Search_For_Item(Vector<String> K,Vector<String> answer,Item_Database x,Vector<String>PhoneNum,String b)
     { Scanner mkey=new  Scanner(System.in);
      Vector<String>itemName=new  Vector<String>();
      Vector<String>question=new  Vector<String>();
      Vector<String>answers=new  Vector<String>();
     for(int i=0;i<x.Data.size();i++ )
     { if(x.Data.elementAt(i).Category.equals(b))
     {   itemName.add(x.Data.elementAt(i).item_name);
        question.add(x.Data.elementAt(i).security);
        answers.add(x.Data.elementAt(i).show_security);
        PhoneNum.add(x.Data.elementAt(i).PhoneNum);
    	 System.out.println("Name of Item: " + x.Data.elementAt(i).item_name+"\nItem Description: " +x.Data.elementAt(i).Description);
     }
     }
    	 System.out.println(itemName.elementAt(0));
     System.out.println("Select the item");
     String item_name=mkey.nextLine();
     if(itemName.elementAt(0).equals(item_name))
    	System.out.println("Your item is "+ itemName.elementAt(0));
     K.add(question.elementAt(0));
     answer.add(answers.elementAt(0));
    
    	
    	
    	
    }
     
//     else if(!x.Data.contains(b))
//         System.out.println("Not in the database");break;
         
     
     public  void Verify_person(boolean x)
     {if(x==false)
         System.out.println("You have just answered the question wrong you are not the real owner");
     if(x==true)
         System.out.println("You can take it ");
     }
     public boolean Answer_security_Questions(Vector<String>Answers)
       {
    	 Scanner input=new Scanner(System.in);
          boolean P=true;
           Vector<String>User_Answer=new Vector<>();

           String Put_answer=input.nextLine();
            User_Answer.add(Put_answer);

          for(int i=0;i<Answers.size();i++)
          { if(Answers.elementAt(i).equals(User_Answer.elementAt(i))) {
              return true;
          }
          
          }
          return false;
       }
     
     {



         
     }
  
    
    
}
