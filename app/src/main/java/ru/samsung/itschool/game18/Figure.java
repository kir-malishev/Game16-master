package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vv on 22.11.2016.
 */
abstract class Figure{
    Vector pos;
    Vector velocity;
    Paint paint;

    Figure(float posX, float posY) {
        pos = new Vector(posX, posY);
        paint = new Paint();
        velocity = new Vector(0, 0.5f);
    }

    abstract void draw(Canvas canvas);

    void move() {
        pos.sum(velocity);
    }

}
