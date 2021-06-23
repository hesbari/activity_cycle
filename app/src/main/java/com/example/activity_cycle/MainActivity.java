package com.example.activity_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.fruit_items);
        tv = findViewById(R.id.fruit_txt);
        Log.d("Life cycle","Main activity ---> on create");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","Main activity ---> on destory");
    }

    /**
     * {@inheritDoc}
     * <p>
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","Main activity ---> on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","Main activity ---> on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","Main activity ---> on stop");
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
        Log.d("Life cycle","Main activity ---> on Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","Main activity ---> on Restart");
    }

    public void choose(View view){

        tv.setText(sp.getSelectedItem().toString());

    }

    public void order(View view){

        Log.d("test","The button pressed");
        Intent intent = new Intent(this,Activity2.class); // I am creating an intent for going from main
        // to activity2 activity
        intent.putExtra("fruit",tv.getText().toString());
        startActivity(intent);
    }


}