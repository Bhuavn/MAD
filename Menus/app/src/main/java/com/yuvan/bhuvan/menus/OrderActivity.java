package com.yuvan.bhuvan.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.sameday:
                if(checked){
                    displayToast(getString(R.string.chosen)+
                            getString(R.string.same_day_messenger_service));
                    break;
                }

            case R.id.nextday:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.pick_up));
                break;
        }
    }

}

