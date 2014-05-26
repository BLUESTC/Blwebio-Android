package com.blacklighting.blwebio_android;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author 亚军
 * 
 */
public class MenuListFragment extends ListFragment {

	List<SampleItem> weiboCategories;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		weiboCategories = new ArrayList<MenuListFragment.SampleItem>();
		recoveryWeiboCategoryFormDB();

		for (int i = 0; i < 20; i++) {
			weiboCategories.add(new SampleItem("Sample List",
					android.R.drawable.ic_menu_search));
		}

		MenuListAdaper adapter = new MenuListAdaper(getActivity());
		
		setListAdapter(adapter);
	}

	/**
	 * 从SQLite中恢复微博分组
	 */
	protected void recoveryWeiboCategoryFormDB() {

	}

	/**
	 * @author 亚军 微博分组列表类
	 */
	private class SampleItem {
		public String tag;

		public SampleItem(String tag, int iconRes) {
			this.tag = tag;
		}
	}

	/**
	 * @author 亚军 微博分组列表适配器
	 */
	public class MenuListAdaper extends BaseAdapter {
		Context context;

		public MenuListAdaper(Context context) {
			this.context = context;
		}

		@Override
		public int getCount() {
			return weiboCategories.size() + 1;
		}

		@Override
		public Object getItem(int position) {
			if (position == 0) {
				return null;
			} else {
				return weiboCategories.get(position - 1);
			}
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				if (position != 0) {
					convertView = LayoutInflater.from(context).inflate(
							R.layout.menu_row, null);
				} else {
					convertView = LayoutInflater.from(context).inflate(
							R.layout.acount_photo_row, null);
				}
			}

			if (position != 0) {
				TextView title = (TextView) convertView
						.findViewById(R.id.row_title);
				title.setText(weiboCategories.get(position-1).tag);
			} else {
				ImageView accountPhoto = (ImageView) convertView
						.findViewById(R.id.accountPhoto);

			}
			return convertView;
		}
	}

//	public class SampleAdapter extends ArrayAdapter<SampleItem> {
//
//		public SampleAdapter(Context context) {
//			super(context, 0);
//		}
//
//		public View getView(int position, View convertView, ViewGroup parent) {
//			if (convertView == null) {
//				convertView = LayoutInflater.from(getContext()).inflate(
//						R.layout.menu_row, null);
//			}
//			TextView title = (TextView) convertView
//					.findViewById(R.id.row_title);
//			title.setText(getItem(position).tag);
//
//			return convertView;
//		}
//
//	}
}
