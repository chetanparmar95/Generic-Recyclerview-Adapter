package com.genericrecyclerview.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by chetan on 21/05/2017.
 */

public class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {

    private List<? extends T> list;
    private int viewId;
    private BaseInterface listener;

    public BaseAdapter(int viewId,List<? extends T> list,BaseInterface listener) {
        this.list = list;
        this.viewId = viewId;
        this.listener = listener;
    }



    public static class ViewHolder<V extends ViewDataBinding> extends RecyclerView.ViewHolder {
        private V v;

        public ViewHolder(V v) {
            super(v.getRoot());
            this.v = v;
        }

        public V getBinding() {
            return v;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return viewId;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public BaseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding bind = DataBindingUtil.bind(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false));
        return new ViewHolder<>(bind);
    }

    @Override
    public void onBindViewHolder(BaseAdapter.ViewHolder holder, int position) {
        final T model = list.get(position);
        holder.getBinding().setVariable(com.genericrecyclerview.BR.model, model);
        holder.getBinding().setVariable(com.genericrecyclerview.BR.listener,listener);
        holder.getBinding().setVariable(com.genericrecyclerview.BR.position,position);
        holder.getBinding().executePendingBindings();
    }

    public interface BaseInterface{}
}