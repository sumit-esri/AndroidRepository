package x40240.sumit.sharma.a1.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloWorld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_hello_world, menu);
        return true;
    }
    
}
