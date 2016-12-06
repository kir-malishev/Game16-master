package ru.samsung.itschool.game18;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements Toaster {

	protected static int type;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			type = extras.getInt("type");
		}
		setContentView(R.layout.activity_main);

	}

	public void click(View v) {
		switch (v.getId()) {
			case R.id.button2:
				MyDraw.addFig(0);
				showToast(getString(R.string.addsquare));
				break;
			case R.id.button3:
				MyDraw.addFig(1);
				showToast(getString(R.string.addcircle));
				break;
			case R.id.button4:
				MyDraw.addFig(2);
				showToast(getString(R.string.addtriangle));
				break;
		}
	}


	@Override
	public void showToast(String text) {
		Toast toast = Toast.makeText(getApplicationContext(), text, SHORT);
		toast.setGravity(CENTER, 0, 0);
		toast.show();
	}
}
