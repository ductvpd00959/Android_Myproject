package com.duanandroi;

import com.duanandroi.R;
import com.thongtindulich.BanaHillActivity;
import com.thongtindulich.CityBridgeActivity;
import com.thongtindulich.LinhUngActivity;
import com.thongtindulich.NguHanhSonActivity;
import com.thongtindulich.PhoBienActivity;
import com.thongtindulich.PhoCoHoiAnActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class DuLichActivity extends Activity {
	LinearLayout bana, bien, hoian, bridge, linhung, nguhanhson;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_du_lich);
		bana = (LinearLayout) findViewById(R.id.dlbanahill);
		bien = (LinearLayout) findViewById(R.id.dlphobien);
		hoian = (LinearLayout) findViewById(R.id.dlhoian);
		bridge = (LinearLayout) findViewById(R.id.dlbridge);
		linhung = (LinearLayout) findViewById(R.id.dllinhung);
		nguhanhson = (LinearLayout) findViewById(R.id.dlnguhanhson);
		//
		bana.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bana = new Intent(DuLichActivity.this,
						BanaHillActivity.class);
				startActivity(bana);
			}
		});
		bien.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bien = new Intent(DuLichActivity.this,
						PhoBienActivity.class);
				startActivity(bien);
			}
		});
		hoian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bana = new Intent(DuLichActivity.this,
						PhoCoHoiAnActivity.class);
				startActivity(bana);
			}
		});
		linhung.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bana = new Intent(DuLichActivity.this,
						LinhUngActivity.class);
				startActivity(bana);
			}
		});
		bridge.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bana = new Intent(DuLichActivity.this,
						CityBridgeActivity.class);
				startActivity(bana);
			}
		});
		nguhanhson.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bana = new Intent(DuLichActivity.this,
						NguHanhSonActivity.class);
				startActivity(bana);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.du_lich, menu);
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
