package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {

    private ImageView Dimg;
    private TextView Dnombre;
    private TextView Dmadre;
    private TextView Dtelefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Bundle parametros = getIntent().getExtras();
        int img = parametros.getInt("Imagen");
        String nombre = parametros.getString("Nombre");
        String madre = parametros.getString("Madre");
        String telefono = parametros.getString("Telefono");

        Dimg = (ImageView) findViewById(R.id.img_detalle);
        Dnombre = (TextView) findViewById(R.id.tv_nombre);
        Dmadre = (TextView) findViewById(R.id.tv_madre);
        Dtelefono = (TextView) findViewById(R.id.tv_telefono);

        Dimg.setImageResource(img);
        Dnombre.setText(nombre);
        Dmadre.setText(madre);
        Dtelefono.setText(telefono);

    }


}