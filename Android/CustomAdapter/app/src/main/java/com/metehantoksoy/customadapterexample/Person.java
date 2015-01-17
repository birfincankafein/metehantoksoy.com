package com.metehantoksoy.customadapterexample;

/**
 * Created by Metehan on 16.1.2015.
 */
public class Person {
    private String Name;
    private String Address;
    private int PicResID;

    public Person(String name, String address){
        Name = name;
        Address = address;
    }
    public Person(String name, String address,int imageID){
        Name = name;
        Address = address;
        PicResID = imageID;
    }


    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPictureResourceID() {
        return PicResID;
    }
}
