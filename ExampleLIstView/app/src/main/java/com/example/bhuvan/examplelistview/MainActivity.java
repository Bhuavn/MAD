package com.example.bhuvan.examplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] branchs = {"CSE","ECE","MECH","CIVIL","MME","CHEM"};
    ListView listBranches;
    ArrayAdapter<String> branchAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listBranches = (ListView) findViewById(R.id.list_branchs);
        branchAdapter = new ArrayAdapter<String>(this,R.layout.one_item,branchs);
        listBranches.setAdapter(branchAdapter);
    }
}
