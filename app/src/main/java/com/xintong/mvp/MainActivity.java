package com.xintong.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.xintong.mvp.activity.InNewsView;
import com.xintong.mvp.bean.News;
import com.xintong.mvp.presenter.NewsPresenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements InNewsView{
    private ListView lv;
    private NewsPresenter mNewsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewsPresenter = new NewsPresenter(this);
        mNewsPresenter.loadNews();
    }

    @Override
    public void addNews(News news) {
        lv = (ListView) findViewById(R.id.listview);
        Log.d("xx",news.getNewslist().get(0).getTitle());

        SimpleAdapter adapter = new SimpleAdapter(this, getData(news),
                R.layout.listview_item, new String[]{"img", "title", "info"},
                new int[]{R.id.img, R.id.title, R.id.info});

        lv.setAdapter(adapter);
    }

    private List<Map<String, Object>> getData(News news) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        for (News.NewslistBean newslistBean : news.getNewslist()) {
            map = new HashMap<String, Object>();
            map.put("img", R.mipmap.ic_launcher);
            map.put("title", newslistBean.getTitle());
            map.put("info", newslistBean.getDescription());
            list.add(map);
        }


        return list;


    }
}
