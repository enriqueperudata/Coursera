package com.example.tareaaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class IngresarDatos extends AppCompatActivity implements OnClickListener {
	
	private EditText etNombre, etTelefono, etEmail, etDescripcion;
	private DatePicker dpFechaNac;
	private Button btSiguiente;
	private Contacto c = new Contacto();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingresar_datos);

		etNombre = (EditText) findViewById(R.id.nombreCompleto);
		etTelefono= (EditText) findViewById(R.id.telefono);
		etEmail = (EditText) findViewById(R.id.email);
		etDescripcion = (EditText) findViewById(R.id.descripcionContacto);
		
		dpFechaNac=(DatePicker) findViewById(R.id.fecha_nacimiento);
		
		btSiguiente=(Button) findViewById(R.id.btSiguiente);
		btSiguiente.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ingresar_datos, menu);
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
		case R.id.btSiguiente:
			
			c.setNombre(this.etNombre.getText().toString());
			c.setFecha_nacimiento(String.valueOf(this.dpFechaNac.getDayOfMonth())+"/"+String.valueOf(this.dpFechaNac.getMonth()+1)+"/"+String.valueOf(this.dpFechaNac.getYear()));
			c.setTelefono(this.etTelefono.getText().toString());
			c.setEmail(this.etEmail.getText().toString());
			c.setDescripcion(this.etDescripcion.getText().toString());
			Intent act = new Intent(IngresarDatos.this,ConfirmarDatos.class);
			act.putExtra("parametro", c);
			startActivity(act);
			
			break;

		}
		
	}
}
