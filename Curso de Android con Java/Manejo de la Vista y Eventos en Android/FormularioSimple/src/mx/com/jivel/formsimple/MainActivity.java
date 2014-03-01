package mx.com.jivel.formsimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Recuperar las etiquetas de resultados
		// Es necesario hacer el CAST puesto que findViewById retorna un tipo
		// Object
		TextView nomEscrito = (TextView) findViewById(R.id.textViewNomEscrito);
		TextView apeEscrito = (TextView) findViewById(R.id.textViewApeEscrito);
		TextView telEscrito = (TextView) findViewById(R.id.textViewTelEscrito);
		TextView emailEscrito = (TextView) findViewById(R.id.textViewEmailEscrito);
		TextView datosProporcionados = (TextView) findViewById(R.id.textViewResultado);
		nomEscrito.setText("");
		apeEscrito.setText("");
		telEscrito.setText("");
		emailEscrito.setText("");
		datosProporcionados.setText("");
		// Asociamos el evento onclick al botón de enviar y limpiar
		Button botonEnviar = (Button) findViewById(R.id.buttonEnviar);
		Button botonLimpiar = (Button) findViewById(R.id.buttonLimpiar);

		botonEnviar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText nombre = (EditText) findViewById(R.id.editTextNombre);
				EditText apellido = (EditText) findViewById(R.id.editTextApellido);
				EditText telefono = (EditText) findViewById(R.id.editTextTelefono);
				EditText email = (EditText) findViewById(R.id.editTextEmail);

				TextView nomEscrito = (TextView) findViewById(R.id.textViewNomEscrito);
				TextView apeEscrito = (TextView) findViewById(R.id.textViewApeEscrito);
				TextView telEscrito = (TextView) findViewById(R.id.textViewTelEscrito);
				TextView emailEscrito = (TextView) findViewById(R.id.textViewEmailEscrito);
				TextView datosProporcionados = (TextView) findViewById(R.id.textViewResultado);

				// Asignar los valores de respuesta
				datosProporcionados.setText("Datos Proporcionados");
				nomEscrito.setText("Nombre(s): " + nombre.getText().toString());
				apeEscrito.setText("Apellido(s): "
						+ apellido.getText().toString());
				telEscrito.setText("Telefono(s): "
						+ telefono.getText().toString());
				emailEscrito.setText("eMail: " + email.getText().toString());
			}
		});

		botonLimpiar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				EditText nombre = (EditText) findViewById(R.id.editTextNombre);
				EditText apellido = (EditText) findViewById(R.id.editTextApellido);
				EditText telefono = (EditText) findViewById(R.id.editTextTelefono);
				EditText email = (EditText) findViewById(R.id.editTextEmail);
				nombre.setText("");
				apellido.setText("");
				telefono.setText("");
				email.setText("");

				TextView nomEscrito = (TextView) findViewById(R.id.textViewNomEscrito);
				TextView apeEscrito = (TextView) findViewById(R.id.textViewApeEscrito);
				TextView telEscrito = (TextView) findViewById(R.id.textViewTelEscrito);
				TextView emailEscrito = (TextView) findViewById(R.id.textViewEmailEscrito);
				TextView datosProporcionados = (TextView) findViewById(R.id.textViewResultado);
				nomEscrito.setText("");
				apeEscrito.setText("");
				telEscrito.setText("");
				emailEscrito.setText("");
				datosProporcionados.setText("");

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
