package com.stx.xhb.dmgameapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.stx.core.base.BaseMvpFragment;
import com.stx.xhb.dmgameapp.data.entity.NewsChannelListBean;
import com.stx.xhb.dmgameapp.mvp.ui.fragment.NewsCommonFragment;

import java.util.List;

/**
 * Author: Mr.xiao on 2017/3/5
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @describe: 资讯ViewPager适配器
 */
public class NewsViewPagerFragmentAdapter extends FragmentStatePagerAdapter {
    private List<BaseMvpFragment> mFragmentList;

    public NewsViewPagerFragmentAdapter(FragmentManager fm, List<BaseMvpFragment> mFragmentList) {
        super(fm);
        this.mFragmentList = mFragmentList;
    }

    @Override
    public BaseMvpFragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}
