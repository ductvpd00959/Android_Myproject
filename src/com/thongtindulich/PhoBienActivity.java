package com.thongtindulich;

import com.duanandroi.R;
import com.duanandroi.R.id;
import com.duanandroi.R.layout;
import com.duanandroi.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class PhoBienActivity extends Activity {
private ViewFlipper mViewFlipper;
	
	Button btnsau, btntruoc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pho_bien);
		mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
		btnsau = (Button) findViewById(R.id.btnSau);
		btntruoc = (Button) findViewById(R.id.btnTruoc);
		//
		Animation next = AnimationUtils.loadAnimation(this, R.anim.slide_in);
		Animation back = AnimationUtils.loadAnimation(this, R.anim.slide_out);
		mViewFlipper.setInAnimation(next);
		mViewFlipper.setOutAnimation(back);
		//
		btntruoc.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mViewFlipper.showNext();

			}
		});
		btnsau.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mViewFlipper.showNext();

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pho_bien, menu);
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
