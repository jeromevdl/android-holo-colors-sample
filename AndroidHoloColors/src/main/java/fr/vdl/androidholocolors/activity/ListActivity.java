package fr.vdl.androidholocolors.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import fr.vdl.androidholocolors.R;
import fr.vdl.androidholocolors.fragment.ListFragment;

public class ListActivity extends FragmentActivity {

	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);

		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		View tabIndicator1 = LayoutInflater.from(this).inflate(R.layout.apptheme_tab_indicator_holo, mTabHost.getTabWidget(), false);
		TextView title = (TextView) tabIndicator1.findViewById(android.R.id.title);
		title.setText("Tab n1");
		View tabIndicator2 = LayoutInflater.from(this).inflate(R.layout.apptheme_tab_indicator_holo, mTabHost.getTabWidget(), false);
		title = (TextView) tabIndicator2.findViewById(android.R.id.title);
		title.setText("Tab n2");
		View tabIndicator3 = LayoutInflater.from(this).inflate(R.layout.apptheme_tab_indicator_holo, mTabHost.getTabWidget(), false);
		title = (TextView) tabIndicator3.findViewById(android.R.id.title);
		title.setText("Tab n3	");

		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator(tabIndicator1), ListFragment.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator(tabIndicator2), ListFragment.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator(tabIndicator3), ListFragment.class, null);

	}

}
