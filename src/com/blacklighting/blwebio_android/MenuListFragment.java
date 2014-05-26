package com.blacklighting.blwebio_android;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author �Ǿ�
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

		SampleAdapter adapter = new SampleAdapter(getActivity());
		for (int i = 0; i < 20; i++) {
			adapter.add(new SampleItem("Sample List",
					android.R.drawable.ic_menu_search));
		}
		setListAdapter(adapter);
	}

	/**
	 * ��SQLite�лָ�΢������
	 */
	protected void recoveryWeiboCategoryFormDB() {

	}

	/**
	 * @author �Ǿ� ΢�������б���
	 */
	private class SampleItem {
		public String tag;

		public SampleItem(String tag, int iconRes) {
			this.tag = tag;
		}
	}

	/**
	 * @author �Ǿ� ΢�������б�������
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
			return weiboCategories.get(position);
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
				title.setText(weiboCategories.get(position).tag);
			} else {
				ImageView accountPhoto = (ImageView) convertView
						.findViewById(R.id.accountPhoto);
				
			}
			return convertView;
		}
	}

	public class SampleAdapter extends ArrayAdapter<SampleItem> {

		public SampleAdapter(Context context) {
			super(context, 0);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(
						R.layout.menu_row, null);
			}
			TextView title = (TextView) convertView
					.findViewById(R.id.row_title);
			title.setText(getItem(position).tag);

			return convertView;
		}

	}
}
