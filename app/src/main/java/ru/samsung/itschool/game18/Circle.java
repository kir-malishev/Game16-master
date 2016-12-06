package ru.samsung.itschool.game18;

import android.graphics.Canvas;

/**
 * Created by vv on 22.11.2016.
 */
public class Circle extends Figure implements Drawable{
    public Circle(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(pos.x, pos.y, 50, paint);
    }
}
