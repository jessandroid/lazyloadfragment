package com.example.dengquan.lazyloadmodule.Fragment;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dengquan.lazyloadmodule.R;

import java.util.ArrayList;

/**
 * Created by dengquan on 16-3-21.
 */
public class AFragment extends BaseFragment {
    private static final String TAG = AFragment.class.getSimpleName();
    //标志是否已经加载完毕
    private boolean isPrepared;
    //是否已经加载过一次，第二次则不加载。
    private boolean mHasLoadedOnce = false;
    @Override
    public void onAttach(Context context) {
        Log.i("TAG", TAG + "  onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("TAG", TAG + "  onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("TAG", TAG + "  onCreateView");
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        isPrepared = true;
        lazyLoad();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i("TAG", TAG + "  onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("TAG", TAG + "  onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("TAG", TAG + "  onResume");
        super.onResume();
    }


    @Override
    public void onStop() {
        Log.i("TAG", TAG + "  onStop");
        super.onStop();
    }

    @Override
    public void onPause() {
        Log.i("TAG", TAG + "  onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.i("TAG", TAG + "  onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("TAG", TAG + "  onDestroy");
        super.onDestroy();
    }


    @Override
    public void onDetach() {
        Log.i("TAG", TAG + "  onDetach");
        super.onDetach();
    }

    @Override
    protected void lazyLoad()
    {
        Log.i("TAG", TAG +"   lazy" + isPrepared + "   " + isVisible + "  " + mHasLoadedOnce);
        if (!isPrepared || !isVisible || mHasLoadedOnce) {
            return;
        }
        mHasLoadedOnce = true;
    }
}
