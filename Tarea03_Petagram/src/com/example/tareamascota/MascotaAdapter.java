package com.example.tareamascota;

import java.util.List;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>{
	
	public static class MascotaViewHolder extends RecyclerView.ViewHolder {      
        CardView cv;
        TextView mascotaNombre;
        TextView mascotaPuntaje;
        ImageView mascotaFoto;
 
        MascotaViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            mascotaNombre = (TextView)itemView.findViewById(R.id.nombre_mascota);
            mascotaPuntaje = (TextView)itemView.findViewById(R.id.puntaje_mascota);
            mascotaFoto = (ImageView)itemView.findViewById(R.id.foto_mascota);
        }
    }
	
	List<Mascota> mascotas;
	
	public MascotaAdapter(List<Mascota> mascotas){
		this.mascotas=mascotas;
	}
	
	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return mascotas.size();
	}

	@Override
	public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
		mascotaViewHolder.mascotaNombre.setText(mascotas.get(i).getNombre());
		mascotaViewHolder.mascotaPuntaje.setText(String.valueOf(mascotas.get(i).getPuntaje()));
		mascotaViewHolder.mascotaFoto.setImageResource(mascotas.get(i).getFoto());
		
	}

	@Override
	public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
		View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
	    MascotaViewHolder m = new MascotaViewHolder(v);
	    return m;
	}
	
	
	



}
