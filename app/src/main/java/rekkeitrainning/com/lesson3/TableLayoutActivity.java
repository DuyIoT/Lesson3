package rekkeitrainning.com.lesson3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
 You want running Activity:
 1. In Manifests, <activity android:name=".TableLayoutActivity">
                        <intent-filter>
                            <action android:name="android.intent.action.MAIN" />

                            <category android:name="android.intent.category.LAUNCHER" />
                        </intent-filter>
                    </activity>
  2. Delete intent-filter activity MainActivity
 */
public class TableLayoutActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_red;
    Button btn_blue;
    Button btn_white;
    TextView tv_background;
    Button btn_clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        initView();
        initListener();
    }

    private void initListener() {
        btn_red.setOnClickListener(this);
        btn_blue.setOnClickListener(this);
        btn_white.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    private void initView() {
        btn_blue = findViewById(R.id.btnBlue);
        btn_red = findViewById(R.id.btnRed);
        btn_white = findViewById(R.id.btnWhite);
        btn_clear = findViewById(R.id.btnClear);
        tv_background = findViewById(R.id.tvBg);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnRed:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    tv_background.setBackgroundColor(getResources().getColor(R.color.red, getResources().newTheme()));
                } else {
                    tv_background.setBackgroundColor(R.color.red);
                }
                break;
            case R.id.btnBlue:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    tv_background.setBackgroundColor(getResources().getColor(R.color.blue, getResources().newTheme()));
                } else {
                    tv_background.setBackgroundColor(R.color.blue);
                }
                break;
            case R.id.btnWhite:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    tv_background.setBackgroundColor(getResources().getColor(R.color.white, getResources().newTheme()));
                } else {
                    tv_background.setBackgroundColor(R.color.white);
                }
                break;
            case R.id.btnClear:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    tv_background.setBackgroundColor(getResources().getColor(R.color.black, getResources().newTheme()));
                } else {
                    tv_background.setBackgroundColor(R.color.black);
                }
                break;
        }
    }
}
