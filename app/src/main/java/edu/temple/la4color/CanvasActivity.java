package edu.temple.la4color;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout gridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gridtext = new TextView(this);
        gridtext.setGravity(4);

        gridlayout = findViewById(R.id.gridlayout);
        Intent result = getIntent();
        int color = result.getIntExtra("Color",0);

        //int [] colorid = {Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
        if(color == 0 ){
            gridlayout.setBackgroundColor(Color.RED);
            gridtext.setText("Red");
            gridlayout.addView(gridtext);
        }else if(color == 1){
            gridlayout.setBackgroundColor(Color.YELLOW);
            gridtext.setText("Yellow");
            gridlayout.addView(gridtext);
        }
        else if(color == 2){
            gridlayout.setBackgroundColor(Color.GREEN);
            gridtext.setText("Green");
            gridlayout.addView(gridtext);
        }else if(color == 3){
            gridlayout.setBackgroundColor(Color.BLUE);
            gridtext.setText("Blue");
            gridlayout.addView(gridtext);
        }else if(color == 4){
            gridlayout.setBackgroundColor(Color.BLACK);
            gridtext.setText("Black");
            gridlayout.addView(gridtext);
        }else if(color == 5){
            gridlayout.setBackgroundColor(Color.WHITE);
            gridtext.setText("White");
            gridlayout.addView(gridtext);
        }else if(color == 6){
            gridlayout.setBackgroundColor(Color.GRAY);
            gridtext.setText("Gray");
            gridlayout.addView(gridtext);
        }else if(color == 7){
            gridlayout.setBackgroundColor(Color.LTGRAY);
            gridtext.setText("Light Gray");
            gridlayout.addView(gridtext);
        }else if(color == 8){
            gridlayout.setBackgroundColor(Color.DKGRAY);
            gridtext.setText("DK Gray");
            gridlayout.addView(gridtext);
        }else if(color == 9){
            gridlayout.setBackgroundColor(Color.CYAN);
            gridtext.setText("Cyan");
            gridlayout.addView(gridtext);
        }else if(color == 10){
            gridlayout.setBackgroundColor(Color.MAGENTA);
            gridtext.setText("Magenta");
            gridlayout.addView(gridtext);
        }else if(color == 11){
            gridlayout.setBackgroundColor(Color.TRANSPARENT);
            gridtext.setText("Transparent");
            gridlayout.addView(gridtext);
        }
    }
}
