package com.example.pasarinfpantallas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnAcept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        textView = findViewById(R.id.textView2);

        btnAcept = findViewById(R.id.btnaceptar);

        btnAcept.setOnClickListener(view -> lanzarVerificarAeptar(null));



        Bundle extras = getIntent().getExtras();
        String s=  extras.getString("nombre");
        textView.setText(s+" que pasa");

    }
    public void lanzarVerificarAeptar(View view){
        Intent i = new Intent(this,MainActivity.class);
        textView = findViewById(R.id.textView2);
        i.putExtra("resultado",textView.getText().toString());

        startActivity(i);


    }

}
