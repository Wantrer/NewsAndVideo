package com.lvlw.myapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lvlw.myapp.R;
import com.lvlw.myapp.entity.NewsData;

import java.util.ArrayList;


/**
 * Created by Wantrer on 2017/3/22 0022.
 */

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private LayoutInflater mInflater;
    private ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> list=new ArrayList<>();



    public NewsAdapter(Context context, ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> list) {
        super();
        mInflater=LayoutInflater.from(context);
        this.list = list;
    }




    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //        return new DataViewHolder(mInflater.inflate(R.layout.test_fragment_selected_item,parent,false));
        return new NewsAdapter.NewsViewHolder(mInflater.inflate(R.layout.news_fragment_selected_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final NewsAdapter.NewsViewHolder newsViewHolder= (NewsAdapter.NewsViewHolder) holder;
        //        dataViewHolder.textView.setText(mDatas.get(position).getName());
        newsViewHolder.item_name.setText(list.get(position).getTitle());
        newsViewHolder.item_source.setText(list.get(position).getSource());
        if (list.get(position).isHavePic()){
            newsViewHolder.item_image.setVisibility(View.VISIBLE);
            newsViewHolder.item_image.setImageURI(list.get(position).getImageurls().get(0).getUrl());
        }else {
            newsViewHolder.item_image.setVisibility(View.GONE);
        }
    }


    /**
     *
     * @return item的个数，最好加个为空判断。
     */
    @Override
    public int getItemCount() {
        //        return mDatas!=null?mDatas.size():0;
        return list!=null?list.size():0;
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView item_name;
        TextView item_source;
        //加载网络图片使用NetworkImageView   begin
        //        NetworkImageView networkImageView;
        SimpleDraweeView item_image;

        //加载网络图片使用NetworkImageView   end
        public NewsViewHolder(View itemView) {
            super(itemView);
            //完成Item View 和ViewHolder里属性的绑定，begin
            item_name = (TextView) itemView.findViewById(R.id.news_name);
            item_source = (TextView) itemView.findViewById(R.id.news_source);
            //加载网络图片使用NetworkImageView   begin
            item_image = (SimpleDraweeView) itemView.findViewById(R.id.news_image);
            //加载网络图片使用NetworkImageView   end
            //完成Item View 和ViewHolder里属性的绑定，end
        }
    }

    public ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> getList() {
        return list;
    }
}
