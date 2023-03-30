package it.spacecoding.scrolling_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void message(View view) {
        Toast toast = Toast.makeText(this,"Bene allora hai capito!", Toast.LENGTH_LONG);
        toast.show();
    }
}