package wizrole.loading.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import wizrole.loading.R;

/**
 * Created by liushengping on 2017/2/25.
 * 何人执笔？
 */

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
        //paint绘制
		findViewById(R.id.btn_paint).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,PaintActivity.class);
				startActivity(intent);
			}
		});
		//扇形进度
		findViewById(R.id.btn_circle).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,CircleActivity.class);
				startActivity(intent);
			}
		});

		//环形进度
		findViewById(R.id.btn_round).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,RoundActivity.class);
				startActivity(intent);
			}
		});

		//饿了么
		findViewById(R.id.btn_eleme).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,ElemeActivity.class);
				startActivity(intent);
			}
		});

		//自定义ProgressBar
		findViewById(R.id.btn_progress).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,ProgressBarActivity.class);
				startActivity(intent);
			}
		});

		//dialog等待
		findViewById(R.id.btn_dialogload).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,LoadDialogActivity.class);
				startActivity(intent);
			}
		});
	}
}
