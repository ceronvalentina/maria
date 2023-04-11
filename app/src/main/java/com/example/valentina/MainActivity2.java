package com.example.valentina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    TextView tv1;
    Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1=(EditText) findViewById(R.id.txtnumero1);
        et2=(EditText) findViewById(R.id.txtnumero2);
        tv1=(TextView) findViewById(R.id.textView3);
        btnSumar=(Button) findViewById(R.id.btnsumar);
        btnSumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float n1,n2,res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res=n1+n2;
        tv1.setText("El resultado es:" +res);
        Toast.makeText(getApplicationContext(), "El resultado es:" +res, Toast.LENGTH_LONG).show();
    }
    public void volver1 (View view)
    {
        Intent miIntent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(miIntent);
    }
}