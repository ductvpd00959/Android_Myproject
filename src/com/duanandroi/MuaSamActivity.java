package com.duanandroi;

import com.duanandroi.R;
import com.thongtinmuasam.ChoHanActivity;
import com.thongtinmuasam.MingheDaActivity;
import com.thongtinmuasam.MingheHoiAnActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class MuaSamActivity extends Activity {
	LinearLayout mschohan, msminghe, msmingheda;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mua_sam);
		mschohan = (LinearLayout) findViewById(R.id.mschohan);
		msminghe = (LinearLayout) findViewById(R.id.msminghehoian);
		msmingheda = (LinearLayout) findViewById(R.id.msmingheda);
		//
		mschohan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MuaSamActivity.this,
						ChoHanActivity.class);
				startActivity(intent);

			}
		});
		msminghe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MuaSamActivity.this,
						MingheHoiAnActivity.class);
				startActivity(intent);

			}
		});
		msmingheda.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MuaSamActivity.this,
						MingheDaActivity.class);
				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mua_sam, menu);
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
