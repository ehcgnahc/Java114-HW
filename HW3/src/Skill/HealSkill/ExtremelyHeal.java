package Skill.HealSkill;
import java.util.Random;

public class ExtremelyHeal extends HealSkill{
    public ExtremelyHeal(){
        super("神聖治療術");
    }

    protected int calculateAmount(){
        return new Random().nextInt(41) + 50;
    }
}
