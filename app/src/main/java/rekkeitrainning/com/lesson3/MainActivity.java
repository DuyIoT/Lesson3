package rekkeitrainning.com.lesson3;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioGroup rg_color;
    Button btn_setColor;
    Button btn_clear;
    String mColor = "Black";
    TextView tv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn_setColor.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        rg_color.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtnRed:
                        mColor = "Red";
                        break;
                    case R.id.rbtnBlue:
                        mColor = "Blue";
                        break;
                    case R.id.rbtnWhite:
                        mColor = "White";
                        break;
                    default:
                        mColor = "Black";
                        break;
                }
            }
        });
    }

    private void addControls() {
        rg_color = findViewById(R.id.rgColor);
        btn_clear = findViewById(R.id.btnClear);
        btn_setColor = findViewById(R.id.btnSetColor);
        tv_name = findViewById(R.id.tvName);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnSetColor:
                switch (mColor){
                    case "Red":
                        tv_name.setTextColor(getResources().getColor(R.color.red,getResources().newTheme()));
                        break;
                    case "Blue":
                        tv_name.setTextColor(getResources().getColor(R.color.blue,getResources().newTheme()));
                        break;
                    case  "White":
                        tv_name.setTextColor(getResources().getColor(R.color.white,getResources().newTheme()));
                        break;
                }
                break;
            case R.id.btnClear:
                tv_name.setTextColor(getResources().getColor(R.color.black,getResources().newTheme()));
                break;
        }
    }
}
