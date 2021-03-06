package Object.Weapons;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Axe extends Entity {

    public OBJ_Axe(GamePanel gp) {
        super(gp);
        
        type = type_axe;
        name = "Woodcutter's Axe";
        down1 = setup("Object/axe", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nA bit rusty but still \ncan cut some trees."; 

        attackValue = 2;
        attackArea.width = 30;
        attackArea.height = 30;

        price = 150;
    }
}
