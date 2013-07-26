package x40240.sumit.sharma.a3.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map_view, menu);
        return true;
    }
}
