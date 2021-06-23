package com.example.activity_cycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView tv;
    /**
     * {@inheritDoc}
     * <p>
     * Perform initialization of all fragments.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tv = findViewById(R.id.order_view);

        Intent intent = getIntent();
        String fruit = intent.getExtras().getString("fruit");

        tv.setText("you ordered : \n" +fruit);
        Log.d("Life cycle","activity 2 ---> on create");
    }


    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","activity 2 ---> on destory");
    }

    /**
     * {@inheritDoc}
     * <p>
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","activity 2 ---> on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","activity 2 ---> on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","activity 2 ---> on stop");
    }

    /**
     * {@inheritDoc}
     * <p>
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle","activity 2 ---> on Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","activity 2 ---> on Restart");
    }
}
