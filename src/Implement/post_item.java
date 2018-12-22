package Found_IT;

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
    static Vector<String> security;
    static Vector<String> show_security;
    
	public void Post_item() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of posts");

		int num_of_posts=s.nextInt();
		
		System.out.println("enter the user name");
		user_Name=s.nextLine();
		
		System.out.println("enter the name of lost item");
		item_Name=s.nextLine();
		
		
	   System.out.println("enter description of lost item");
			des=s.nextLine();
			
		System.out.println("enter category of lost item");
				category=s.nextLine();
			
				System.out.println("enter number of sequrity question of lost item");
				int num_of_question=s.nextInt();

				for(int i=0;i<num_of_question;i++)
				{
					System.out.println("enter sequrity question of lost item number " + (i+1));
					security.addElement(s.nextLine());
					
					System.out.println("enter show sequrity question of lost item" + (i+1));
					show_security.addElement(s.nextLine());

					
				}
		
		
		
		 
		for(int i=0;i<num_of_posts;i++)
		{
			this.Data.elementAt(i).User_name=user_Name;
			this.Data.elementAt(i).item_name=item_Name;
			this.Data.elementAt(i).Description=des;
			this.Data.elementAt(i).Category=category;
			this.Data.elementAt(i).security=security;

			this.Data.elementAt(i).show_security=show_security;
			
			

		}
		 
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
		squre=security.elementAt(0);
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
	public void show_answer()
	{
		for(int i=0;i<security.size();i++)
		{
			System.out.println("sequrity question number "+ i + security.elementAt(i));
		}
	}
	
	
	
	
	
	
	
}

