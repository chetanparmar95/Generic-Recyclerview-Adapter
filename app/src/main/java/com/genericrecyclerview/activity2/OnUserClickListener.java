package com.genericrecyclerview.activity2;

import com.genericrecyclerview.adapter.BaseAdapter;

/**
 * Created by osp121 on 25/3/18.
 */

public interface OnUserClickListener extends BaseAdapter.BaseInterface {
    void onUserClicked(int position);
    void onUserEditClicked(int position);
    void onUserDeleteClicked(int position);
}
