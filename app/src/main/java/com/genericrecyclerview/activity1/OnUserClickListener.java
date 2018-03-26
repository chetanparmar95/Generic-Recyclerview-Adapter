package com.genericrecyclerview.activity1;

import com.genericrecyclerview.adapter.BaseAdapter;

/**
 * Created by osp121 on 25/3/18.
 */

public interface OnUserClickListener extends BaseAdapter.BaseInterface{
    void onUserClicked(String username);
}
