package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMascotas = (RecyclerView) findViewById(R.id.rvPerritos);

        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rvMascotas.setLayoutManager(glm);
        llenarLista();

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        rvMascotas.setAdapter(adaptador);
    }

    public void llenarLista(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.m1, "Cappu", "Gor", "258369"));
        mascotas.add(new Mascota(R.drawable.m2, "Ratitaa", "Goor", "357159"));
        mascotas.add(new Mascota(R.drawable.m3, "Kiara", "Bodoque", "245312"));
        mascotas.add(new Mascota(R.drawable.m4, "Junior", "Ardilla", "856752"));
        mascotas.add(new Mascota(R.drawable.m5, "Balu", "Shiber", "154785"));
        //mascotas.add(new Mascota(R.drawable.mascota5, "Ody", "ArdillayShiber", "253421"));
    }
}