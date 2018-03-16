package wizrole.loading.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wizrole.loading.R;
import wizrole.loading.view.ElemeLoadingView;

/**
 * Created by liushengping on 2017/2/26.
 * 何人执笔？
 */

public class ElemeActivity extends AppCompatActivity {

    private ElemeLoadingView loadingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleme);


        loadingView = (ElemeLoadingView) findViewById(R.id.loadingView);

        loadingView.addBitmap(R.drawable.v4);
        loadingView.addBitmap(R.drawable.v5);
        loadingView.addBitmap(R.drawable.v6);
        loadingView.addBitmap(R.drawable.v7);
        loadingView.addBitmap(R.drawable.v8);
        loadingView.addBitmap(R.drawable.v9);
        loadingView.setShadowColor(Color.LTGRAY);
        loadingView.setDuration(700);
        loadingView.start();
    }
}
