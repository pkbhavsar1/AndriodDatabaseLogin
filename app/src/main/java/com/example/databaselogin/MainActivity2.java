package com.example.databaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String str = i.getStringExtra("c1");
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText("Username : " + str);
        Logout = (Button) findViewById(R.id.button1);
        Logout.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
    public void onClick(View v1) {
        switch (v1.getId()) {
            case R.id.button1:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();
                System.exit(0);
                break;
            default:
                break;
        }
    }

}