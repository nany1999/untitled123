package com.example.listviewchat;

public class ChatBean {
    private String name;
    private String say;
    private int icon;



    public  void ChatBean(){

    }
    public void ChatBean(String name,String say,int icon){
        this.name = name;
        this.say = say;
        this.icon = icon;

    }
    public String getName(){
        return name;
    }

    public String getSay(){
        return say;
    }

    public int getIcon() {
        return icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
    public  Boolean isMe(){
        return name.toLowerCase().equals("caicai");
    }
}
