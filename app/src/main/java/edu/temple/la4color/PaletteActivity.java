package edu.temple.la4color;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class PaletteActivity extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridView)findViewById(R.id.gridviewid);
        //{Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
        String [] colors = {"Red","Yellow","Green","Blue","Black","White","Gray","Light Gray","DK Gray","Cyan","Magenta","Transparent"};
        BaseAdapter ColorAdapter = new ColorAdapter(PaletteActivity.this,colors);

        grid.setAdapter(ColorAdapter);

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