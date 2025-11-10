package imo.text_editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;

public class TextEditor extends View {
    public TextEditor(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setTextSize(40f);
        paint.setColor(Color.WHITE);
        paint.setTypeface(Typeface.MONOSPACE);

        String text = "I saw her in the rightest way, looking like anne hathaway";

        CharBoxLine charBoxLine = new CharBoxLine(text, paint);
        charBoxLine.draw(canvas, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
        //TODO: handle touch events
    }
}
