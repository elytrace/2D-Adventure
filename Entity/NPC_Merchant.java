package Entity;

import Main.GamePanel;
import Object.Casual.OBJ_Boots;
import Object.Casual.OBJ_Key;
import Object.Consumable.OBJ_Potion_Red;
import Object.Shields.OBJ_Shield_Blue;
import Object.Shields.OBJ_Shield_Wood;
import Object.Weapons.OBJ_Axe;
import Object.Weapons.OBJ_Sword_Normal;

public class NPC_Merchant extends Entity {
    
    public NPC_Merchant(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 0;
        getImage();
        setDialogue();
        setItems();

        solidArea.x = 8;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {

        up1 = setup("NPC/merchant_down_1", gp.tileSize, gp.tileSize);
        up2 = setup("NPC/merchant_down_2", gp.tileSize, gp.tileSize);
        down1 = setup("NPC/merchant_down_1", gp.tileSize, gp.tileSize);
        down2 = setup("NPC/merchant_down_2", gp.tileSize, gp.tileSize);
        left1 = setup("NPC/merchant_down_1", gp.tileSize, gp.tileSize);
        left2 = setup("NPC/merchant_down_2", gp.tileSize, gp.tileSize);
        right1 = setup("NPC/merchant_down_1", gp.tileSize, gp.tileSize);
        right2 = setup("NPC/merchant_down_2", gp.tileSize, gp.tileSize);
    }

    public void setDialogue() {

        dialogue[0] = "He he, so you found me.\nI have some good stuff.\nDo you want to trade?";
    }

    public void setItems() {

        inventory.add(new OBJ_Potion_Red(gp));
        inventory.add(new OBJ_Key(gp));
        inventory.add(new OBJ_Sword_Normal(gp));
        inventory.add(new OBJ_Axe(gp));
        inventory.add(new OBJ_Shield_Wood(gp));
        inventory.add(new OBJ_Shield_Blue(gp));
        inventory.add(new OBJ_Boots(gp));
    }

    public void speak() {

        super.speak();
        gp.gameState = gp.tradeState;
        gp.ui.npc = this;
    }
}
