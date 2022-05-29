package com.example.mycustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int[] flags;
    String[] countryname;
    Context context;
    private LayoutInflater layoutInflater;
    CustomAdapter(Context context, String[] countryname, int[] flags){
        this.context=context;
        this.countryname= countryname;
        this.flags = flags;

    }
    @Override
    public int getCount() {
        return countryname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
          layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         view =layoutInflater.inflate(R.layout.sample_view,viewGroup,false);
        }
        ImageView imageView = view.findViewById(R.id.imageViewId);
        TextView textView = view.findViewById(R.id.country_nameId);
        imageView.setImageResource(flags[i]);
        textView.setText(countryname[i]);
        return view;
    }
}
