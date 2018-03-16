package wizrole.loading.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import wizrole.loading.R;
import wizrole.loading.view.CustomCircleLoading;

/**
 * Created by liushengping on 2017/2/25.
 * 何人执笔？
 */

public class CircleActivity extends AppCompatActivity {

    private CustomCircleLoading circleLoading;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == MESSAGE_SUCCESS){
                circleLoading.animatorAngle();
            }
        }
    };
    public static final int MESSAGE_SUCCESS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        circleLoading = (CustomCircleLoading) findViewById(R.id.circleLoading);
        circleLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(circleLoading.getStatus() == CustomCircleLoading.Status.End){
                    circleLoading.setStatus(CustomCircleLoading.Status.Starting);
                    Message message = Message.obtain();
                    message.what = MESSAGE_SUCCESS;
                    handler.sendMessage(message);
                }else{
                    circleLoading.setStatus(CustomCircleLoading.Status.End);
                    handler.removeMessages(MESSAGE_SUCCESS);
                }

            }
        });

    }
}
