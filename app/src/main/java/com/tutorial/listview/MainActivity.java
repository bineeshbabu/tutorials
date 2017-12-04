package com.tutorial.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CustomAdapter adapter;
    ArrayList<Data> array_name = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.listview);
        adapter = new CustomAdapter(this,array_name);
        lv.setAdapter(adapter);
        inputdata();
    }
    private void inputdata() {
        Data d = new Data("name 1","place 1");
        array_name.add(d);
        Data d1 = new Data("name 2","place 2");
        array_name.add(d1);
    }
}
