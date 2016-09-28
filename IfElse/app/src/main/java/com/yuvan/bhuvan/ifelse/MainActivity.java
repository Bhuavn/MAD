package com.yuvan.bhuvan.ifelse;

import android.os.DropBoxManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button enter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.display);
        input=(EditText)findViewById(R.id.inputAge);
        enter=(Button)findViewById(R.id.enter);






    }

    public void IfElse(View view) {
        int userInput;
        userInput= Integer.parseInt(input.getText().toString());
        String msg1="Your Age is Greater than 18";
        String msg2="Your Age is Less than 18";

        if(userInput>18){
            Toast.makeText(this, msg1, Toast.LENGTH_SHORT).show();
           textView.setText("Your Age is Greater than 18");
           // textView.setText(R.string.major);

        }else {
            Toast.makeText(this, msg2, Toast.LENGTH_SHORT).show();
            textView.setText(R.string.minor);
        }


    }

    public void SwitchExample(View view) {

        int userInput = parseInt(input.getText().toString());
        switch(userInput){
            case 10:
                textView.setText("you have entered 10");
                break;
                //System.out.println("10");break;
            case 20:
                textView.setText("you have entered 20");
                break;
                //System.out.println("20");break;
            case 30:
                textView.setText("you have entered 30");
                break;
                //System.out.println("30");break;
            default:
                textView.setText("Not in 10, 20 or 30");
                //System.out.println("Not in 10, 20 or 30");
        }


    }

    public void ForExample(View view) {
        int userInput = parseInt(input.getText().toString());

        String display="";
        for(int i=1;i<=userInput;i++){
            display +=i;
            display +="\n";


           // textView.setText(String.valueOf(i));

        }
        textView.setText(""+display);
    }
}
