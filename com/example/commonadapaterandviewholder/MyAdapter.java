package com.example.commonadapaterandviewholder;

import java.util.List;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter<T> extends CommonAdapter<T> {
	int layoutId;

	public MyAdapter(List<T> mDataList, Context mContext,int layoutId) {
		super(mDataList, mContext);
		this.layoutId = layoutId;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHodler viewHodler = ViewHodler.getViewHodler(mContext, convertView, parent,layoutId, position);
		TextView mTextView = viewHodler.getView(viewId);//根据viewID来查找view
		
		return null;
	}

}
