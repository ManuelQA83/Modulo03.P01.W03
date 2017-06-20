package com.example.manuelqa.modulo03p01w03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarActivityConfirmacion (View view){
        Intent i=new Intent(MainActivity.this,ConfirmacionDatos.class);

        EditText etxt01=(EditText)findViewById(R.id.txtNombre);
        String nombre= etxt01.getText().toString();

        DatePicker etxt02=(DatePicker)findViewById(R.id.datePicker);
        String dia=Integer.toString(etxt02.getDayOfMonth());
        String mes=Integer.toString(etxt02.getMonth()+1);
        String anio=Integer.toString(etxt02.getYear());
        String fecha=dia+"/"+mes+"/"+anio;

        EditText etxt03=(EditText) findViewById(R.id.txtTelefono);
        String telefono=etxt03.getText().toString();

        EditText etxt04=(EditText) findViewById(R.id.txtEmail);
        String email=etxt04.getText().toString();

        EditText etxt05=(EditText) findViewById(R.id.txtDescripcion);
        String descripcion=etxt05.getText().toString();

        i.putExtra(getResources().getString(R.string.ElNombre),nombre);
        i.putExtra(getResources().getString(R.string.LaFecha),fecha);
        i.putExtra(getResources().getString(R.string.ElTelefono),telefono);
        i.putExtra(getResources().getString(R.string.ElEmail),email);
        i.putExtra(getResources().getString(R.string.LaDescripcion),descripcion);

        startActivity(i);
    }

}
