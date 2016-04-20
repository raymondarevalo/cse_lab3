package com.example.raymondarevalo.testproject.tests;


        import android.test.ActivityInstrumentationTestCase2;
        import android.widget.TextView;

        import com.example.raymondarevalo.testproject.MyActivity;
        import com.example.raymondarevalo.testproject.R;
/**
 * Created by raymondarevalo on 4/20/16.
 */
public class turnin_test extends ActivityInstrumentationTestCase2<MyActivity>{
    MyActivity myActivity;
    public turnin_test() {
        super(MyActivity.class);
    }
    public void first_test() {
        myActivity = getActivity();
        TextView blah = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = blah.getText().toString();
        assertEquals("Hello World", tester);
    }
}
