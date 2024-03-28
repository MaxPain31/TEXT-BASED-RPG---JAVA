
package main;

public class SkillList {
    //Physical and Healing Skill for Trail Blazer
    Skill lightningStrike = new Skill("Lightning Strike",50,5,"Physical Attack");
    Skill meditate = new Skill ("Meditate",50,5,"Healing");
    Skill swiftBlade = new Skill ("Swiftblade",0,25,"Physical Attack");
    Skill emberStrike = new Skill("Emberstrike",0,50,"Physical Attack");
    //Getter of skill and set power
    
    //TrailBlaizer skill set Power
    public Skill getLightningStrike(Player p){
        lightningStrike.setPower((int) ((p.ATK)*1.5));
        return lightningStrike;
    }
    public Skill getMeditate(Player p){
        meditate.setPower((int) ((p.getMaxHP())*0.2));
        return meditate;
    }
    public Skill getSwiftBlade(Player p){
        swiftBlade.setPower((int) ((p.ATK)*1.5));
        return swiftBlade;
    }
    public Skill getEmberStrike(Player p){
        emberStrike.setPower((int) ((p.ATK)*1.5));
        return emberStrike;
    }
}
