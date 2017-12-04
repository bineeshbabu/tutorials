package com.tutorial.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bineesh on 27/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<Data> {
    public CustomAdapter(Context context, ArrayList<Data> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Data user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.content, parent, false);
        }

        TextView tvName =  convertView.findViewById(R.id.name_text);
        TextView tvHome =  convertView.findViewById(R.id.place_text);
        tvName.setText(user.name);
        tvHome.setText(user.place);
        return convertView;
    }
}
