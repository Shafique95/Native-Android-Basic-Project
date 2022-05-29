package com.example.myspinnerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private  String[] countryname;
    private  String[] population;
    int[] flags;
    Context context;
    private LayoutInflater inflater;

    public CustomAdapter( Context context, int[] flags, String[] countryname, String[] population) {
        this.countryname = countryname;
        this.population = population;
        this.flags = flags;
        this.context = context;
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
            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view,null,false);
        }
        ImageView imageView = view.findViewById(R.id.imageViewId);
        //imageView.setImageResource(flags[i]);
        TextView country = view.findViewById(R.id.countrynameTextViewId);
       //country.setText(countryname[i]);
        TextView population2 = view.findViewById(R.id.populationTextViewId);
       //population2.setText(population[i]);
        return view;
    }
}
