package com.example.administrator.meipai.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.meipai.R;
import com.example.administrator.meipai.activity.adapter.RecipeTypeAdapter;
import com.example.administrator.meipai.activity.model.RecipeType;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tb_videoType)
    Toolbar tbVideoType;
    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.rc)
    RecyclerView rc;
    @BindView(R.id.rc_RecipeType)
    RecyclerView rcRecipeType;

    private RecipeTypeAdapter recipeTypeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBar();

        //edittext设置点击事件
        etSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
        //初始化recyclerview食谱类型数据
        initRecipeType();
        //初始化recyclerview列表数据
        initRecyclerView();
    }

    /**
     * 初始化recyclerview食谱类型数据
     */
    private void initRecipeType() {
        rcRecipeType.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false));
        recipeTypeAdapter=new RecipeTypeAdapter(this);
        RecipeType.showRecipeType(recipeTypeAdapter);
        rcRecipeType.setAdapter(recipeTypeAdapter);
    }

    private void initRecyclerView() {


    }

    //初始化标题栏
    private void initToolBar() {
        setSupportActionBar(tbVideoType);

        ActionBar action = getSupportActionBar();
        if (action != null) {
            //设置返回home按钮的显示，与显示的图标
            action.setDisplayHomeAsUpEnabled(true);
            action.setHomeAsUpIndicator(R.mipmap.ic_user);
        }

    }

    /**
     * 实例化菜单
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    /**
     * 菜单item被选中的事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //返回键的点击事件
            case android.R.id.home:

                break;
            //宠物的点击事件
            case R.id.pet:

                break;

        }
        return true;
    }
}
