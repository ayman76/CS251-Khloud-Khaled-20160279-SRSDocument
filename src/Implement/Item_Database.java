package Implement;

import java.util.Vector;





public class Item_Database  {
	
	public Vector<Item> Data;
	public Item_Database()
	{
		Data = new Vector<Item>();

	}

	
	
  public void Check_cat(String name)
  { for(int i=0;i<Data.size();i++){

   if(Data.elementAt(i).Category.equals(name))
       { System.out.print("Your category is "+ Data.elementAt(i).Category); break;}
    
   else
       System.out.print("Wrong category");break;}

      
 
      
  }
    
    
          
            
    }
