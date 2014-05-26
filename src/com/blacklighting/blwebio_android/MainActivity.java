package com.blacklighting.blwebio_android;

import com.actionbarsherlock.view.MenuItem;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.CanvasTransformer;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.Menu;

public class MainActivity extends SlidingFragmentActivity {
	protected ListFragment mFrag;
	private CanvasTransformer mTransformer = new CanvasTransformer() {
		@Override
		public void transformCanvas(Canvas canvas, float percentOpen) {
			canvas.scale(percentOpen, 1, 0, 0);
		}
	};
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// set the Behind View
		setBehindContentView(R.layout.menu_frame);
		if (savedInstanceState == null) {
			FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
			mFrag = new MenuListFragment();
			t.replace(R.id.menu_frame, mFrag);
			t.commit();
		} else {
			mFrag = (ListFragment)this.getSupportFragmentManager().findFragmentById(R.id.menu_frame);
		}
		
		// customize the SlidingMenu
		SlidingMenu sm = getSlidingMenu();
		sm.setShadowWidthRes(R.dimen.shadow_width);
		sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setFadeDegree(0.35f);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new MenuListFragment())
		.commit();
		
		setSlidingActionBarEnabled(true);
		sm.setBehindScrollScale(0.0f);
		sm.setBehindCanvasTransformer(mTransformer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			toggle();
			return true;
		}
		return super.onOptionsItemSelected((android.view.MenuItem) item);
	}
}
