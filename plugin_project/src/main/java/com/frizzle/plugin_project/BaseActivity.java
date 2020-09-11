package com.frizzle.plugin_project;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Time: 2019-08-10
 * Author: Liudeli
 * Description:
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Resources getResources() {
        if (getApplication() != null && getApplication().getResources() != null) {
            return getApplication().getResources();
        }
        return super.getResources();
    }

    /**
     * 为什么不重写此getAssets方法也可以呢？
     * 答：既然是融合一体，得到了 getResources， AssetManager单例的
     */
//    @Override
//    public AssetManager getAssets() {
//        return super.getAssets();
//    }
}
