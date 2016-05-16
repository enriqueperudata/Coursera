package com.example.tareamascota;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SegundaPantalla extends AppCompatActivity{
	
	private List<Mascota> mascotas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda_pantalla);
		
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setIcon(R.drawable.ic_launcher);
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		RecyclerView rv2 = (RecyclerView)findViewById(R.id.rv2);
		rv2.setHasFixedSize(true);
		
		LinearLayoutManager llm = new LinearLayoutManager(getBaseContext());
		rv2.setLayoutManager(llm);
		
		mascotas = new ArrayList<>();
		mascotas.add(new Mascota("Pamela",5,R.drawable.mascota03));
		mascotas.add(new Mascota("Boby",4,R.drawable.mascota01));
		mascotas.add(new Mascota("Capitan",4,R.drawable.mascota02));
		mascotas.add(new Mascota("Michi",5,R.drawable.mascota04));
		mascotas.add(new Mascota("Stuart",0,R.drawable.mascota05));
		mascotas.add(new Mascota("Raxo",0,R.drawable.mascota06));
		mascotas.add(new Mascota("Visviridolfo",4,R.drawable.mascota07));
		
		List<Mascota> mascotasRanking = new ArrayList<>();
		
		for (int i = 0; i < mascotas.size(); i++) {
			if(mascotas.get(i).getPuntaje()!=0){
				mascotasRanking.add(mascotas.get(i));
			}
		}
		
		MascotaAdapter adapter = new MascotaAdapter(mascotasRanking);
		rv2.setAdapter(adapter);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda_pantalla, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
