package com.example.commonadapaterandviewholder;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public abstract class CommonAdapter<T> extends BaseAdapter {
	protected LayoutInflater mInflater;
	protected List<T> mDataList;
	protected Context mContext;

	public CommonAdapter(List<T> mDataList, Context mContext) {
		super();
		this.mInflater = LayoutInflater.from(mContext);
		this.mDataList = mDataList;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mDataList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mDataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}
