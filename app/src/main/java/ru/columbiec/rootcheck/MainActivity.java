package ru.columbiec.rootcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import ru.columbiec.rootcheck.util.RootCheck;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "RootCheckApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String isRooted = RootCheck.isRooted() ? "With root" : "Without root";

        ((TextView) findViewById(R.id.txt_root_status_act_main)).setText(isRooted);
        Log.i(TAG, isRooted);
    }
}
