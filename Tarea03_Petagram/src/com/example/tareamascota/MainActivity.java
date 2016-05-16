package com.example.tareamascota;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
	
	private List<Mascota> mascotas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setIcon(R.drawable.ic_launcher);
		
		RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
		rv.setHasFixedSize(true);
		
		LinearLayoutManager llm = new LinearLayoutManager(getBaseContext());
		rv.setLayoutManager(llm);
		
		mascotas = new ArrayList<>();
		mascotas.add(new Mascota("Pamela",5,R.drawable.mascota03));
		mascotas.add(new Mascota("Boby",4,R.drawable.mascota01));
		mascotas.add(new Mascota("Capitan",4,R.drawable.mascota02));
		mascotas.add(new Mascota("Michi",5,R.drawable.mascota04));
		mascotas.add(new Mascota("Stuart",0,R.drawable.mascota05));
		mascotas.add(new Mascota("Raxo",0,R.drawable.mascota06));
		mascotas.add(new Mascota("Visviridolfo",4,R.drawable.mascota07));
		
		MascotaAdapter adapter = new MascotaAdapter(mascotas);
		rv.setAdapter(adapter);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
			return true;
		case R.id.estrella:
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	public void metodo2(MenuItem item){
		Intent i = new Intent(MainActivity.this, SegundaPantalla.class);
		startActivity(i);
	}
	
}
