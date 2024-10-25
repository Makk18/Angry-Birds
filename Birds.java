package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;

abstract public class Birds {
    private String name;
    private int posx;
    private int posy;
    private int width;
    private int height;
    private int velocity;

    public Birds(String name, int posx,int posy, int velocity, int width, int height){
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.velocity = velocity;
    }

    public String getName(){
        return name;
    }

    public int getPosx(){
        return posx;
    }
    public int getPosy(){
        return posy;
    }

    public int getBirdVelocity(){
        return velocity;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public abstract Texture getBirdTexture();
}
