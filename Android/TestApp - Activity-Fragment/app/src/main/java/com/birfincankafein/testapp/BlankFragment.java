package com.birfincankafein.testapp;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.i("FRAGMENT","onAttach");
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FRAGMENT","onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("FRAGMENT","onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        Log.i("FRAGMENT","onViewCreated");
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FRAGMENT","onActivityCreated");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("FRAGMENT","onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("FRAGMENT","onResume");
    }

    @Override
    public void onPause() {
       super.onPause();
        Log.i("FRAGMENT","onPause");
    }
    @Override
    public void onStop() {
      super.onStop();
        Log.i("FRAGMENT","onStop");
    }
    @Override
    public void onDestroyView() {
       super.onDestroyView();
        Log.i("FRAGMENT","onDestroyView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("FRAGMENT","onDestroy");
    }
    @Override
    public void onDetach(){
        super.onDetach();
        Log.i("FRAGMENT","onDetach");
    }




}
