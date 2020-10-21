package edu.temple.ColorChangeApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ClickInterface{

    FragmentManager fm;
    public static final String bundle_data_key = "bundle_data_key";
    CanvasFragment canvasafragment = new CanvasFragment();
    PaletteFragment palettefragment = new PaletteFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        String[] colorlist = res.getStringArray(R.array.Colors);
        Bundle bun = new Bundle();
        bun.putStringArray(PaletteFragment.bundle_data_key,getResources().getStringArray(R.array.Colors));
        palettefragment.setArguments(bun);

        PaletteFragment fragment = PaletteFragment.newInstance(colorlist);
        //set bundle data to container
        fm = getSupportFragmentManager();

        fm.beginTransaction()
                .add(R.id.container1,canvasafragment)
                .add(R.id.container2,fragment)
                .commit();
    }

    public void itemSelected(int color){
        canvasafragment.setColorToShow(color);
    }
}




