package com.handmark.pulltorefresh.samples.swipemenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.handmark.pulltorefresh.samples.R;

public class PullToRefreshSwipeMenuListViewActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, SimpleActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, DifferentMenuActivity.class));
                break;
        }
    }
}