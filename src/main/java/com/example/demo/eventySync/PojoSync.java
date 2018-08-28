package com.example.demo.eventySync;


public class PojoSync {

    private String name;

    public PojoSync(String s){
        this.name =s;
    }

    public String getName(){
        return name;
    }


    @Override
    public String toString(){
        return "++++ moje POJO  " + name;
    }

}
