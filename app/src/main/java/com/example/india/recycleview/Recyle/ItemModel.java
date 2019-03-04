package com.example.india.recycleview.Recyle;

public class
ItemModel {


    public  int img;
    public String Pack;
    public  String Description;
    public  String name;


    public ItemModel(int img, String name,String Packagename,String Description) {
        this.img = img;
        this.name = name;
        this.Pack=Packagename;
        this.Description=Description;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPackagename() {
        return Pack;
    }

    public void setPackagename(String packagename) {
        Pack = packagename;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
