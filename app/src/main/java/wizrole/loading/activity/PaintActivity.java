package wizrole.loading.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import wizrole.loading.R;
import wizrole.loading.view.ShapeLoadingDialog;

/**
 * Created by liushengping on 2017/2/25.
 * 何人执笔？
 */

public class PaintActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        Button openBtn = (Button)this.findViewById(R.id.btn_dialog);
        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShapeLoadingDialog shapeLoadingDialog = new ShapeLoadingDialog(PaintActivity.this);
                shapeLoadingDialog.setLoadingText("loading...");
                shapeLoadingDialog.show();
            }
        });
    }
}
