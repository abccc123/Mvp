package com.xintong.mvp.presenter;


import com.xintong.mvp.activity.InNewsView;
import com.xintong.mvp.model.NewsModel;

/**
 * Created by Administrator on 2016/11/3.
 */

public class NewsPresenter implements InNewsPresenter{

    private InNewsView mInNewsView;
    private NewsModel mNewsModel;
    public NewsPresenter(InNewsView inNewsView) {
        this.mInNewsView = inNewsView;
        this.mNewsModel = new NewsModel();
    }
    @Override
    public void loadNews() {
        //通过调用IInfoView的方法来更新显示，设计模式运用
        //类似回调监听处理
        mInNewsView.addNews(mNewsModel.getNews());
    }
}
