package com.example.listalenguajesprogramacionpersonalizado;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Recuperamos el identificador de la lista de lenguajes
		ListView listaLenguajes = (ListView) findViewById(R.id.listViewLenguajes);
		
		//Generamos una lista de lenguajes
		final ArrayList<Lenguaje> lenguajes = getLenguajes();
		
		//Iniciar el adaptador el cual llamara a cada uno de los elementos
		// y los asociara al layout respectivo
		LenguajeAdaptador adaptador = new LenguajeAdaptador(this, lenguajes);
		
		//Asociamos el adaptador a la vista a mostrar
		listaLenguajes.setAdapter(adaptador);
		
		//Indicamos la accion necesaria para saber que lenguaje se ha seleccionado
		listaLenguajes.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> padre, View vista, int posicion,
					long identificador) {
				//Recuperamos el elmento seleccionado
				Lenguaje lenguajeSeleccionado = lenguajes.get(posicion);
				//Generamos el mensaje respectivo
				String mensaje = "Posicion"+posicion+"--"+lenguajeSeleccionado.getNombre();
				//Generamos una notificacion
				Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();				
			}
		});
		
		
	}

	private ArrayList<Lenguaje> getLenguajes() {
		ArrayList<Lenguaje> lenguajes = new ArrayList<Lenguaje>();
		lenguajes.add(new Lenguaje(1, "Android", "android"));
		lenguajes.add(new Lenguaje(2, "Android", "android2"));
		return lenguajes;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
