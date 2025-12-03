package HW3.Skill.HealSkill;
import java.util.Random;

public class AdvancedHeal extends HealSkill{
    public AdvancedHeal(){
        super("進階治療術");
    }

    protected int calculateAmount(){
        return new Random().nextInt(21) + 40;
    }
}
