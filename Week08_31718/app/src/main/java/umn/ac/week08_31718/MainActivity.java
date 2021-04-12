package umn.ac.week08_31718;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private Button week08ABtn, week08BBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        week08ABtn = findViewById(R.id.weekA);
        week08BBtn = findViewById(R.id.weekB);

        week08ABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent week08A = new Intent(MainActivity.this, Week08A.class);
                startActivity(week08A);
            }
        });

        week08BBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent week08B = new Intent(MainActivity.this, Week08B.class);
                startActivity(week08B);
            }
        });
    }
}