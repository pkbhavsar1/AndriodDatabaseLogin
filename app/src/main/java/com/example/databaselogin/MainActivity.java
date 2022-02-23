package com.example.databaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    EditText pass;
    Button login;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText )findViewById(R.id.editText1);
        pass=(EditText )findViewById(R.id.editText2);
        login=(Button )findViewById(R.id.button1);
        cancel=(Button )findViewById(R.id.button2);
        login.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        String na=name.getText().toString();
        String pa=pass.getText().toString();
        switch(v.getId())
        {
            case R.id.button1:
                if(na.equals("Namita") && pa.equals("nami"))
                {
                    Intent i = new Intent(this,MainActivity2.class);
                    i.putExtra("c1", na);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(this,"check #username or #Password", 3600).show();
                }
                break;
            case R.id.button2:
                name.setText("");
                pass.setText("");
                break;
            default:
                break;  }
    }
}