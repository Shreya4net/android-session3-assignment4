package com.dce.puja.pickimage;

import android.app.Activity;
import java.util.RandomAccess;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Devendra on 4/9/2017.
 */

public class Homeactivity extends Activity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txt=(TextView)findViewById(R.id.textView1);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("uname");
        txt.setText("Welcome " + message + "!!");
    }
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
       getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
