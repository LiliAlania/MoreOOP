package ua.edu.ucu.apps.lab4;

import ua.edu.ucu.apps.lab4.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit(){
        super(0,3, new HobbitKickStrategy());
    }
        @Override
    public void kick(Character character){
        System.out.println("Cry a lot!");
    }

}
