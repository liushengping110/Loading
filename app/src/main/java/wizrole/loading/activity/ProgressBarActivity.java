package wizrole.loading.activity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import wizrole.loading.R;
import wizrole.loading.view.ProgressBar;

/**
 * Created by liushengping on 2017/2/26.
 * 何人执笔？
 */

public class ProgressBarActivity extends AppCompatActivity {
    private ProgressBar myProgressBar;
    private int totalProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        myProgressBar= (ProgressBar) findViewById(R.id.myprogressbar);

        //直接根据自定义的属性来设置进度
        totalProgress=90;

        //在子线程中让progressBar动态加载-->涉及耗时的操作都要放在子线程中去做
        new Thread(runnable).start();

    }

    //进度条的加载
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            myProgressBar.setProgress(0);
            myProgressBar.setMax(100);//可修改max值
            for (int i = 0; i < totalProgress; i++) {
                myProgressBar.setProgress(myProgressBar.getProgress() + 1);
                SystemClock.sleep(50);

                //刷新界面
                myProgressBar.postInvalidate();
            }
        }
    };

}