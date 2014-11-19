package com.thongtinanuong;

import com.duanandroi.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class CaoLauHoiAnActivity extends Activity {

	
	private ViewFlipper mViewFlipper;
	
	Button btnsau, btntruoc;

	// private final GestureDetector detector = new GestureDetector(new
	// SwipeGestureDetector());

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cao_lau_hoi_an);

		//

		//
		
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

	// mViewFlipper.setOnTouchListener(new OnTouchListener() {
	// @Override
	// public boolean onTouch(final View view, final MotionEvent event) {
	// detector.onTouchEvent(event);
	// return true;
	// }
	// });

	//

	// class SwipeGestureDetector extends SimpleOnGestureListener {
	// @Override
	// public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
	// float velocityY) {
	// try {
	// // right to left swipe
	// if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) >
	// SWIPE_THRESHOLD_VELOCITY) {
	// mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext,
	// R.anim.slide_in));
	// mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,
	// R.anim.slide_out));
	// mViewFlipper.showNext();
	// return true;
	// } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE &&
	// Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	// mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext,
	// R.anim.slide_in));
	// mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,R.anim.slide_out));
	// mViewFlipper.showPrevious();
	// return true;
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return false;
	// }
	//
	// }
	//

}
