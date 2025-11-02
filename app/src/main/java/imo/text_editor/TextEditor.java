package imo.text_editor;

import android.content.Context;
import android.view.View;
import android.graphics.Canvas;

public class TextEditor extends View {
    public TextEditor(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //TODO: draw grid of rectangles based on text width and height 
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
        //TODO: handle touch events
    }
}