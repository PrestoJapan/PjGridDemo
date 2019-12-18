package jp.or.presto.pjgriddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import jp.or.presto.pjgriddemo.blob.*;

public class MainActivity extends AppCompatActivity {
    public static final String storageConnectionString = "DefaultEndpointsProtocol=https;"
            + "AccountName=xxxxx;"
            + "AccountKey=yyyyyyyyyyyy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.blobbutton);
        button.setOnClickListener(onClick_button);
    }

    private View.OnClickListener onClick_button = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            runBlobGettingStartedSample(v);
            //Toast.makeText(MainActivity.this, "button clicked", Toast.LENGTH_SHORT).show();
        }
    };

    public void runBlobGettingStartedSample(View view) {
        new BlobGettingStartedTask(this , (TextView)findViewById(R.id.textView)).execute();
    }

    public void outputText(final TextView view, final String value) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.append(value + "\n");
                System.out.println(view);
            }
        });
    }

}
