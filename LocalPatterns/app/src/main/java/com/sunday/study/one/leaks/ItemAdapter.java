package com.sunday.study.one.leaks;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.sunday.study.one.R;

import me.drakeet.multitype.ItemViewBinder;

public class ItemAdapter extends ItemViewBinder<Module, ItemAdapter.MyHolder> {


    private final Activity activity;
    private RequestOptions testOptions;

    public ItemAdapter(Activity activity){
        this.activity = activity;
    }

    @NonNull
    @Override
    protected MyHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View inflate = inflater.inflate(R.layout.item_image, parent, false);
        return new  ItemAdapter.MyHolder(inflate);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyHolder holder, @NonNull Module item) {
        if (testOptions == null) {
            testOptions = new RequestOptions()
//                    .override(width, height)
                    .priority(Priority.HIGH)
                    .skipMemoryCache(true) //是否跳过内存缓存
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        }
        Glide.with(activity)
                .load(item.imgss)
                .apply(testOptions)
                .into(holder.imgs);
    }

    //配置的
    public static class MyHolder extends RecyclerView.ViewHolder{
        private AppCompatImageView imgs;
        public MyHolder(View itemView) {
            super(itemView);
             imgs = itemView.findViewById(R.id.imgs);
        }
    }


}
