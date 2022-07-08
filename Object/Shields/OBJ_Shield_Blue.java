package Object.Shields;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Shield_Blue extends Entity {

    public OBJ_Shield_Blue(GamePanel gp) {
        super(gp);
        
        type = type_shield;
        name = "Blue Shield";
        down1 = setup("Object/shield_blue", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nA shiny shield."; 
        defenseValue = 2;

        price = 120;
    }
    
}
