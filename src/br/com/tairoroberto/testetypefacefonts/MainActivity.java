package br.com.tairoroberto.testetypefacefonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private Button btnTexto;
	private TextView txtTexto;
	private EditText edtTexto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnTexto = (Button)findViewById(R.id.btnTexto);
		edtTexto = (EditText)findViewById(R.id.edtTexto);
		txtTexto = (TextView)findViewById(R.id.txtTexto);
		
		//Define o TypeFace para pegar a fonte no diretotio
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Black.ttf");
		Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
		Typeface font3 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-BoldItalic.ttf");
		
		btnTexto.setTypeface(font);
		edtTexto.setTypeface(font2);
		txtTexto.setTypeface(font3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
