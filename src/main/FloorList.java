/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class FloorList {
    Floor floor1 = new Floor("Verdant Grove","Welcome to the Verdant Grove, a nature-themed dungeon floor bursting with vibrant life. \nThe floor is covered in lush greenery, towering trees, and colorful flowers. \nSunlight filters through the canopy above, casting a gentle glow. \nBeware of carnivorous plants and elusive forest creatures as you navigate through this verdant maze. \nThe soothing sounds of chirping birds and rustling leaves create a serene atmosphere, but danger may lurk behind every bush.",
             "You complete this floor!, You may now enter to the next floor.");
    Floor floor2 = new Floor("Inferno's Forge","Step into the heart of Inferno's Forge, a dungeon floor where the power of fire reigns supreme.\\n The floor is bathed in a fiery glow, with molten lava flowing through channels and cracks in the scorched earth. \\nIntense heat fills the air, making it difficult to breathe. \\nThe clang of blacksmith hammers and the crackling of flames echo throughout the chamber. \\nBeware of fiery traps and menacing fire elementals as you journey through this searing and treacherous domain.",
             "You complete this floor!, You may now enter to the next floor.");
    Floor floor3 = new Floor("Frostfall Citadel","Welcome to Frostfall Citadel, a chilling dungeon floor forged in ice and frost. \\nThe floor is covered in a thick layer of glistening ice, with towering ice formations and shimmering stalactites. \\nThe air is bitterly cold, causing your breath to crystallize in the frigid atmosphere. \\nBeware of treacherous icy patches and ice elemental guardians as you traverse this icy labyrinth. \\nThe sound of cracking ice and distant howling winds creates an environment of isolation and danger.",
                "You complete this floor!, You may now enter to the next floor.");
    Floor floor4 = new Floor("Twilight Abyss","Descend into the depths of the Twilight Abyss, a dungeon floor cloaked in eternal darkness. \\nThe floor is shrouded in deep shadows and punctuated by eerie, dimly lit torches. \\nSinister whispers and unsettling echoes fill the air, instilling a sense of unease. \\nThe floor is rife with hidden traps and devious illusions that can lead astray even the most cautious adventurers. \\nBe prepared to confront the darkness within yourself as you navigate through this haunting and enigmatic abyss.",
                "You complete this floor!, You may now enter to the next floor.");
    Floor floor5 = new Floor("Forbidden Sanctuary","Discover the Forbidden Sanctuary floor, a secluded dungeon floor shrouded in mystery and guarded by ancient dragon. \\n The floor is adorned with ornate symbols, intricate statues, and mystical artifacts. \\nThe air crackles with arcane energy, and the presence of powerful guardians adds to the sense of trepidation. \\nUnlock the secrets of this sanctuary, but be prepared for the consequences of trespassing forbidden grounds.",
                "You complete this floor!, You may now enter to the next floor.");
    public Floor getFloor1(){
        return this.floor1;
    }
    public Floor getFloor2(){
        return this.floor2;
    }
    public Floor getFloor3(){
        return this.floor3;
    }
    public Floor getFloor4(){
        return this.floor4;
    }
    public Floor getFloor5(){
        return this.floor5;
    }
}
