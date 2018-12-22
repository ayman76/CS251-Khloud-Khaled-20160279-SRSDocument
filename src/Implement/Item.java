package Implement;

import java.util.Vector;

public class Item {
    public String item_name;
    public String Description;
    public String Category;
    public int ID;
    public String User_name;
    public Vector<String> security;
    public Vector<String> show_security;


    public Item()
    {

    }
    public Item(String item_name,String Description,String Category,int ID,String User_name)
    {
        this.item_name=item_name;
        this.Description=Description;
        this.Category=Category;
        this.ID=ID;
        this.User_name=User_name;
        security=new Vector<String>();
        show_security=new Vector<String>();

    }

    public String getImage1() {
        return item_name;
    }

    public void setImage1(String item_name) {
        item_name = item_name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getuser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }
}
