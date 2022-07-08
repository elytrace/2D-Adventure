package Object.Casual;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Chest extends Entity {
    
    GamePanel gp;

    public OBJ_Chest(GamePanel gp) {

        super(gp);
        name = "Chest";
        down1 = setup("Object/chest", gp.tileSize, gp.tileSize);

    }
}
