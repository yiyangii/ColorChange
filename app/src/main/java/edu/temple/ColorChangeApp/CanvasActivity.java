package edu.temple.ColorChangeApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout gridlayout;
    //rename
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.labelCanvas);
        TextView gridtext = new TextView(this);
        gridtext.setGravity(4);

        gridlayout = findViewById(R.id.gridlayout);
        Intent result = getIntent();
        int color = result.getIntExtra("Color",0);

        //int [] colorid = {Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
        if(color == 0 ){
            gridlayout.setBackgroundColor(Color.RED);
            gridtext.setText(R.string.Red);
            gridlayout.addView(gridtext);
        }else if(color == 1){
            gridlayout.setBackgroundColor(Color.YELLOW);
            gridtext.setText(R.string.Yellow);
            gridlayout.addView(gridtext);
        }
        else if(color == 2){
            gridlayout.setBackgroundColor(Color.GREEN);
            gridtext.setText(R.string.Green);
            gridlayout.addView(gridtext);
        }else if(color == 3){
            gridlayout.setBackgroundColor(Color.BLUE);
            gridtext.setText(R.string.Blue);
            gridlayout.addView(gridtext);
        }else if(color == 4){
            gridlayout.setBackgroundColor(Color.BLACK);
            gridtext.setText(R.string.Black);
            gridlayout.addView(gridtext);
        }else if(color == 5){
            gridlayout.setBackgroundColor(Color.WHITE);
            gridtext.setText(R.string.White);
            gridlayout.addView(gridtext);
        }else if(color == 6){
            gridlayout.setBackgroundColor(Color.GRAY);
            gridtext.setText(R.string.Gray);
            gridlayout.addView(gridtext);
        }else if(color == 7){
            gridlayout.setBackgroundColor(Color.LTGRAY);
            gridtext.setText(R.string.LightGray);
            gridlayout.addView(gridtext);
        }else if(color == 8){
            gridlayout.setBackgroundColor(Color.DKGRAY);
            gridtext.setText(R.string.DKGray);
            gridlayout.addView(gridtext);
        }else if(color == 9){
            gridlayout.setBackgroundColor(Color.CYAN);
            gridtext.setText(R.string.Cyan);
            gridlayout.addView(gridtext);
        }else if(color == 10){
            gridlayout.setBackgroundColor(Color.MAGENTA);
            gridtext.setText(R.string.Magenta);
            gridlayout.addView(gridtext);
        }else if(color == 11){
            gridlayout.setBackgroundColor(Color.TRANSPARENT);
            gridtext.setText(R.string.Transparent);
            gridlayout.addView(gridtext);
        }
    }
}
