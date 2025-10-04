package ua.edu.ucu.apps.lab4;
import ua.edu.ucu.apps.lab4.strategy.NobleStrategy;
import java.util.Random;
public abstract class Noble extends Character{
    private static final Random RANDOM = new Random();
    public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower-minPower + 1)+minPower, 
        RANDOM.nextInt(maxHp-minHp + 1)+minHp, new NobleStrategy());
    }
    @Override
        public void kick(Character enemy){
            int enemyHp = enemy.getHp();
            enemy.setHp(enemyHp - RANDOM.nextInt(getPower()));
        }
}
