package com.example.admin.calculatormini;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed = (EditText) findViewById(R.id.editText);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable d= ed.getText();
                ed.setText(d);
               /* int a = Integer.parseInt(ed.getText().toString());*/
                Toast.makeText(getApplicationContext(),d,Toast.LENGTH_LONG);
                //ed.setText(a);
            }
        });
    }
}
    /*public void onClick(View view)
        {
            int a= Integer.parseInt(ed.getText().toString());
             ed.setText(a);

        }
*/
//    public void saySomething(View view)
//    {
//        Toast.makeText(this,"Fine",Toast.LENGTH_LONG).show();
//
//    }

   /*EditText ed = (EditText)findViewById(R.id.editText);
*/
   /*Button button = (Button) findViewById(R.id.button);
   */ /*public void onClick(View view)
    {
        int a= Integer.parseInt(ed.getText().toString());
        ed.setText(a);
    }*/



