package ua.edu.ucu.apps.lab4.strategy;

import ua.edu.ucu.apps.lab4.Character;
import java.util.Random;

public class NobleStrategy extends KickStrategy {
    private static final Random RANDOM = new Random();
    
    @Override
    public void kick(Character attacker, Character enemy) {
        int damage = RANDOM.nextInt(attacker.getPower() + 1);
        int newHp = Math.max(0, enemy.getHp() - damage);
        enemy.setHp(newHp);
        System.out.println(attacker.getClass().getSimpleName() + 
                         " deals " + damage + " damage to " + 
                         enemy.getClass().getSimpleName() + "!");
    }
}