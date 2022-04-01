package com.example.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaAdaptador.MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaAdaptador.MascotaViewHolder holder, int position) {
        Mascota mascota = mascotas.get(position);
        holder.img.setImageResource(mascota.getFoto());
        holder.nombre.setText(mascota.getNombre());
        //holder.madre.setText(mascota.getMadre());
        //holder.telefono.setText(mascota.getTelefono());


        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleMascota.class);
                intent.putExtra("Imagen", mascota.getFoto());
                intent.putExtra("Nombre", mascota.getNombre());
                intent.putExtra("Madre", mascota.getMadre());
                intent.putExtra("Telefono", mascota.getTelefono());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView nombre;
        //private TextView madre;
        //private TextView telefono;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img_cv_mascota);
            nombre = (TextView) itemView.findViewById(R.id.tv_cv_nombre);
            //madre = (TextView) itemView.findViewById(R.id.tv_madre);
            //telefono = (TextView) itemView.findViewById(R.id.tv_telefono);
        }
    }
}
