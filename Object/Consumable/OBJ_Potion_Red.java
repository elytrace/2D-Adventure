package Object.Consumable;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Potion_Red extends Entity {

    GamePanel gp;

    public OBJ_Potion_Red(GamePanel gp) {
        super(gp);
        this.gp = gp;

        type = type_consumable;
        name = "Red Potion";
        value = 5;
        down1 = setup("Object/potion_red", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nHeals your life by " + value + ".";

        price = 50;
    }
    
    public void use(Entity entity) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You drink the " + name + " !\nYour life has been recovered by " + value + ".";
        entity.life += value;
        gp.playSE(2);
    }
}
