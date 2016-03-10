package com.imooc.imoocbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.imooc.imoocbaseadapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Bean> mDatas;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();
        
        initView();
    }

    private void initView() {

        mListView = (ListView) findViewById(R.id.id_listview);

        mListView.setAdapter(mAdapter);
    }

    private void initDatas() {

        mDatas = new ArrayList<Bean>();

        Bean bean = new Bean("Android新技能Get1",
                "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能Get2",
                "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

       bean = new Bean("Android新技能Get3",
                "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能Get4",
                "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能Get5",
                "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

        mAdapter = new MyAdapter(this, mDatas);

    }
}
