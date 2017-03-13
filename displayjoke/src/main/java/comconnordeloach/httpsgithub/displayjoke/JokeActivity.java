package comconnordeloach.httpsgithub.displayjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");

        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }
}
