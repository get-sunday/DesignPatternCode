package com.sunday.study.one;

import android.content.ClipData;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.lzy.okgo.OkGo;
import com.sunday.study.one.leaks.ItemAdapter;
import com.sunday.study.one.leaks.Module;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> arrayAdapter;

    String url = "https://www.factzone.cn/yh/api/10071019";
    String img = "http://file.me.factzone.cn/cover_url/CqyNzlpXKJOAS7SgAAGL8_QM6B8044.jpg";
    private Items items;
    private MultiTypeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv);
        final SwipeRefreshLayout swipe = findViewById(R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setRefreshing(false);
                items.addAll(getDatas());
                adapter.notifyDataSetChanged();
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        adapter = new MultiTypeAdapter();
        adapter.register(Module.class,new ItemAdapter(this));
        items = new Items();
        items.addAll(getDatas());
        recyclerView.setAdapter(adapter);
        adapter.setItems(items);
        adapter.notifyDataSetChanged();

    }

    public List<Module> getDatas(){
        List<Module>  datas = new ArrayList<>();
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        return  datas;
    }



    /**
     *
     */
    private void  mains(){

    }

}
