package com.voila.backdoor;

import android.content.*;
import android.app.*;
import android.util.*;

public class receiver extends BroadcastReceiver
{
	public receiver(){}
	@Override
	public void onReceive(Context cxt, Intent intent)
	{
		/*
		if(intent.getAction().equals("Intent.ACTION_TIME_TICK"))
		{
			
			Intent i=new Intent(cxt,MainActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			cxt.startActivity(i);
			*/
			Log.i("fuck",intent.getAction());
			/*
			Intent i=new Intent(cxt,srv.class);
			cxt.stopService(i);
			Log.i("fuck","stopService");
			i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			cxt.startService(i);
			Log.i("fuck","startService");
			*/
			Intent i=new Intent(cxt,MainActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			cxt.startActivity(i);
			i=new Intent(cxt,srv.class);
			cxt.startService(i);
		//}
	}
	
}
