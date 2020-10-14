package edu.temple.ColorChangeApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


public class PaletteActivity extends AppCompatActivity {
    GridView grid;
    ConstraintLayout gridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.labelPalette);
        gridlayout = findViewById(R.id.gridlayout);
        grid = (GridView)findViewById(R.id.gridviewid);
        TextView text = new TextView(this);
        text.setText(R.string.intro);
        //{Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
        //String [] colors = {"Red","Yellow","Green","Blue","Black","White","Gray","Light Gray","DK Gray","Cyan","Magenta","Transparent"};

        Resources res = getResources();
        String[] strcolor;
        strcolor = res.getStringArray(R.array.Colors);
        BaseAdapter ColorAdapter = new ColorAdapter(PaletteActivity.this,strcolor);
        grid.setAdapter(ColorAdapter);
        gridlayout.addView(text);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent canvasIntent = new Intent(PaletteActivity.this,CanvasActivity.class);
                canvasIntent.putExtra("Color",position);
                startActivity(canvasIntent);
            }
        });
    }
}