package com.xintong.mvp.model;


import com.google.gson.Gson;
import com.xintong.mvp.bean.News;
import com.xintong.mvp.utils.HttpGet;

import static android.os.SystemClock.sleep;

/**
 * Created by Administrator on 2016/11/3.
 */

public class NewsModel implements InNewsModel {
    News news;

    @Override
    public News getNews() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new Gson();
                news=gson.fromJson(HttpGet.request(""),News.class);
               // Log.d("xx", news.getNewslist().get(0).getTitle());
            }
        }).start();
        //主线程等待一秒
        sleep(1000);
       // Log.d("", news.getNewslist().get(0).getTitle());
        return news;


    }
}
