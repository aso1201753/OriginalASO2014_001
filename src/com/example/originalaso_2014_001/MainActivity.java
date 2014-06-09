package com.example.originalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements
View.OnClickListener
{



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button btnOK = (Button)findViewById(R.id.btnOK);
		btnOK.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {

	switch(v.getId()){
		case R.id.btnOK:

			EditText etv = (EditText)findViewById(R.id.edtName);
			String inputMsg = etv.getText().toString();

			Random rnd = new Random();
			int ran = rnd.nextInt(4);


			Intent intent = new Intent(MainActivity.this, MsgActivity.class);
			intent = new Intent(MainActivity.this, MsgActivity2.class);
			intent = new Intent(MainActivity.this, MsgActivity3.class);
			intent = new Intent(MainActivity.this, MsgActivity4.class);
			startActivity(intent);

	switch(ran){
		case 0:

			intent = new Intent(MainActivity.this, MsgActivity.class);

			break;
		case 1:

		intent = new Intent(MainActivity.this, MsgActivity2.class);

		break;

		case 2:

		intent = new Intent(MainActivity.this, MsgActivity3.class);

		break;

		case 3:

		intent = new Intent(MainActivity.this, MsgActivity4.class);

		break;
			}

	intent.putExtra("name", inputMsg);
	startActivity(intent);
	}


	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
