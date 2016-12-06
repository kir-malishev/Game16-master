package ru.samsung.itschool.game18;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vv on 22.11.2016.
 */
public class Pic implements Drawable{
    Bitmap pic;
    Pic(Bitmap pic) {
        this.pic = pic;
    }
    Paint paint = new Paint();
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(pic, 0, 0, paint);
    }
}
