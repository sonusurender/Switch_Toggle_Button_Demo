package com.android_switch_n_togglebutton_demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity {

	ToggleButton toggle;
	Switch swtch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toggle = (ToggleButton) findViewById(R.id.toggle);
		swtch = (Switch) findViewById(R.id.switch_button);

		setListeners();
	}

	// Setting listeners to switch and toggle button
	void setListeners() {
		swtch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {

				// If ischecked means if it is ON the it will show true else
				// show false
				if (isChecked) {
					Toast.makeText(MainActivity.this,
							"Switch is : " + isChecked, Toast.LENGTH_SHORT)
							.show();

				} else {
					Toast.makeText(MainActivity.this,
							"Switch is : " + isChecked, Toast.LENGTH_SHORT)
							.show();
				}

			}
		});

		toggle.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {

				// If ischecked means if it is ON the it will show true else
				// show false
				if (isChecked) {
					Toast.makeText(MainActivity.this,
							"Toggle button is : " + isChecked,
							Toast.LENGTH_SHORT).show();

				} else {
					Toast.makeText(MainActivity.this,
							"Toggle button is : " + isChecked,
							Toast.LENGTH_SHORT).show();
				}

			}
		});

	}

}
