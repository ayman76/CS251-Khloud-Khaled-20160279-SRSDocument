package Implement;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import javax.imageio.ImageIO;

public class post_item extends Item_Database {
	static String item_Name;
	static String des;
	static String category;
	static String user_Name;
	static String phoneNum;
    static String security;
    static String show_security;
    
	public void Post_item(Item_Database x) 
	{
		Item l=new Item();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the user name: ");
		 user_Name=s.nextLine();

		System.out.println("enter the Phone Number: ");
		phoneNum =s.nextLine();

		System.out.println("enter the name of lost item: ");
		item_Name=s.nextLine();
		
		
	   System.out.println("enter description of lost item: ");
			des=s.nextLine();
			
		System.out.println("enter category of lost item: ");
				category=s.nextLine();
				
		System.out.println("enter sequrity question of lost item: ");
		security=s.nextLine();
		
		System.out.println("enter answer sequrity question of lost item");
		show_security=s.nextLine();
		
		l.User_name=user_Name;
		l.PhoneNum = phoneNum;
		l.Category=category;
		l.Description=des;
		l.security=security;
		l.show_security=show_security;
		l.item_name=item_Name;
		this.save(x,l);
		this.view(x,l);
	}


	public static String take_a_picture(){
		
		
		item_Name+=".JPG";
		
		
        BufferedImage image = null;
		try {
			image = ImageIO.read(new File(item_Name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		return item_Name;

	}
	
	public static String type_description(String description)
	{
		des =description;
		return des;

	}
	
	public static String select_category(String cat)
	{
		cat=category;
		return cat;
	}
	
	public static void sequrity_question(String squre)
	{
		//squre=security.elementAt(0);
	}
	
	public void check()
	{
		for(int i=0;i<this.Data.size();i++)
		{
	if(user_Name!=this.Data.elementAt(i).User_name
			&&item_Name!=this.Data.elementAt(i).item_name
			&&des!=this.Data.elementAt(i).Description
			&&this.Data.elementAt(i).Category!=category
			&&this.Data.elementAt(i).security!=security
	        &&this.Data.elementAt(i).show_security!=show_security)
			{
		     System.out.println("Data is true");
			}
	else 
	     System.out.println("Data is false");
 
		}
		

	}
	public void show_answer(Vector<String>ques)
	{
		for(int i=0;i<ques.size();i++)
		{
			System.out.println("squrity number "+ (i+1) + "-  "+ques.elementAt(i));
		}
	}
	
	
	
	
	
	
	
}

