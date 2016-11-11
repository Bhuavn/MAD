package com.yuvan.bhuvan.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;
    EditText input;
    int number=10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.display);
        button=(Button) findViewById(R.id.count);
        input = (EditText) findViewById(R.id.input);

    }

    public void count(View view) {

        int num2= Integer.parseInt(input.getText().toString());
        number=number+num2;
        text.setText("R.string.result"+number);
        Toast.makeText(this, "Result:\t"+number, Toast.LENGTH_SHORT).show();

    }
}
