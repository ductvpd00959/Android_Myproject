package com.duanandroi;




import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;


public class MenuActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_menu);
		//
		// Khai bÃƒÂ¡o cÃƒÂ¡c thÃƒÂ nh phÃ¡ÂºÂ§n
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab

		Intent intent; // Reusable Intent for each tab
		//
		// TÃ¡ÂºÂ¡o cÃƒÂ¡c tab trong chÃ†Â°Ã†Â¡ng trÃƒÂ¬nh
		intent = new Intent().setClass(this, DuLichActivity.class);
		spec = tabHost.newTabSpec("tab1")
				.setIndicator("Du Lich")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.setCurrentTab(1);
		//
		intent = new Intent().setClass(this, AnUongActivity.class);
		spec = tabHost
				.newTabSpec("tab2")
				.setIndicator("Ăn Uống")
				.setContent(intent);
		tabHost.addTab(spec);

		//
		intent = new Intent().setClass(this, MuaSamActivity.class);
		spec = tabHost.newTabSpec("tab3")
				.setIndicator("Mua Sắm")
				.setContent(intent);
		tabHost.addTab(spec);
		
	}
}
