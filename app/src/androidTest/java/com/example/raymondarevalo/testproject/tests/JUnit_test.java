package com.example.raymondarevalo.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.raymondarevalo.testproject.MyActivity;
import com.example.raymondarevalo.testproject.R;

/**
 * Created by raymondarevalo on 4/19/16.
 */

public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity>{
    MyActivity myActivity;
    public JUnit_test() {
        super(MyActivity.class);
    }
    public void test_test() {
        myActivity = getActivity();
        TextView blah = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = blah.getText().toString();
        assertEquals("Hello World!", tester);
    }
}
