package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.utils.TextureBinder;

public class pig {
    private int posx;
    private int posy;
    private int width;
    private int height;
    private Texture pig;

    public pig(int posx, int posy, int width, int height){
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        pig = new Texture("pig.png");

    }

    public int getPosx(){
        return posx;
    }

    public int getPosy(){
        return posy;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Texture getPigTexture(){
        return pig;
    }
}
