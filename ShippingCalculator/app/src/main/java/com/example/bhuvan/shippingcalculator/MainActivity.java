package com.example.bhuvan.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText length,width,height;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        length =(EditText)findViewById(R.id.length);
        width=(EditText)findViewById(R.id.width);
        height=(EditText)findViewById(R.id.height);


    }
    public void sum(){
        int l=Integer.parseInt(length.getText().toString());
        int w=Integer.parseInt(width.getText().toString());
        int h=Integer.parseInt(height.getText().toString());
        int sum=l+w+h;
        Toast.makeText(this, "For express service, the base cost and added cost will be tripled"+sum, Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.express:

                if(checked){
                    sum();
                        //Toast.makeText(this, "For express service, the base cost and added cost will be tripled"+sum, Toast.LENGTH_SHORT).show();
                    }
                    break;


            case R.id.standard:
                if (checked)
                    Toast.makeText(this, "or standard shipping service, both the base cost and the added cost will be doubled", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ground:
                if (checked)
                    Toast.makeText(this, "There is no change in the cost calculation for ground shipping", Toast.LENGTH_SHORT).show();
                break;
        }
    }





}
