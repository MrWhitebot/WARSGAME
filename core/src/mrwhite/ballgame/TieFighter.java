package mrwhite.ballgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by manuel.blanco on 13/02/2018.
 */

public class TieFighter {
    Texture img;
    int x, y, z;

    public TieFighter() {
        img = new Texture("tiefighter.png");
        x = 500;
        y = 500;
        z = 500;
    }

    public void draw(SpriteBatch spriteBatch) {


        if(Gdx.input.getAccelerometerY()<0){
            x +=(Gdx.input.getAccelerometerY());
        }else if(Gdx.input.getAccelerometerY()>0){
            x +=Gdx.input.getAccelerometerY();
        }

        if(Gdx.input.getAccelerometerX()<0){

            y-=Gdx.input.getAccelerometerX();

        }else if(Gdx.input.getAccelerometerX()>0){
            y-= (Gdx.input.getAccelerometerX());
        }


        spriteBatch.draw(img, x, y, 150, 150);

    }

    public Texture getImg() {
        return img;
    }

    public void setImg(Texture img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

