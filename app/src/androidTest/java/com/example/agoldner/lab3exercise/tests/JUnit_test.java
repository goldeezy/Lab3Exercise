package com.example.agoldner.lab3exercise.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;

import com.example.agoldner.lab3exercise.MainActivity;
import com.example.agoldner.lab3exercise.R;

/**
 * Created by agoldner on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_add()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.result);
        int test = Integer.parseInt(textView.getText().toString());

        assertEquals(test, 5);
    }
}
