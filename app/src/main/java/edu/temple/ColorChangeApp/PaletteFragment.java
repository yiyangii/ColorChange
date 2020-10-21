package edu.temple.ColorChangeApp;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;


public class PaletteFragment extends Fragment {
    // int [] colorid = {Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.
    // BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};
    String [] Colorsfrag;
    public static final String bundle_data_key = "bundle_data_key";

    //static String[] colors = {"Red", "Yellow", "Green", "Blue", "Black", "White", "Gray","Light gray","Dark gray","Cyan","Magenta","Transparent"};;
    private static final String Key = "colors";
    ClickInterface parentActivity;
    GridView gridview;




    public static PaletteFragment newInstance(String[] colors) {
        Bundle bundle = new Bundle();
        //initial bundle
        PaletteFragment plattefragment = new PaletteFragment();


        //send data to main
        bundle.putStringArray(Key, colors);
        plattefragment.setArguments(bundle);
        return plattefragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle;
        if ((bundle = getArguments()) != null) {
            Colorsfrag = bundle.getStringArray(Key);
        } else {
            Colorsfrag = null;
        }

    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof ClickInterface) {
            parentActivity = (ClickInterface) context;
        } else {
            throw new RuntimeException("You must implement...");
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fourth, container, false);

        gridview = view.findViewById(R.id.gridview);

        Resources res = getResources();
        final String[] colorList = res.getStringArray(R.array.Colors);

        gridview.setAdapter(new ColorAdapter(getActivity(),colorList));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parentActivity.itemSelected(position);
            }
        });

        return view;

    }

    public interface ClickInterface{
        void itemSelected(int color);

    }
}