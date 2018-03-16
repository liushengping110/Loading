package wizrole.loading.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import wizrole.loading.R;
import wizrole.loading.view.RoundProgressBar;

/**
 * Created by liushengping on 2017/2/25.
 * 何人执笔？
 */

public class RoundActivity extends AppCompatActivity {
    public RoundProgressBar mRoundProgressBar1;
    private int progress = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);
        mRoundProgressBar1 = (RoundProgressBar) findViewById(R.id.roundProgressBar1);

        ((Button)findViewById(R.id.btn_ok)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        progress = 0;
                        mRoundProgressBar1.setProgress(progress);
                        while(progress <= 100){
                            mRoundProgressBar1.setStr(progress);
                            progress += 5;
                            mRoundProgressBar1.setProgress(progress);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
