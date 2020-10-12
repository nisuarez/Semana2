package com.example.fomulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.widget.DatePicker;

import com.example.formulario.R;

public class PantallaConfirmacion extends AppCompatActivity {

    TextView tv, tv2,tv3, tv4, fecha;
    String st, st2, st3, st4;
    Button editar;

    Intent intenti = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmacion);

        tv = findViewById(R.id.myTextView);
        fecha = findViewById(R.id.myTextViewBirthday);
        tv2 = findViewById(R.id.myTextView2);
        tv3 = findViewById(R.id.myTextView3);
        tv4 = findViewById(R.id.myTextView4);
        editar = findViewById(R.id.buttonEditar);

        tv.setText(getIntent().getStringExtra("Value"));
        fecha.setText(getIntent().getStringExtra("Fecha"));
        tv2.setText(getIntent().getStringExtra("Mail"));
        tv3.setText(getIntent().getStringExtra("Telefono"));
        tv4.setText(getIntent().getStringExtra("Descripcion"));

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intenti = new Intent (PantallaConfirmacion.this, MainActivity.class);
                retenerdatos();
                startActivity(intenti);
            }

        });

    }

    public void retenerdatos()
    {
        intenti.putExtra("Value",tv.getText().toString());
        intenti.putExtra("Mail",tv2.getText().toString());
        intenti.putExtra("Telefono",tv3.getText().toString());
        intenti.putExtra("Descripcion",tv4.getText().toString());
    }

}