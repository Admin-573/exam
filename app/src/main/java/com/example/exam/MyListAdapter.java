package com.example.exam;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.Struct;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListAdapter (Activity context,String[] maintitle,String[] subtitle,Integer[] imgid){
        super(context,R.layout.mylist,maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.mylist,null ,true);

        TextView textView = rowView.findViewById(R.id.MainTitle);
        TextView textView1 = rowView.findViewById(R.id.SubTitle);
        ImageView imageView = rowView.findViewById(R.id.icon);

        textView.setText(maintitle[position]);
        textView1.setText(subtitle[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;
    }
}
