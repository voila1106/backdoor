package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.util.*;
import java.util.*;

public class init extends Application
{
	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		
		super.onCreate();
		Log.i("fuck","init");
		/*
		Timer t=new Timer();
		TimerTask tt=new TimerTask(){

			@Override
			public void run()
			{
				Intent i=new Intent(init.this,srv.class);
				startService(i);
				Log.i("fuck","istart");
				// TODO: Implement this method
			}
		};
		t.schedule(tt,2000,2000);
		*/
	}
	
}
