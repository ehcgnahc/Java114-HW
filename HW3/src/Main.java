/*
 * @Author: ehcgnahc 
 * @Date: 2025-12-03 15:05:16 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-12-03 16:41:35
 */
import Skill.HealSkill.HealSkill;
import Skill.HealSkill.BasicHeal;
import Skill.HealSkill.AdvancedHeal;
import Skill.HealSkill.ExtremelyHeal;
import Skill.AttackSkill.AttackSkill;
import Skill.AttackSkill.FireBall;
import Skill.AttackSkill.PsyShock;
import Skill.AttackSkill.Thunder;
import Skill.DodgeSkill.DodgeSkill;
import Skill.DodgeSkill.Invisible;
import Skill.Skill;

public class Main{
    public static void main(String[] args){
        HealSkill basicHeal = new BasicHeal();
        HealSkill advHeal = new AdvancedHeal();
        HealSkill exHeal = new ExtremelyHeal();
        AttackSkill fireBall = new FireBall();
        AttackSkill psyShock = new PsyShock();
        AttackSkill thunder = new Thunder();
        DodgeSkill invisible = new Invisible();

        basicHeal.apply();
        System.out.println("--------------");
        advHeal.apply();
        System.out.println("--------------");
        exHeal.apply();
        System.out.println("--------------");
        fireBall.apply(5);
        System.out.println("--------------");
        psyShock.apply(5);
        System.out.println("--------------");
        thunder.apply(5);
        System.out.println("--------------");
        invisible.apply();
        System.out.println("--------------");
        Skill[] skills = {basicHeal, advHeal, exHeal, fireBall, psyShock, thunder, invisible};
        for(Skill skill :skills){
            System.out.println(skill.getName());
        }
    }
}
