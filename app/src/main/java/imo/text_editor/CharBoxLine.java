package imo.text_editor;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

public class CharBoxLine {
    List<CharBox> charBoxes = new ArrayList<>();
    int top = 0;
    

    CharBoxLine(String oneLineString, Paint paint) {
        int currLeft = 0;

        for (char c : oneLineString.toCharArray()) {
            CharBox charBox = new CharBox(c, paint);
            charBoxes.add(charBox);

            charBox.setBounds(
                top,                          // top
                currLeft,                     // left
                top + CharBox.EACH_HEIGHT,    // bottom
                currLeft + CharBox.EACH_WIDTH // right
            );

            currLeft += CharBox.EACH_WIDTH;
        }
    }
    
    public void draw(Canvas canvas, Paint paint) {
        for (CharBox charBox : charBoxes) {
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            charBox.draw(canvas, paint);
        }
    }   
}
