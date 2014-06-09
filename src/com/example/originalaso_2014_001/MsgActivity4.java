package com.example.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MsgActivity4 extends Activity {

	public static void main(String[] args){

	}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.msgactivity4);

		Intent intent = getIntent();
		String name = intent.getStringExtra( "name" );


		TextView tv = (TextView)findViewById(R.id.txvMsg);
		tv.setText( name + "さんの今日の運命は・・・");


}
}
