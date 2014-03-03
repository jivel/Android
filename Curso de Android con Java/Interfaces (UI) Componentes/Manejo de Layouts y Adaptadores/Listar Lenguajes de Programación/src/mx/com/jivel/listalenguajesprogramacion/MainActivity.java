package mx.com.jivel.listalenguajesprogramacion;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 1. Obtenemos los identificadores de los elementos UI
		final EditText editTextLenguajeProg = (EditText) findViewById(R.id.editTextLenguajeProg);

		ListView listViewLenguajes = (ListView) findViewById(R.id.listViewLenguajes);

		// 2. Creamos un ArrayList y le agregamos algunos lenguajes
		final ArrayList<String> lenguajes = new ArrayList<String>();
		lenguajes.add("Java");
		lenguajes.add("Python");

		// 3. Creamos el adaptador que enlazara el arreglo con el ListView
		// Utilizamos un layout que ya nos proporciona Android:
		// simple_list_item_1
		final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, lenguajes);

		// 4. Enlazamos el adaptador de datos con el ListView
		listViewLenguajes.setAdapter(adaptador);

		// 5. Capturamos el evento Enter para agregar nuevos elementos
		editTextLenguajeProg.setOnKeyListener(new OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// Recuperamos la accion del evento
				if (event.getAction() == KeyEvent.ACTION_DOWN) {
					// Verificamos se ha presionado enter o KEYCODE_DPAD_CENTER
					if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER
							|| keyCode == KeyEvent.KEYCODE_ENTER) {

						// Agregamos el nuevo lenguaje
						lenguajes
								.add(editTextLenguajeProg.getText().toString());
						// limpiamos el campo de agregar lenguajes
						editTextLenguajeProg.setText("");
						// NOtificamos el cambio en la lista de lenguajes
						adaptador.notifyDataSetChanged();
						return true;

					}

				}
				return false;
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
