package com.example.administrator.meipai.activity.entiy;

import com.example.administrator.meipai.activity.model.RecipeType;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/21.
 */

public class RecipeTypeInfo {

    private int imageId;
    private String type;

    public RecipeTypeInfo(){

    }

    public RecipeTypeInfo(int imageId, String type) {
        this.imageId = imageId;
        this.type = type;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
