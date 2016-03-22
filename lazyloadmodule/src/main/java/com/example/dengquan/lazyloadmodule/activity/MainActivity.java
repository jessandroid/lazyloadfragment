package com.example.dengquan.lazyloadmodule.activity;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dengquan.lazyloadmodule.Fragment.AFragment;
import com.example.dengquan.lazyloadmodule.Fragment.BFragment;
import com.example.dengquan.lazyloadmodule.Fragment.CFragment;
import com.example.dengquan.lazyloadmodule.Fragment.DFragment;
import com.example.dengquan.lazyloadmodule.R;
import com.example.dengquan.lazyloadmodule.adapter.MyAdapter;
import com.example.dengquan.lazyloadmodule.viewpager.MyViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private List<Fragment> list = new ArrayList<>();
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private DFragment dFragment;

    private MyViewPager mvp;
    private LinearLayout merchant_lay;
    private LinearLayout order_lay;
    private LinearLayout privilege_lay;
    private LinearLayout mine_lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        initView();
        MyAdapter adapter = new MyAdapter(this.getSupportFragmentManager(),list);
        mvp.setAdapter(adapter);
        mvp.setCurrentItem(0);
    }

    private void initFragment()
    {
        aFragment = new AFragment();
        bFragment = new BFragment();
        cFragment = new CFragment();
        dFragment = new DFragment();
        list.add(aFragment);
        list.add(bFragment);
        list.add(cFragment);
        list.add(dFragment);
    }

    private void initView()
    {
        mvp = (MyViewPager)this.findViewById(R.id.mvp);
        merchant_lay = (LinearLayout)this.findViewById(R.id.merchant_lay);
        order_lay = (LinearLayout)this.findViewById(R.id.order_lay);
        privilege_lay = (LinearLayout)this.findViewById(R.id.privilege_lay);
        mine_lay = (LinearLayout)this.findViewById(R.id.mine_lay);


        merchant_lay.setOnClickListener(this);
        order_lay.setOnClickListener(this);
        privilege_lay.setOnClickListener(this);
        mine_lay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.merchant_lay:
                mvp.setCurrentItem(0);
                break;
            case R.id.order_lay:
                mvp.setCurrentItem(1);
                break;
            case R.id.privilege_lay:
                mvp.setCurrentItem(2);
                break;
            case R.id.mine_lay:
                mvp.setCurrentItem(3);
                break;
        }
    }
}
