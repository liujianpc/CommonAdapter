package com.example.commonadapaterandviewholder;

import android.R.integer;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewHodler {

	private static SparseArray<View> mView;
	private View convertView;

	private ViewHodler(Context context, ViewGroup parent, int layoutId,
			int position) {
		this.mView = new SparseArray<>();
		convertView = LayoutInflater.from(context).inflate(layoutId, parent,
				false);
		convertView.setTag(this);
	}

	public static ViewHodler getViewHodler(Context context, View convertView,
			ViewGroup parent, int layoutId, int position) {
		if (convertView == null) {
			return new ViewHodler(context, parent, layoutId, position);
		}
		return (ViewHodler) convertView.getTag();

	}
	
	public <T extends View>T getView(int viewId){
		View view = mView.get(viewId);
		if (view == null) {
			view = convertView.findViewById(viewId);
			mView.put(viewId, view);
		}
		
		return (T) view;
		
	}

}
