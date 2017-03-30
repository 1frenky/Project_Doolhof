/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfx;

import java.awt.image.BufferedImage;

/**
 *
 * @author Frenky
 */
public class Assets {
    
    private static final int width = 53, height = 43;
    
    public static BufferedImage player, dirt, grass, stone, tree;
    
    public static void init(){
        SpriteSheet sheet  = new SpriteSheet(ImageLoader.LoadImage("/textures/sheet1.png"));
        
        player = sheet.crop(0, 0, width, height);
        dirt = sheet.crop(width, 0 , width, height);
        grass = sheet.crop(width * 2, 0, width, height);
        stone =  sheet.crop(width * 3, 0, width, height);
        tree =  sheet.crop(0, height, width, height);
        
    }
}