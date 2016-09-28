package com.yuvan.bhuvan.menus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.yuvan.bhuvan.menus.R.id.fab;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int no=0;
    TextView text;
    ImageView Donut,IceCream,Froyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text = (TextView)findViewById(R.id.text);

        Donut =(ImageView) findViewById(R.id.donut);
        IceCream =(ImageView) findViewById(R.id.ice_cream);
        Froyo =(ImageView) findViewById(R.id.froyo);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMap();
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
            }
        });

    }
    public void displayMap() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        // Using the coordinates for Google headquarters.
        //16.7881, 80.8465
        //16.791119,80.822554
        String data = String.format("geo:%s,%s", 16.791119 , 80.822554);
        String zoomLevel = "10";
        if (zoomLevel != null) {
            data = String.format("%s?z=%s", data, zoomLevel);
        }
        intent.setData(Uri.parse(data));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch(id){

            case R.id.order:
                //Toast.makeText(this, " clicked on user", Toast.LENGTH_SHORT).show();
                //add();
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
                //break;

            case R.id.cart:
                Toast.makeText(this, " clicked on cart", Toast.LENGTH_SHORT).show();
                break;

            case R.id.alerts:
                Toast.makeText(this, " clicked on Alerts ", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, " clicked on Some where ", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showDonutOrder(View view) {
        displayToast(getString(R.string.donut_order_message));
    }

    public void showIceCreamOrder(View view) {
        displayToast(getString(R.string.ice_cream_order_message));
    }

    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_message));
    }
}
