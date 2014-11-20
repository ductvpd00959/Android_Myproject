package com.duanandroi;

import com.duanandroi.R;
import com.thongtinanuong.BanhTrangActivity;
import com.thongtinanuong.BanhmiActivity;
import com.thongtinanuong.CaoLauHoiAnActivity;
import com.thongtinanuong.MiHanhActivity;
import com.thongtinanuong.MiQuangActivity;
import com.thongtinanuong.PubActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class AnUongActivity extends Activity {
	LinearLayout RsCaolau, rsmihanh,rsbanhtrang,rsbeerpub,rsbanhmihoian,rsmiquang;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_an_uong);
		RsCaolau = (LinearLayout) findViewById(R.id.rsCaoLau);
		rsmihanh = (LinearLayout) findViewById(R.id.rsmihanh);
		rsbanhtrang = (LinearLayout) findViewById(R.id.rsbanhtrang);
		rsbeerpub = (LinearLayout) findViewById(R.id.rsbeerpub);
		rsbanhmihoian = (LinearLayout) findViewById(R.id.rsbanhmihoian);
		rsmiquang = (LinearLayout) findViewById(R.id.rsmiquang);
		//
		

		RsCaolau.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent caolau = new Intent(AnUongActivity.this,
						CaoLauHoiAnActivity.class);
				startActivity(caolau);

			}
		});
		//
		rsmihanh.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mihanh = new Intent(AnUongActivity.this,
						MiHanhActivity.class);
				startActivity(mihanh);

			}
		});
		rsbanhtrang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent banhtrang = new Intent(AnUongActivity.this,
						BanhTrangActivity.class);
				startActivity(banhtrang);

			}
		});
		rsbeerpub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent pub = new Intent(AnUongActivity.this,
						PubActivity.class);
				startActivity(pub);

			}
		});
		rsbanhmihoian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent banhmi = new Intent(AnUongActivity.this,
						BanhmiActivity.class);
				startActivity(banhmi);

			}
		});
		rsmiquang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent miquang = new Intent(AnUongActivity.this,
						MiQuangActivity.class);
				startActivity(miquang);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.an_uong, menu);
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
