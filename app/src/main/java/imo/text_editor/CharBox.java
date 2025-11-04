package imo.text_editor;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class CharBox {
    public static int EACH_WIDTH = 0;
    public static int EACH_HEIGHT = 0;

    public int top;
    public int left;
    public int bottom;
    public int right;
	public char c;

    CharBox(char c, Paint paint) {
		this.c = c;
		
        boolean isFirstLoad = EACH_WIDTH == 0 && EACH_HEIGHT == 0;
        if (isFirstLoad) {
            Rect textBounds = new Rect();
            paint.getTextBounds("A", 0, 1, textBounds);
            EACH_WIDTH = textBounds.width();
            EACH_HEIGHT = textBounds.height();
        }
    }

    public CharBox setBounds(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
        return this;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawText(String.valueOf(c), left, bottom, paint);
    }
}
