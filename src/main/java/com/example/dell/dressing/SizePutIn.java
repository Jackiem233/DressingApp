package com.example.dell.dressing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SizePutIn extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_put_in);

        editText1 = (EditText) findViewById(R.id.edit_text1);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        editText3 = (EditText) findViewById(R.id.edit_text3);
        editText4 = (EditText) findViewById(R.id.edit_text4);

        Button sure = (Button) findViewById(R.id.button_sure);
        sure.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_sure:
                Intent intent = new Intent(SizePutIn.this,DressSelect.class);
                intent.putExtra("height", editText1.getText().toString());
                intent.putExtra("bust", editText2.getText().toString());
                intent.putExtra("waistline", editText3.getText().toString());
                intent.putExtra("hip", editText4.getText().toString());
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
