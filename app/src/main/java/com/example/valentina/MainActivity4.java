package com.example.valentina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{

    EditText tt1,tt2;
    TextView vt1;
    Button btnMultiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tt1=(EditText) findViewById(R.id.txt1numero);
        tt2=(EditText) findViewById(R.id.txt2numero);
        vt1=(TextView) findViewById(R.id.textView9);
        btnMultiplicar=(Button) findViewById(R.id.btnmulti);
        btnMultiplicar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float n1,n2,res;
        n1=Float.parseFloat(tt1.getText().toString());
        n2=Float.parseFloat(tt2.getText().toString());
        res=n1*n2;
        vt1.setText("El resultado es:" +res);
        Toast.makeText(getApplicationContext(), "El resultado es:" +res, Toast.LENGTH_LONG).show();
    }
    public void volver3 (View view)
    {
        Intent miIntent=new Intent(MainActivity4.this,MainActivity.class);
        startActivity(miIntent);
    }
}