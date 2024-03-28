
package main;

public class Ability {
    
    protected String skillName;
    protected int power;
    protected int mpCost;
    protected String type;
    
    public Ability(String skillname,int power,int mpCost,String type){
        this.skillName = skillname;
        this.power = power;
        this.mpCost = mpCost;
        this.type = type;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }
    public int getMpCost(){
        return mpCost;
    }
    public void setMpCost(int mpCost){
        this.mpCost = mpCost;
    }
    public String getSkillName(){
        return skillName;
    } 
    public String getType(){
        return type;
    }
}
