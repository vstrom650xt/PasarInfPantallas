package com.example.pasarinfpantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//PONER EN EL MANIFFEST LA NUEVA ACTIVIDAD
public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnVerificar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerificar = findViewById(R.id.btnVerifi);
        btnVerificar.setOnClickListener(view -> lanzarVerificar(null));

        textView =findViewById(R.id.tVResultado);

        Bundle extras = getIntent().getExtras();
        String s=  extras.getString("resultado");
        textView.setText(s+" que pasa");




    }

    public void lanzarVerificar(View view){
        Intent i = new Intent(this,TwoActivity.class);
        editText = findViewById(R.id.Texto);
        i.putExtra("nombre",editText.getText().toString());
        startActivity(i);


    }
}