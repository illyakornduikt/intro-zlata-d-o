package src.main;

import src.object.OBJ_Boots;
import src.object.OBJ_Chest;
import src.object.OBJ_Door;
import src.object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 2 * gp.tileSize;
        gp.obj[0].worldY = 11 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 10 * gp.tileSize;
        gp.obj[1].worldY = 47 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 24 * gp.tileSize;
        gp.obj[2].worldY = 47 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 26 * gp.tileSize;
        gp.obj[3].worldY = 44 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 35 * gp.tileSize;
        gp.obj[4].worldY = 41 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 17 * gp.tileSize;
        gp.obj[5].worldY = 35 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 2 * gp.tileSize;
        gp.obj[6].worldY = 30 * gp.tileSize;

        gp.obj[7] = new OBJ_Boots();
        gp.obj[7].worldX = 42 * gp.tileSize;
        gp.obj[7].worldY = 33 * gp.tileSize;
    }
}
