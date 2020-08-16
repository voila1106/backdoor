package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;

public class srv extends Service
{
	public srv()
	{}

	@Override
	public IBinder onBind(Intent p1)
	{
		// TODO: Implement this method
		Log.i("fuck","onBind");
		return null;
	}

	@Override
	public void onCreate()
	{
		Log.i("fuck","onCreate");



		// TODO: Implement this method
		super.onCreate();
	}
	//public static receiver r=new receiver();
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		Log.i("fuck","onStartCommand");
		IntentFilter f=new IntentFilter(Intent.ACTION_TIME_TICK);
		f.addAction(Intent.ACTION_TIME_CHANGED);
		f.addAction(Intent.ACTION_BOOT_COMPLETED);
		registerReceiver(init.r,f);

		new Thread(){
			@Override
			public void run()
			{
				while(true)
				{
					Log.i("fuck","thread");
					try
					{
						Thread.sleep(2000);
					}catch(InterruptedException e)
					{}
				}
			}
		}.run();
		return super.onStartCommand(intent,flags,startId);
	}
}
