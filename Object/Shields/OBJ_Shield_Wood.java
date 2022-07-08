package Object.Shields;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Shield_Wood extends Entity {

    public OBJ_Shield_Wood(GamePanel gp) {
        super(gp);
        
        type = type_shield;
        name = "Wood Shield";
        down1 = setup("Object/shield_wood", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nMade by wood."; 
        defenseValue = 1;

        price = 80;
    }
    
}
