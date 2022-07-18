package com.example.task_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumAdapter extends ArrayAdapter<Integer>{
    private int resourceId;
    public NumAdapter(Context context, int textViewResourceId, List<Integer> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Integer num=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView Numcontent=(TextView) view.findViewById(R.id.txt_content);
        Numcontent.setText(Num.getContent());
        return view;
    }
}
