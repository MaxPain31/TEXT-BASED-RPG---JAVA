
package main;

public class WeaponList {
        Weapon beginnerSword = new Weapon("Beginner Sword",100,10,"Warrior");
        Weapon noviceBlade = new Weapon("Novice Blade",500, 25,"Warrior");
        Weapon masterSwordSteel = new Weapon("Master Sword Steel",1000,50,"Warrior");
        Weapon divineSword = new Weapon("Divine's Sword",5000,100,"Warrior");
        Weapon dragonSlayerSword = new Weapon("Dragon Slayer Sword",0,160,"Warrior");
        Weapon mythicalSword = new Weapon("Mythical Sword",0,160,"Warrior");
        //Arcaine Weapon List
        Weapon beginnerStaff = new Weapon("Beginner Staff",10,10,"Mage");
        Weapon noviceStaff = new Weapon("Novice Staff",500, 25,"Mage");
        Weapon masterScepter = new Weapon("Master's Scepter",1000,50,"Mage");
        Weapon divineEmpyreanRod = new Weapon("Divine's Empyrean Rod",5000,100,"Mage");
        Weapon archmageStaff = new Weapon("Archmage's Staff",0,160,"Mage");
        Weapon mythicOracleStaff = new Weapon("Mythic's Oracle Staff",0,170,"Mage");
        //GunSlinger Weapon List
        Weapon beginnerGun = new Weapon("Beginner Gun",100,10,"Gunner");
        Weapon noviceBlaster = new Weapon("Novice's Blaster",500, 25,"Gunner");
        Weapon marksmanHandgun = new Weapon("Marksman's Handgun",1000,50,"Gunner");
        Weapon divineAnnihilator = new Weapon("Divine's Sword",5000,100,"Gunner");
        Weapon dragonSlayerGun = new Weapon("Dragon Slayer Gun",0,160,"Gunner");
        Weapon legendaryGun = new Weapon("Legendary Gun",0,170,"Gunner");
    
    public Weapon getBeginnerSword(){
        return beginnerSword;
    }
    public Weapon getnoviceBlade(){
        return noviceBlade;
    }
    public Weapon getmasterSwordSteel(){
        return masterSwordSteel;
    }
    public Weapon getdivineSword(){
        return divineSword;
    }
    
    
    public Weapon getbeginnerStaff(){
        return beginnerStaff;
    }
    public Weapon getnoviceStaff(){
        return noviceStaff;
    }
    public Weapon getmasterScepter(){
        return masterScepter;
    }
    public Weapon getdivineEmpyreanRod(){
        return divineEmpyreanRod;
    }
    
    
    public Weapon getbeginnerGun(){
        return beginnerGun;
    }
    public Weapon getnoviceBlaster(){
        return noviceBlaster;
    }
    public Weapon getmarksmanHandgun(){
        return marksmanHandgun;
    }
    public Weapon getdivineAnnihilator(){
        return beginnerSword;
    }
    
}
