package com.example.manne.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pager)
    ViewPager pager;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager(pager);
        tabLayout.setupWithViewPager(pager);

    }

    public void setUpViewPager(ViewPager upViewPager) {
        MyPageAdapter adapter = new MyPageAdapter(this.getSupportFragmentManager());
        adapter.addFrgament(new Fragment1(), "Tab 1");
        adapter.addFrgament(new Fragment2(), "Tab 2");
        adapter.addFrgament(new Fragment3(), "Tab 3");
        adapter.addFrgament(new Fragment4(), "Tab 4");
        pager.setAdapter(adapter);
    }
}
