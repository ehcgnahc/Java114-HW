package Skill.DodgeSkill;
import Skill.Skill;

public abstract class DodgeSkill extends Skill{
    public DodgeSkill(String name){
        super(name);
    }

    protected abstract int calculateAmount();

    public void apply(){
        int time = calculateAmount();
        System.out.println("使出了" + name);
        System.out.println("接下來" + time + "秒內不會被選中");
    }
}
