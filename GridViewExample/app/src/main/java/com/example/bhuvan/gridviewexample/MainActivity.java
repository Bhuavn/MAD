package com.example.bhuvan.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k"};
    GridView grid_alpha;
    ArrayAdapter<String> alphaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid_alpha = (GridView) findViewById(R.id.grid_alphabet);
        alphaAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alphabets);
        grid_alpha.setAdapter(alphaAdapter);
    }
}
