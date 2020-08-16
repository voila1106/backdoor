package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.util.*;

public class init extends Application
{
	public static receiver r=new receiver();
	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		Log.i("fuck","init");
		
		IntentFilter f=new IntentFilter(Intent.ACTION_TIME_TICK);
		f.addAction(Intent.ACTION_TIME_CHANGED);
		registerReceiver(r,f);
		Intent i=new Intent(this,MainActivity.class);
		i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(i);
		super.onCreate();
	}
	
}
