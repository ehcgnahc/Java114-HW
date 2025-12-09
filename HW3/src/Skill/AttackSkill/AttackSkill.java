package Skill.AttackSkill;
import Skill.Skill;

public abstract class AttackSkill extends Skill{
    public AttackSkill(String name){
        super(name);
    }

    protected abstract int calculateAmount(int ability);

    public void apply(int ability){
        int dmg = calculateAmount(ability);
        System.out.println("使出了" + name);
        System.out.println("造成了" + dmg + "點傷害");
    }

    public void apply(int ability, int time){
        int dmg = calculateAmount(ability);
        System.out.println("使出了" + name);
        System.out.println("造成了" + dmg + "點傷害");
        System.out.println("另外造成了" + time + "秒的暈眩");
    }
}
