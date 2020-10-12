package com.example.fomulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.DatePicker;

import com.example.formulario.R;

public class MainActivity extends AppCompatActivity {

    EditText et, et2, et3, et4;
    String st, st2, st3, st4;
    DatePicker fecha;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextName);
        fecha = findViewById(R.id.datePickerBirthday);
        et2 = findViewById(R.id.editTextMail);
        et3 = findViewById(R.id.editTextTelefono);
        et4 = findViewById(R.id.editTextDescripcion);
        siguiente = findViewById(R.id.buttonSiguiente);

        et.setText(getIntent().getStringExtra("Value"));
        et2.setText(getIntent().getStringExtra("Mail"));
        et3.setText(getIntent().getStringExtra("Telefono"));
        et4.setText(getIntent().getStringExtra("Descripcion"));

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!et.getText().toString().isEmpty() && !et3.getText().toString().isEmpty() && !et2.getText().toString().isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, PantallaConfirmacion.class);
                    intent.putExtra("Value", et.getText().toString());
                    intent.putExtra("Fecha", String.valueOf(fecha.getMonth() + 1) + '-' + (fecha.getDayOfMonth()) + '-' + (fecha.getYear()));
                    intent.putExtra("Mail", et2.getText().toString());
                    intent.putExtra("Telefono", et3.getText().toString());
                    intent.putExtra("Descripcion", et4.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Fill all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}