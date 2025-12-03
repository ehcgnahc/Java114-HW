package HW3.Skill.DodgeSkill;
import java.util.Random;

public class Invisible extends DodgeSkill{
    public Invisible(){
        super("隱形術");
    }

    protected int calculateAmount(){
        return new Random().nextInt(11) + 1;
    }
}
