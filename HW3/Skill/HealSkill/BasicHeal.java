package HW3.Skill.HealSkill;
import java.util.Random;

public class BasicHeal extends HealSkill{
    public BasicHeal(){
        super("基礎治療術");
    }

    protected int calculateAmount(){
        return new Random().nextInt(16) + 15;
    }
}
