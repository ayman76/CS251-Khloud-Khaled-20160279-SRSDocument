package Implement;

import java.util.Vector;

import java.util.Scanner;




public class Item_Database  {
	
	public Vector<Item> Data;
	public Item_Database()
	{
		Data = new Vector<Item>();

	}

	
	 public void Set_elemnt(Vector<String>x)
	    {  Vector<String>hala=new Vector<>();
	        for(int i=0;i<x.size();i++)
	          hala.add(x.elementAt(i));
	        for(int i=0;i<hala.size();i++)
	            System.out.println((i+1)+"-"+hala.elementAt(i));
	    }
  public boolean Check_cat(Vector<String>V,String name)
  { 
	  if(!V.contains(name)) {
	       System.out.println("Wrong category");return false;}
	  
	 else
       { int index = V.indexOf(name);
		 System.out.println("Your category is "+ V.elementAt(index)); return true;}
    

      
 
      
  }
  
  public void save(Item_Database x,Item l)
  {
//		System.out.println("enter number of posts which you post in the system");
		//=new Item();

			x.Data.add(l);
			x.Data.elementAt(x.Data.size()-1).User_name=l.User_name;
			x.Data.elementAt(x.Data.size()-1).PhoneNum=l.PhoneNum;
			x.Data.elementAt(x.Data.size()-1).item_name=l.item_name;
			x.Data.elementAt(x.Data.size()-1).Description=l.Description;
			x.Data.elementAt(x.Data.size()-1).Category=l.Category;
			x.Data.elementAt(x.Data.size()-1).security=l.security;
			x.Data.elementAt(x.Data.size()-1).show_security=l.show_security;
			
		
  }
  
  public void view(Item_Database x, Item l)
  {
	
		//1=new Item();
		System.out.println("post Data ");
			System.out.println(x.Data.elementAt(x.Data.size()-1).User_name);
			System.out.println(x.Data.elementAt(x.Data.size()-1).item_name);
			System.out.println(x.Data.elementAt(x.Data.size()-1).Description);
			System.out.println(x.Data.elementAt(x.Data.size()-1).Category);
			System.out.println(x.Data.elementAt(x.Data.size()-1).security);
			System.out.println(x.Data.elementAt(x.Data.size()-1).show_security);
			
  }
    
    
          
            
    }
