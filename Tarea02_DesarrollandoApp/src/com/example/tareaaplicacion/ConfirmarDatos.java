package com.example.tareaaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity implements OnClickListener {
	
	private TextView tvNombreC, tvFechaC, tvTelefonoC, tvEmailC, tvDescripcionC;
	private Button btEditar;
	private Contacto c = new Contacto();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmar_datos);
		
		tvNombreC = (TextView) findViewById(R.id.tvNombreContacto);
		tvFechaC = (TextView) findViewById(R.id.tvFechaContacto);
		tvTelefonoC = (TextView) findViewById(R.id.tvTelefonoContacto);
		tvEmailC = (TextView) findViewById(R.id.tvEmailContacto);
		tvDescripcionC = (TextView) findViewById(R.id.tvDescripcionContacto);
	
		
		btEditar = (Button) findViewById(R.id.btEditar);
		btEditar.setOnClickListener(this);
		
		c= (Contacto)getIntent().getExtras().getSerializable("parametro");
		tvNombreC.setText(c.getNombre());
		tvFechaC.setText(c.getFecha_nacimiento());
		tvTelefonoC.setText(c.getTelefono());
		tvEmailC.setText(c.getEmail());
		tvDescripcionC.setText(c.getDescripcion());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.confirmar_datos, menu);
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

	@Override
	public void onClick(View v) {
		
		
		switch (v.getId()) {
		case R.id.btEditar:
			Intent act = new Intent(this, IngresarDatos.class);
			act.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			startActivity(act);
			break;

		}
		
	}
}
