package com.example.listviewbean;

public class BookBean {
    private String author ;
    private String name;

    public BookBean(){

    }
    public BookBean(String author, String name){
        this.author = author;
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public String getName(){
        return name;
    }
    public void setIcon(String author){
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }

}

