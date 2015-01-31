package com.emil.khasnyojambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class SouvenirActivity extends Activity {
	ImageButton imageButton1;
	ImageButton imageButton2;
	ImageButton imageButton3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_souvenir);
		imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
		imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
		imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
	
	}
	public void openTemp (View v){
		Intent i = new Intent (getApplicationContext(),TemphoyacActivity.class);
		startActivity(i);
		finish();
	}
	public void openJakoz (View v){
		Intent i = new Intent (getApplicationContext(),JakozActivity.class);
		startActivity(i);
		finish();
		
	}
	public void openKayo (View v){
		Intent i = new Intent (getApplicationContext(),KayoAnugerahActivity.class);
		startActivity(i);
		finish();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.souvenir, menu);
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
