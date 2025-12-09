package Skill.HealSkill;
import Skill.Skill;

public abstract class HealSkill extends Skill{
    public HealSkill(String name){
        super(name);
    }

    protected abstract int calculateAmount();

    protected int bonusDefense(){
        return 0;
    }

    public void apply(){
        int heal = calculateAmount();
        System.out.println("使出了" + name);
        System.out.println("恢復了" + heal + "點生命");
        
        int bonus = bonusDefense();
        if(bonus > 0){
            System.out.println("額外增加了" + bonus + "點防禦");
        }
    }
}
