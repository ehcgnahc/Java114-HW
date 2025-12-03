package HW3.Skill.AttackSkill;
import java.util.Random;

public class Thunder extends AttackSkill{
    public Thunder(){
        super("雷擊術");
    }

    protected int calculateAmount(int ability){
        double weight = new Random().nextDouble()*0.4 + 1;
        return (int)(ability * 10 * weight);
    }
}
