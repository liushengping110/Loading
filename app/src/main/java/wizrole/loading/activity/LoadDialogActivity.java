package wizrole.loading.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import wizrole.loading.*;
import wizrole.loading.util.LoadDialog;

/**
 * Created by liushengping on 2017/2/26.
 * 何人执笔？
 */

public class LoadDialogActivity extends AppCompatActivity {

    public Dialog dialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loaddialog);
        findViewById(R.id.btn_dialogload).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               dialog= LoadDialog.createLoadingDialog(LoadDialogActivity.this,"加载中");
                handler.sendEmptyMessageDelayed(1, 2000);
            }
        });
    }

    public Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            LoadDialog.closeDialog(dialog);
        }
    };
}
