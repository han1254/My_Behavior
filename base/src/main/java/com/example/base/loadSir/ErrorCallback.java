package com.example.base.loadSir;

import com.example.base.R;
import com.kingja.loadsir.callback.Callback;

/**
 * @author YangZhaoxin.
 * @since 2020/1/11 11:13.
 * email yangzhaoxin@hrsoft.net.
 */

public class ErrorCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.layout_error;
    }
}
