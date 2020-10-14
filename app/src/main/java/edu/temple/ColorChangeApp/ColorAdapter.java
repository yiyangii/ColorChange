package edu.temple.ColorChangeApp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String[] colors;
    final int [] colorid = {Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.BLACK,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.TRANSPARENT};

    public ColorAdapter(Context context, String[] colors){
        this.context = context;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        TextView textView;
        if(convertView == null){
            textView = new TextView(context);
        }else{
            textView = (TextView) convertView;
        }
        //set up textView
        textView.setPadding(40,40,40,40);
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colorid[position % colorid.length]);
        return textView;
    }
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        return getView(position,convertView,parent);
    }
}
