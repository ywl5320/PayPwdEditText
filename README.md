# PayPwdEditText
#### 支付密码框，和微信支付宝类似
#### 博客地址：http://blog.csdn.net/ywl5320/article/details/52003691
##### 一、效果图：
![image](https://github.com/wanliyang1990/PayPwdEditText/blob/master/imgs/pwd.gif)<br/>
##### 二、设置代码
### xml布局：<br/><br/>

    <com.ywl5320.widget.PayPwdEditText
        android:id="@+id/ppe_pwd"
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_marginLeft="13dp"
        android:layout_marginRight="13dp"
        android:layout_marginTop="5dp"/>

### java代码：<br/><br/>

    /**
     * @param bgdrawable 背景drawable
     * @param pwdlength 密码长度
     * @param splilinewidth 分割线宽度
     * @param splilinecolor 分割线颜色
     * @param pwdcolor 密码字体颜色
     * @param pwdsize 密码字体大小
     */
    payPwdEditText.initStyle(R.drawable.edit_num_bg, 6, 0.33f, R.color.color999999, R.color.color999999, 20);
        payPwdEditText.setOnTextFinishListener(new PayPwdEditText.OnTextFinishListener() {
            @Override
            public void onFinish(String str) {//密码输入完后的回调
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
        
# create by ywl5320
