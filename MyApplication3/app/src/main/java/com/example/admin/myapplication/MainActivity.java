package com.example.admin.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    public Integer add(Integer x, Integer y)
    {
        Integer sum = x + y;
        return sum;
    }
    public Integer parseInteger(Button x)
    {
        Integer a = Integer.parseInt(x.getText().toString());
        return a;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final   EditText ed = (EditText)findViewById(R.id.editText);

        final Button bt1 = (Button)findViewById(R.id.button1);
        final Button bt2 = (Button)findViewById(R.id.button2);
        final Button btA = (Button)findViewById(R.id.buttonAdd);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(new Integer(parseInteger(bt1)).toString());
            }
        });

        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = new TextView(this);
                textView.setText("New text");
            }
        });

    }
}
