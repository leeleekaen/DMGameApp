package com.stx.xhb.dmgameapp.mvp.contract;

import android.content.Context;

import com.qq.e.ads.nativ.NativeExpressADView;
import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.NewsListBean;
import com.stx.xhb.dmgameapp.data.entity.NewsPageBean;

/**
 * Author：xiaohaibin
 * Time：2017/9/18
 * Emil：xhb_199409@163.com
 * Github：https://github.com/xiaohaibin/
 * Describe：
 */
public interface GetNewsListContract {

    interface getNewsListModel extends IModel {
        void getNewsList(int page);

        void loadAD(Context context);
    }

    interface getNewListView extends IView {

        void getNewListSuccess(NewsPageBean.DataBean data);

        void getADData(NativeExpressADView nativeADDataRef);

        void getNewListFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
