package edu.eci.arsw.portal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class king {

    private Sprite sprite;
    private int x,y;

    public king(int x, int y){
        this.x = x;
        this.y = y;
        this.sprite = new Sprite( new Texture(Gdx.files.internal("king100.png")),100,100);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void render(final SpriteBatch spriteBatch){
        spriteBatch.draw(sprite,x,y);
    }

}
