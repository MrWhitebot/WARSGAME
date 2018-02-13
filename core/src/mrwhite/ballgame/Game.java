package mrwhite.ballgame;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by manuel.blanco on 13/02/2018.
 */

public class Game {
    private Xwing xwing;
    private TieFighter tieFighter;

    public Game() {
        xwing = new Xwing();
        tieFighter = new TieFighter();

    }

    public void draw(SpriteBatch spriteBatch) {

        this.xwing.draw(spriteBatch);
        this.tieFighter.draw(spriteBatch);
    }

    public Xwing getXwing() {

        return xwing;
    }

    public void setXwing(Xwing xwing) {
        this.xwing = xwing;

    }
    public TieFighter getTieFighter() {

        return tieFighter;
    }

    public void setTieFighter(TieFighter tieFighter) {
        this.tieFighter = tieFighter;

    }
}