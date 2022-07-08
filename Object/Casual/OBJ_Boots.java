package Object.Casual;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Boots extends Entity {
    
    GamePanel gp;

    public OBJ_Boots(GamePanel gp) {

        super(gp);
        name = "Boots";
        down1 = setup("Object/boots", gp.tileSize, gp.tileSize);

        price = 150;
    }
}
