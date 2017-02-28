package com.ywl5320.paypwdedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ywl5320.dialog.PayDialog;
import com.ywl5320.widget.PayPwdEditText;

public class MainActivity extends AppCompatActivity {

    private PayPwdEditText payPwdEditText;
    private PayPwdEditText payPwdEditText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        payPwdEditText = (PayPwdEditText) findViewById(R.id.ppe_pwd);
        payPwdEditText2 = (PayPwdEditText) findViewById(R.id.ppe_pwd2);
        button = (Button) findViewById(R.id.btn_dialog);

        payPwdEditText.initStyle(R.drawable.edit_num_bg, 6, 0.33f, R.color.color999999, R.color.color999999, 20);
        payPwdEditText.setOnTextFinishListener(new PayPwdEditText.OnTextFinishListener() {
            @Override
            public void onFinish(String str) {//密码输入完后的回调
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });

        payPwdEditText2.initStyle(R.drawable.edit_num_bg_red, 8, 0.33f, R.color.colorAccent, R.color.colorAccent, 20);
        payPwdEditText2.setOnTextFinishListener(new PayPwdEditText.OnTextFinishListener() {
            @Override
            public void onFinish(String str) {
                Toast.makeText(MainActivity.this, "显示明文：" + str, Toast.LENGTH_SHORT).show();
                payPwdEditText2.setShowPwd(false);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PayDialog payDialog = new PayDialog(MainActivity.this);
                payDialog.show();
            }
        });
    }
}
