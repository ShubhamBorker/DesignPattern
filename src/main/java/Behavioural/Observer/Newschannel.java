package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Newschannel implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String latestHeadLine;

    public void publishedHeadLines(String latestHeadLine){
        this.latestHeadLine =latestHeadLine;
        notifyObserver();
    }

    @Override
    public void attach(Observer o){
        observers.add(o);
    }

    @Override
    public void detach(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObserver(){
        for (Observer o : observers){
            o.update(latestHeadLine);
        }
    }
}
