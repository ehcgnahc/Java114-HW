/*
 * @Author: ehcgnahc 
 * @Date: 2025-12-03 15:05:16 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-12-03 16:41:35
 */
package HW3;
import HW3.Skill.HealSkill.HealSkill;
import HW3.Skill.HealSkill.BasicHeal;
import HW3.Skill.HealSkill.AdvancedHeal;
import HW3.Skill.HealSkill.ExtremelyHeal;
import HW3.Skill.AttackSkill.AttackSkill;
import HW3.Skill.AttackSkill.FireBall;
import HW3.Skill.AttackSkill.PsyShock;
import HW3.Skill.AttackSkill.Thunder;
import HW3.Skill.DodgeSkill.DodgeSkill;
import HW3.Skill.DodgeSkill.Invisible;
import HW3.Skill.Skill;

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
