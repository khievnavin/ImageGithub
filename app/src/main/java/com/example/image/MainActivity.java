package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button btnr34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("GT-R34");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnr34=findViewById(R.id.btn34);

        btnr34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"««GT-R34×SkyLine»»",Toast.LENGTH_LONG).show();
            }
        });
    }

}