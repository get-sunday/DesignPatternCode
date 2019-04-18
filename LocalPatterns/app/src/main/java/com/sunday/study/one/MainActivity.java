package com.sunday.study.one;

import android.content.ClipData;
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

import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> arrayAdapter;

    String url = "https://www.factzone.cn/yh/api/10071019";
    String img = "http://file.me.factzone.cn/cover_url/CqyNzlpXKJOAS7SgAAGL8_QM6B8044.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView =  new RecyclerView(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        setContentView(recyclerView);

        List<Module>  datas = new ArrayList<>();
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));
        datas.add(new Module(img));


        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(Module.class,new ItemAdapter(this));
        recyclerView.setAdapter(adapter);
        adapter.setItems(datas);
        adapter.notifyDataSetChanged();



    }

    //飞航不错的时候的啦 Event Logs
    public void requestVideoList(final boolean isRefreshing) {
//
//        HashMap<String, String> params = new HashMap<>();
//        params.put("offset", String.valueOf(offset));
//        params.put("limit", "30");
//        params.put("userId",String.valueOf("37928"));
//        OkGo.<VideosBean>post(url)
//                .upJson(new JSONObject(params).toString())
//                .execute(new JsonCallback<VideosBean>(VideosBean.class) {
//                    @Override
//                    public void onSuccess(VideosBean data) {
//
//                    }
//                    }
//
//                });


    }
}
