package ankit.developer.unknowns.aboutpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnClick = (Button)findViewById(R.id.btnShowAbout);

        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,About.class));

            }

        });

    }
}
