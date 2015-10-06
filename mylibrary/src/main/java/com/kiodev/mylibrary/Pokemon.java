package com.kiodev.mylibrary;

/**
 * Created by kellyshuster on 10/5/15.
 */
public class Pokemon {

    private String mName;
    private String mType;

    public Pokemon() { }

    public Pokemon(String name, String type){
        mName = name;
        mType = type;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public String getType(){
        return mType;
    }

    public void setType(String type){
        mType = type;
    }

}
