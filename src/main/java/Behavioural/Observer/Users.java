package Behavioural.Observer;

import org.apache.catalina.User;

public class Users implements Observer{
    private String name;

    public Users(String name){
        this.name= name;
    }

    @Override
    public void update(String headline) {
        System.out.println(name + " received news: " + headline);
    }

}
