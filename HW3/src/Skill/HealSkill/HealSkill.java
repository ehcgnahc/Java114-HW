package Skill.HealSkill;
import Skill.Skill;

public abstract class HealSkill extends Skill{
    public HealSkill(String name){
        super(name);
    }

    protected abstract int calculateAmount();

    public void apply(){
        int heal = calculateAmount();
        System.out.println("使出了" + name);
        System.out.println("恢復了" + heal + "點生命");
    }

    public void apply(int bonus){
        int heal = calculateAmount();
        System.out.println("使出了" + name);
        System.out.println("恢復了" + heal + "點生命");
        System.out.println("增加了" + bonus + "點防禦");
    }
}
