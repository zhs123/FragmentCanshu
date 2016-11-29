package com.bawei.fragmentcanshu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //先拿到管理者
        FragmentManager fragmentManager=getSupportFragmentManager();
        //拿到事物
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        //创建对象
        Fragment1 fragment1=Fragment1.newFragment("哈哈哈哈");
        //添加容器
        fragmentTransaction.add(R.id.relativeLayout,fragment1);
        //提交
        fragmentTransaction.commit();
    }
}
