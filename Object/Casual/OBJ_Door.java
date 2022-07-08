package Object.Casual;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Door extends Entity {
    
    GamePanel gp;

    public OBJ_Door(GamePanel gp) {

        super(gp);
        name = "Door";
        down1 = setup("Object/door", gp.tileSize, gp.tileSize);
        collision = true;

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}
