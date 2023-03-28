package com.example.valentina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void uno (View view)
    {
        Intent miIntent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(miIntent);
    }

    public void dos (View view)
    {
        Intent miIntent=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(miIntent);
    }

    public void tres (View view)
    {
        Intent miIntent=new Intent(MainActivity.this,MainActivity4.class);
        startActivity(miIntent);
    }

    public void cuatro (View view)
    {
        Intent miIntent=new Intent(MainActivity.this,MainActivity5.class);
        startActivity(miIntent);
    }
}