package com.example.grin.saborised;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void irMain (View view){
        Toast.makeText(this,"Compra realizada exitosamente",Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
