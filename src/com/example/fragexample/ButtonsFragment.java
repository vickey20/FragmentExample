package com.example.fragexample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ButtonsFragment extends Fragment implements OnClickListener {

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Log.d("Buttons","onActivityCreated()");
		
		Button b1 = (Button) getView().findViewById(R.id.button1);
		Button b2 = (Button) getView().findViewById(R.id.button2);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}
	
	//Creates the fragment view. Similar to setContentView() in Activity
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.buttons_frag, container, false);
		return view;
	}

	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	
		switch(arg0.getId()){
		
		//Add fragment 2 on top of fragment 1
		case R.id.button1:
			Fragment2 frag2 = (Fragment2) getFragmentManager().findFragmentByTag("Frag2");
			
			if(frag2 == null){
				getFragmentManager().beginTransaction().replace(R.id.details, new Fragment2(), "Frag2").addToBackStack(null).commit();
			}
			else{
				Toast.makeText(getActivity(), "Fragment Already Added", Toast.LENGTH_SHORT).show();
			}
			break;
		
		//Remove fragment 2 if added	
		case R.id.button2:
			Fragment2 frag_2 = (Fragment2) getFragmentManager().findFragmentByTag("Frag2");
			
			if(frag_2 == null){
				Toast.makeText(getActivity(), "Fragment Not Added", Toast.LENGTH_SHORT).show();
			}
			else{
				getFragmentManager().popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
			}
			
			break;
		}	
	}
	
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		Log.d("Buttons","onAttach()");
	}

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		Log.d("Buttons","onCreate()");
	}
	
	
	public void onStart() {
		super.onStart();
		
		Log.d("Buttons","onStart()");
	}
	
	
	public void onResume() {
		super.onResume();
		
		Log.d("Buttons","onResume()");
	}
	
	
	public void onPause() {
		super.onPause();
		
		Log.d("Buttons","onPause()");
	}
	
	public void onStop() {
		super.onStop();
		
		Log.d("Buttons","onStop()");
	}
	
	public void onDestroyView() {
		super.onDestroyView();
		
		Log.d("Buttons","onDestroyView()");
	}
	
	public void onDestroy() {
		super.onDestroy();
		
		Log.d("Buttons","onDestroy()");
	}
	
	public void onDetach() {
		super.onDetach();
		
		Log.d("Buttons","onDetach()");
	}

}
