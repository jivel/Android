package mx.com.jivel.ciclovidaactividad;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	
	private static final String TAG = "MainActivity";
	
	//Creando la Actividad
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Plantilla a utilizar
		setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate... Creando Actividad");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart... Iniciando la Actividad");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume...");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause... Actividad no visible");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop... Actividad detenida");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart... Reiniciando Actividad");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy... Actividad Destruida");
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.d(TAG, "onRestoreInstanceState... Restaurando estado de la Actividad");
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "onSaveInstanceState... Guardando estado de la Actividad");
	}

}
