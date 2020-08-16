package com.voila.backdoor;

import android.content.*;
import android.util.Log;

public class amreceiver extends BroadcastReceiver
{
	private final String tag="fuck";
	@Override
	public void onReceive(Context cxt, Intent intent)
	{
		// TODO: Implement this method
		Log.i(tag,"onReceive");
		Intent i=new Intent(cxt,MainActivity.class);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		cxt.startActivity(i);
	}

	
}
