package com.example.administrator.meipai.activity;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.meipai.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tb_videoType)
    Toolbar tbVideoType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBar();
    }

    //初始化标题栏
    private void initToolBar() {
        setSupportActionBar(tbVideoType);

       ActionBar action = getSupportActionBar();
        if (action!=null){
            action.setDisplayHomeAsUpEnabled(true);
            //action.setHomeAsUpIndicator(R.mipmap.ic_drawer);
        }

    }

    /**
     * 实例化菜单
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);

        return true;
    }

    /**
     * 菜单item被选中的事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            //返回键的点击事件
            case android.R.id.home:
                this.finish();
                break;
            //宠物的点击事件
            case R.id.pet:

                break;
            //明星的点击事件
            case R.id.star:

                break;

            //旅游选项的点击事件
            case R.id.travel:

                break;
        }
        return true;
    }
}
