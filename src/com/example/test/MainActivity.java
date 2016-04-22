package com.example.test;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

	String[] disp={
			"Text 1",
			"Text 2",
			"Text 3"
	};
	
	TextView tvText,tvProgress;
	Button btClick;
	Button btButton2;
	ProgressBar pg1;
	int index=0;
	int progindex=30;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvText= (TextView)findViewById(R.id.text1);
        tvText.setText(disp[0]);
        tvProgress = (TextView)findViewById(R.id.text2);
        tvProgress.setText("30");
        pg1 = (ProgressBar)findViewById(R.id.pgjob);
        
        btClick= (Button)findViewById(R.id.button1);
        btClick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				index = (index+1) % 3;
				tvText.setText(disp[index]);
				
				progindex++;
				if(progindex > 100)
					progindex = 100;
				pg1.setProgress(progindex);
				tvProgress.setText(String.valueOf(progindex));
				//btClick.setText("");
				
			}
		});
        
        btButton2 = (Button)findViewById(R.id.button2);
        btButton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent intent=new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
				//ComponentName cName = new ComponentName("com.android.phone","com.android.phone.Settings");
				//intent.setComponent(cName);
				//Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
				
				Intent intent = new Intent(Settings.ACTION_SETTINGS);
				startActivity(intent);
				
				/*Intent intent = new Intent();  
				ComponentName cm = new ComponentName("com.android.settings","com.android.settings.WirelessSettings");  
				intent.setComponent(cm);  
				intent.setAction("android.intent.action.VIEW");  
				startActivityForResult( intent , 0);*/
				
			}
		});
        
        btButton2.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction() == MotionEvent.ACTION_UP){
					
				}
				if(event.getAction() == MotionEvent.ACTION_DOWN){
					
				}
				return false;
			}
		});
    }
}
