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

    private static int BASELINE_OFFSET;
	public static String DEBUG = "";

    CharBox(char c, Paint paint) {
		this.c = c;
		
        boolean isFirstLoad = EACH_WIDTH == 0 && EACH_HEIGHT == 0;
        if (!isFirstLoad) return;
        
        Paint.FontMetrics fm = paint.getFontMetrics();
        EACH_HEIGHT = (int) Math.ceil(fm.bottom - fm.top);
        BASELINE_OFFSET = (int) Math.ceil(fm.bottom);
        
        Rect textBounds = new Rect();
        paint.getTextBounds("A", 0, 1, textBounds);
        EACH_WIDTH = textBounds.width();
    }

    public CharBox setBounds(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
        return this;
    }

    public void draw(Canvas canvas, Paint paint) {
        float baseline = bottom - BASELINE_OFFSET;
        canvas.drawText(String.valueOf(c), left, baseline, paint);
		
		paint.setColor(0xFF888888);
		paint.setStrokeWidth(2);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawRect(left, top, right, bottom, paint);
		
		DEBUG = "top: " + top + "\nbaseline: " + BASELINE_OFFSET;
    }
}
