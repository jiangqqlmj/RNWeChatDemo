package com.rnwechatdemo.wxapi;

import android.app.Activity;
import android.os.Bundle;

import com.theweflex.react.WeChatModule;

/**
 * 当前类注释:
 * 项目名：android
 * 包名：com.rnwechatdemo.wxapi
 * 作者：江清清 on 16/6/15 20:01
 * 邮箱：jiangqqlmj@163.com
 * QQ： 781931404
 * 公司：江苏中天科技软件技术有限公司
 * 站点:<a href="http://www.lcode.org">www.lcode.org</a>
 */
public class WXEntryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WeChatModule.handleIntent(getIntent());
        finish();
    }
}
