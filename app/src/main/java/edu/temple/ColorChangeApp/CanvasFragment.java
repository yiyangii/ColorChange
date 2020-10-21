package edu.temple.ColorChangeApp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CanvasFragment extends Fragment {

    FrameLayout fragmentLayout;
    TextView text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_second, container, false);
        fragmentLayout = v.findViewById(R.id.fragmentlayout);
        text = v.findViewById(R.id.fragmenttext);

        return v;
    }
    public CanvasFragment(){

    }

    public void setColorToShow(int color){
        String[] colorList = getResources().getStringArray(R.array.Colors);
        // //int [] colorid = {Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.
        // BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
        if(color == 0){
            fragmentLayout.setBackgroundColor(Color.RED);
            text.setText(R.string.Red);
        }
        else if(color == 1){
            fragmentLayout.setBackgroundColor(Color.YELLOW);
            text.setText(R.string.Yellow);
        }
        else if(color == 2){
            fragmentLayout.setBackgroundColor(Color.GREEN);
            text.setText(R.string.Green);
        }
        else if(color == 3){
            fragmentLayout.setBackgroundColor(Color.BLUE);
            text.setText(R.string.Blue);
        }
        else if(color == 4){
            fragmentLayout.setBackgroundColor(Color.BLACK);
            text.setText(R.string.Black);
        }
        else if(color == 5){
            fragmentLayout.setBackgroundColor(Color.WHITE);
            text.setText(R.string.White);
        }
        else if(color == 6){
            fragmentLayout.setBackgroundColor(Color.GRAY);
            text.setText(R.string.Gray);
        }
        else if(color == 7){
            fragmentLayout.setBackgroundColor(Color.LTGRAY);
            text.setText(R.string.LightGray);
        }else if(color == 8){
            fragmentLayout.setBackgroundColor(Color.DKGRAY);
            text.setText(R.string.DKGray);
        }else if(color == 9){
            fragmentLayout.setBackgroundColor(Color.CYAN);
            text.setText(R.string.Cyan);
        }else if(color == 10){
            fragmentLayout.setBackgroundColor(Color.MAGENTA);
            text.setText(R.string.Magenta);
        }else if(color == 11){
            fragmentLayout.setBackgroundColor(Color.TRANSPARENT);
            text.setText(R.string.Transparent);
        }
    }

}