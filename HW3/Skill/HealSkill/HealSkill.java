package HW3.Skill.HealSkill;
import HW3.Skill.Skill;

public abstract class HealSkill extends Skill{
    public HealSkill(String name){
        super(name);
    }

    protected abstract int calculateAmount();

    public void apply(){
        int heal = calculateAmount();
        System.out.println("使出了" + name);
        System.out.println("恢復了" + heal + "點生命");
        
        if(name == "進階治療術"){
            System.out.println("增加了5點防禦");
        }
    }
}
