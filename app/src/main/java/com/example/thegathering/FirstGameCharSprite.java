package com.example.thegathering;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class FirstGameCharSprite {
    private Bitmap image;
    private int x, y;
    public FirstGameCharSprite(Bitmap bmp){
        image = bmp;
        x = 100;
        y = 100;
    }
    public void draw (Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update(){
        y++;
    }
}
