package com.example.demo.eventyAsync;


public class PojoAsync {

    private String name;

    public PojoAsync(String s){
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
