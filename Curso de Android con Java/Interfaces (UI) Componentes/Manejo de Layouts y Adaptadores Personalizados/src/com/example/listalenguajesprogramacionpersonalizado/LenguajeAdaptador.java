package com.example.listalenguajesprogramacionpersonalizado;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LenguajeAdaptador extends BaseAdapter {
	private Activity actividad;
	private ArrayList<Lenguaje> lenguajes;

	public LenguajeAdaptador(Activity actividad, ArrayList<Lenguaje> lenguajes) {
		super();
		this.actividad = actividad;
		this.lenguajes = lenguajes;
	}

	@Override
	public int getCount() {
		return lenguajes.size();
	}

	@Override
	public Object getItem(int posicion) {
		return lenguajes.get(posicion);
	}

	@Override
	public long getItemId(int posicion) {
		return lenguajes.get(posicion).getId();
	}
	
	//Este Metodo se manda a llamar por cada uno de los elementos
	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		//Crear referencia de la vista a utilizar
		View vista = view;
		//Verificamos si la vista es null
		if (vista == null) {
			//Si es nula se debera mostrar
			//LayoutInflater nos permitira hacelo
			LayoutInflater inflater = (LayoutInflater) actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			vista = inflater.inflate(R.layout.lista_lenguajes_layout, null);
		}
		//Recuperamos la posicion del elemento con el cual se esta trabajando
		Lenguaje lenguaje = lenguajes.get(position);
		//Recuperamos la referencia del nombre
		TextView nombre = (TextView) vista.findViewById(R.id.nomLenguaje);
		nombre.setText(lenguaje.getNombre());
		//Recuperamos la referencia de la imagen
		ImageView imagen = (ImageView) vista.findViewById(R.id.imgLenguaje);
		int identificadorImg = actividad.getResources().getIdentifier( "drawable/"+lenguaje.getImagen(), null, actividad.getPackageName());
		imagen.setImageDrawable(actividad.getResources().getDrawable(identificadorImg));

		//Retornamos la vista la cual en este caso el el layout de lista_lenguajes_layout
		return vista;
	}

}
