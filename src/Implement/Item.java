package Implement;

public class Item {
    public String item_name;
    public String Description;
    public String Category;
    public int ID;
    public String User_name;
    public String PhoneNum;
    public String security;
    public String show_security;


    public Item()
    {

    }
    public Item(String item_name,String Description,String Category,int ID,String User_name,String PhoneNum,String security,String show_security)
    {
        this.item_name=item_name;
        this.Description=Description;
        this.Category=Category;
        this.ID=ID;
        this.User_name=User_name;
        this.PhoneNum = PhoneNum;
        this.security=security;
        this.show_security=show_security;

    }

   

 
}
