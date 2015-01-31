package com.emil.khasnyojambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton imageButton1;
	ImageButton imageButton2;
	ImageButton imageButton3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
		 imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
		imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
		
		
	}
	public void openMakanan (View v){
		Intent i = new Intent (getApplicationContext(),MakananActivity.class);
		startActivity(i);
		finish();
	}
	public void openSouvenir (View v){
		Intent i = new Intent (getApplicationContext(),SouvenirActivity.class);
		startActivity(i);
		finish();
		
	}
	public void openCemilan(View v){
		Intent i = new Intent (getApplicationContext(),CemilanActivity.class);
		startActivity(i);
		finish();
		
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
