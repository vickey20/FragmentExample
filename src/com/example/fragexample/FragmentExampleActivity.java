package com.example.fragexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class FragmentExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.d("Main","onCreate()");
        
        /*
         * We want to show the ButtonsFragment and Fragment1 when the app starts.
         * If they are not already present, we add the them.
         */
        
        ButtonsFragment b = (ButtonsFragment) getFragmentManager().findFragmentByTag("Buttons");
        
        if(b == null){
        	getFragmentManager().beginTransaction().replace(R.id.buttons, new ButtonsFragment(), "ButtonsFragment").commit();
        }
        

		Fragment1 frag1 = (Fragment1) getFragmentManager().findFragmentByTag("Frag1");
		
		if(frag1 == null){
			getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
			getFragmentManager().beginTransaction().replace(R.id.details, new Fragment1(), "Frag1").commit();
		
		}
        
    }
    
    @Override
    public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		
	}
    
    public void onStart() {
		super.onStart();
		
		Log.d("Main","onStart()");
	}
	
	
	public void onResume() {
		super.onResume();
		
		Log.d("Main","onResume()");
	}
	
	
	public void onPause() {
		super.onPause();
		
		Log.d("Main","onPause()");
	}
	
	public void onStop() {
		super.onStop();
		
		Log.d("Main","onStop()");
	}
	
	public void onDestroy() {
		super.onDestroy();
		
		Log.d("Main","onDestroy()");
	}
	
}