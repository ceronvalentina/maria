package com.example.valentina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    EditText t1,t2;
    TextView v1;
    Button btnRestar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=(EditText) findViewById(R.id.txtnumerouno);
        t2=(EditText) findViewById(R.id.txtnumerodos);
        v1=(TextView) findViewById(R.id.textView6);
        btnRestar=(Button) findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float n1,n2,res;
        n1=Float.parseFloat(t1.getText().toString());
        n2=Float.parseFloat(t2.getText().toString());
        res=n1-n2;
        v1.setText("El resultado es:" +res);
        Toast.makeText(getApplicationContext(), "El resultado es:" +res, Toast.LENGTH_LONG).show();
    }
}