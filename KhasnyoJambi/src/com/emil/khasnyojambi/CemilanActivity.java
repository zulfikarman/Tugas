package com.emil.khasnyojambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class CemilanActivity extends Activity {
	ImageButton imageButton1;
	ImageButton imageButton2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cemilan);
		imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
		imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
	}
	
	public void openJenisRizki (View v){
		Intent i = new Intent (getApplicationContext(),JenisRizkiActivity.class);
		startActivity(i);
		finish();
	}
	public void openJenisKayo (View v){
		Intent i = new Intent (getApplicationContext(),JenisKayoActivity.class);
		startActivity(i);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cemilan, menu);
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
