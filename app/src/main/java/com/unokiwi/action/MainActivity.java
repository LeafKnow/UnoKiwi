package com.unokiwi.action;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jkb.fragment.rigger.annotation.Puppet;
import com.jkb.fragment.rigger.rigger.Rigger;
import com.unokiwi.common.base.BaseFluxActivity;
import com.unokiwi.common.constant.Constants;

@Puppet(containerViewId = R.id.fm_content, bondContainerView = true)
public class MainActivity extends BaseFluxActivity {

    @Override
    public void initData(Bundle savedInstanceState) {
        // 获取Fragment
        Fragment fragment = (Fragment) ARouter.getInstance().build(Constants.MAIN_FMT).navigation();
        if (null!=fragment)
            Rigger.getRigger(this).startFragment(fragment);
    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
