package com.example.agoldner.lab3exercise;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNum;
    EditText secondNum;
    TextView result;
    Button addButton;
    int sum, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = (EditText) findViewById(R.id.editText);
        secondNum = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.result);
        addButton = (Button) findViewById(R.id.button);


        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                sum = num1 + num2;
                result.setText(Integer.toString(sum));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}