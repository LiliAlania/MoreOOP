package ua.edu.ucu.apps.lab4;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab4.strategy.KickStrategy;
@Getter
@AllArgsConstructor
public abstract class Character {
    @Setter
    private int power;
    private int hp;
    protected KickStrategy kickStrategy;
    public boolean isAlive(){
        return hp > 0;
    }
    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    }
    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
               "{hp=" + hp + ", power=" + power + "}";
    }

}
