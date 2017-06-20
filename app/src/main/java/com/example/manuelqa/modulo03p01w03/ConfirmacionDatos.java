package com.example.manuelqa.modulo03p01w03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        Bundle extras=getIntent().getExtras();
        String nombreIn=extras.getString(getResources().getString(R.string.ElNombre));
        String fechaIn=extras.getString(getResources().getString(R.string.LaFecha));
        String tlfIn=extras.getString(getResources().getString(R.string.ElTelefono));
        String emailIn=extras.getString(getResources().getString(R.string.ElEmail));
        String descpIn=extras.getString(getResources().getString(R.string.LaDescripcion));

        TextView parteNombre=(TextView)findViewById(R.id.txtNombA02);
        TextView parteFecha=(TextView)findViewById(R.id.txtFecNacA02);
        TextView parteTlf=(TextView)findViewById(R.id.txtTelefonoA02);
        TextView parteEmail=(TextView)findViewById(R.id.txtEmailA02);
        TextView parteDescp=(TextView)findViewById(R.id.txtDescpA02);

        parteNombre.setText(nombreIn);
        parteFecha.setText(fechaIn);
        parteTlf.setText(tlfIn);
        parteEmail.setText(emailIn);
        parteDescp.setText(descpIn);
    }



    public void backActivityInicio(View view){
       onBackPressed();
    }

}
