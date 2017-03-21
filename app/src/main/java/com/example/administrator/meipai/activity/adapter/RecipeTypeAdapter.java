package com.example.administrator.meipai.activity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.meipai.R;
import com.example.administrator.meipai.activity.entiy.RecipeTypeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2017/3/20.
 */

public class RecipeTypeAdapter extends RecyclerView.Adapter<RecipeTypeAdapter.ViewHolder> {
    List<RecipeTypeInfo> mlist;
    Context mContext;
    public RecipeTypeAdapter(Context context) {
        mlist=new ArrayList<>();
        mContext=context;
    }

    public void add(List<RecipeTypeInfo> list){
        mlist.addAll(list);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipetype,parent,false);
        ViewHolder vh=new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        WindowManager wm = (WindowManager) mContext
                .getSystemService(Context.WINDOW_SERVICE);
        //获得屏幕宽和高
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        RecyclerView.LayoutParams layoutParams= (RecyclerView.LayoutParams) holder.mItemView.getLayoutParams();
        Log.e("oldw",layoutParams.width+"");
        layoutParams.width=width/4;
        Log.e("neww",layoutParams.width+"");
        //设置给itemview
        holder.mItemView.setLayoutParams(layoutParams);

        holder.icon.setImageResource(mlist.get(position).getImageId());
        holder.type.setText(mlist.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon;
        TextView type;
        View mItemView;
        public ViewHolder(View itemView) {
            super(itemView);
            mItemView=itemView;
            icon= (ImageView) itemView.findViewById(R.id.icon);
            type= (TextView) itemView.findViewById(R.id.type);
        }
    }
}
