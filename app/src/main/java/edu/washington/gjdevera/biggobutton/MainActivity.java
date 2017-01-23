package edu.washington.gjdevera.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private int clicks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnMain);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks++;
                button.setText("You have pushed me " + clicks + " times!");
            }
        });
    }
}
