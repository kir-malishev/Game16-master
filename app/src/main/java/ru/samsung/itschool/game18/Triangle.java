package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by vv on 22.11.2016.
 */
public class Triangle extends Figure implements Drawable{
    public Triangle(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawLine(pos.x, pos.y, pos.x + 80, pos.y + 80, paint);
        canvas.drawLine(pos.x - 80, pos.y + 80, pos.x + 80, pos.y + 80, paint);
        canvas.drawLine(pos.x, pos.y, pos.x - 80, pos.y + 80, paint);

    }
}
