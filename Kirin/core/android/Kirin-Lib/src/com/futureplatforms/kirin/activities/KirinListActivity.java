package com.futureplatforms.kirin.activities;

import com.futureplatforms.kirin.Kirin;
import com.futureplatforms.kirin.application.IKirinApplication;
import com.futureplatforms.kirin.helpers.KirinScreenHelper;

import android.app.ListActivity;
import android.content.Intent;

public class KirinListActivity extends ListActivity {
protected KirinScreenHelper mKirinHelper;
	
	protected void bindScreen(String moduleName) {
		bindScreenWithoutLoading(moduleName);
		mKirinHelper.onLoad();
	}
	
	protected void bindScreenWithoutLoading(String moduleName) {
		mKirinHelper = getKirin().bindScreen(moduleName, this);
	}
	
	
	protected Kirin getKirin() {
		return ((IKirinApplication) this.getApplication()).getKirin();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mKirinHelper.onPause();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mKirinHelper.onResume();
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		mKirinHelper.onActivityResult(requestCode, resultCode, data);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mKirinHelper.onUnload();
	} 
}
