package com.example.valentina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    EditText td1,td2;
    TextView vv1;
    Button btnDividir;

    calculard calcu;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setContentView(R.layout.activity_main4);
        td1=(EditText) findViewById(R.id.txtnumone);
        td2=(EditText) findViewById(R.id.txtnumtwo);
        vv1=(TextView) findViewById(R.id.textView12);
        btnDividir=(Button) findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(this);

        calcu= new calculard();
    }

    @Override
    public void onClick(View view) {
        float n1,n2,res;
        n1=Float.parseFloat(td1.getText().toString());
        n2=Float.parseFloat(td2.getText().toString());
        res=n1/n2;
        vv1.setText("El resultado es:" +res);
        Toast.makeText(getApplicationContext(), "El resultado es:" +res, Toast.LENGTH_LONG).show();
    }
    public void volver4 (View view)
    {
        Intent miIntent=new Intent(MainActivity5.this,MainActivity.class);
        startActivity(miIntent);
    }
}