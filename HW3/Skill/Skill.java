package HW3.Skill;

public class Skill{
    protected String name;

    public Skill(String name){
        this.name = name;
    }

    // heal skill
    public void apply(){
        System.out.println(name + " 被施放，但沒有指定效果");
    }

    // attack skill
    public void apply(int playerAbility){
        System.out.println(name + " 被施放，但沒有指定攻擊目標");
    }

    public String getName(){
        return name;
    }
}