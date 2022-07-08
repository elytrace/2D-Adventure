package Object.Casual;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Key extends Entity {
    
    GamePanel gp;

    public OBJ_Key(GamePanel gp) {

        super(gp);
        name = "Key";
        down1 = setup("Object/key", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nIt opens a door.";
    
        price = 10;
    }
}
