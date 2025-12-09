package Skill.AttackSkill;
import java.util.Random;

public class PsyShock extends AttackSkill{
    public PsyShock(){
        super("精神衝擊");
    }

    protected int calculateAmount(int ability){
        double weight = 0.5 +  new Random().nextDouble()*0.3;
        return (int)(ability * 10 * weight);
    }
    
    protected int bonusTime(int ability){
        return (int)(ability/2 + 5);
    }
}