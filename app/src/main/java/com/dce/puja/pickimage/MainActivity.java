package com.dce.puja.pickimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;

import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     @Override

    public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.main, menu);
    return true;
     }
    public void btn_click(View v) {
        edt = (EditText) findViewById(R.id.editText1);
        edt1 = (EditText) findViewById(R.id.editText2);
    }

    String uname = edt.getText().toString();
    String pass = edt1.getText().toString();
 if(uname.equals("admin") && pass.equals("admin"))

    {

        Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show();
        Intent a = new Intent(this, Homeactivity.class);
        a.putExtra("uname", uname);
        startActivity(a);
    }
    else

    {
        Toast.makeText(this,"Enter Valid name and password",Toast.LENGTH_LONG).show();
    }
}
