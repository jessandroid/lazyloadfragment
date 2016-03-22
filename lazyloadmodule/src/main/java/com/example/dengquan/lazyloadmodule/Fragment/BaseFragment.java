package com.example.dengquan.lazyloadmodule.Fragment;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by dengquan on 16-3-22.
 */
public abstract class BaseFragment extends Fragment
{

    //当前的Fragment是否可见
    protected boolean isVisible ;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.i("TAG",this.toString() +"  setUserVisibleHint");
        if(getUserVisibleHint())
        {
            isVisible = true;
            onVisible();
        }
        else
        {
            isVisible = false;
            onInVisible();
        }
    }

    /**
     * 当Fragment可见时执行的函数
     */
    private void onVisible()
    {
        lazyLoad();
    }

    /**
     * 当Fragment不可见执行的函数
     */
    private void onInVisible()
    {

    }

    protected abstract void lazyLoad();


}

