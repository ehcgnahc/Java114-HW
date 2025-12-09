package Skill.AttackSkill;
import java.util.Random;

public class FireBall extends AttackSkill{
    public FireBall(){
        super("火球術");
    }

    protected int calculateAmount(int ability){
        double weight = 0.8 + new Random().nextDouble()*0.2;
        return (int)(ability * 10 * weight);
    }
}
