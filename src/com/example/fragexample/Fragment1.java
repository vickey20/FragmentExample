package com.example.fragexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment{

	
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Log.d("Frag 1","onActivityCreated()");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.frag1, container, false);
		return view;
	}
	
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		Log.d("Frag 1","onAttach()");
	}

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		Log.d("Frag 1","onCreate()");
	}
	
	
	public void onStart() {
		super.onStart();
		
		Log.d("Frag 1","onStart()");
	}
	
	
	public void onResume() {
		super.onResume();
		
		Log.d("Frag 1","onResume()");
	}
	
	
	public void onPause() {
		super.onPause();
		
		Log.d("Frag 1","onPause()");
	}
	
	public void onStop() {
		super.onStop();
		
		Log.d("Frag 1","onStop()");
	}
	
	public void onDestroyView() {
		super.onDestroyView();
		
		Log.d("Frag 1","onDestroyView()");
	}
	
	public void onDestroy() {
		super.onDestroy();
		
		Log.d("Frag 1","onDestroy()");
	}
	
	public void onDetach() {
		super.onDetach();
		
		Log.d("Frag 1","onDetach()");
	}
}
