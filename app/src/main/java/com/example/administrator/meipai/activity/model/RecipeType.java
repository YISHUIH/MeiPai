package com.example.administrator.meipai.activity.model;

import com.example.administrator.meipai.R;
import com.example.administrator.meipai.activity.adapter.RecipeTypeAdapter;
import com.example.administrator.meipai.activity.entiy.RecipeTypeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */

public class RecipeType {

   private static List<RecipeTypeInfo> list=new ArrayList<>();
   private static RecipeTypeInfo info=null;
    public static void showRecipeType(RecipeTypeAdapter adapter){


        addData();
        adapter.add(list);
    }

    public static void addData(){

        info=new RecipeTypeInfo(R.drawable.meat,"荤菜");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.drink,"饮品");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.easy,"便当");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.snack,"小吃");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.gruel,"汤粥");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.staplefood,"主食");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.vegetables,"素菜");
        list.add(info);
        info=new RecipeTypeInfo(R.drawable.west,"西点");
        list.add(info);
    }

}
