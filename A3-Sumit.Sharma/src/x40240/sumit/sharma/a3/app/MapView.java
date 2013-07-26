package x40240.sumit.sharma.a3.app;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MapView extends Activity {
	public ProgressBar prgBar;
	TextView  LatText;
	TextView LongText;
	Button Clear;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infodisplay);
		prgBar = (ProgressBar) findViewById(R.id.progress_bar);
		LatText = (TextView)findViewById(R.id.Lat_text);
		LongText = (TextView)findViewById(R.id.Long_text);
		Clear = (Button)findViewById(R.id.clear_button);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_map_view, menu);
		return true;
	}

	public ProgressBar returnPrg() {

		return prgBar;
	}
	
	public void Clearfields()
	{
		LatText.setText(null);
		LongText.setText(null);
		
	}
}
