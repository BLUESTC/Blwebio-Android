package com.blacklighting.blwebio_android;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author �Ǿ�
 * 
 */
public class MenuListFragment extends Fragment {
	
	ListView list;
	ImageView accountPhoto;
	List<SampleItem> weiboCategories;
	OnMenuIteamClickListener menuClickListener;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
        try {
        	menuClickListener = (OnMenuIteamClickListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnMenuIteamClickListener");
        }
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView=inflater.inflate(R.layout.list, container,false);
		list=(ListView) rootView.findViewById(R.id.list);
		accountPhoto=(ImageView) rootView.findViewById(R.id.account_photo);
		return rootView;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		weiboCategories = new ArrayList<MenuListFragment.SampleItem>();
		recoveryWeiboCategoryFormDB();

		for (int i = 0; i < 20; i++) {
			weiboCategories.add(new SampleItem("Sample List"+i,
					android.R.drawable.ic_menu_search));
		}

		MenuListAdaper adapter = new MenuListAdaper(getActivity());
		
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> l, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				menuClickListener.onMenuIteamClick(l, v, position, id);
			}
		});
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
			return weiboCategories.size() ;
		}

		@Override
		public Object getItem(int position) {
			if (position == 0) {
				return null;
			} else {
				return weiboCategories.get(position);
			}
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
//				if (position != 0) {
//					convertView = LayoutInflater.from(context).inflate(
//							R.layout.menu_row, null);
//				} else {
//					convertView = LayoutInflater.from(context).inflate(
//							R.layout.acount_photo_row, null);
//				}
				convertView = LayoutInflater.from(context).inflate(
						R.layout.menu_row, null);
			}

			TextView title = (TextView) convertView
					.findViewById(R.id.row_title);
			title.setText(weiboCategories.get(position).tag);
			
//			if (position != 0) {
//				TextView title = (TextView) convertView
//						.findViewById(R.id.row_title);
//				title.setText(weiboCategories.get(position).tag);
//			} else {
//				ImageView accountPhoto = (ImageView) convertView
//						.findViewById(R.id.accountPhoto);
//
//			}
			return convertView;
		}
	}
	/**
	 * @author �Ǿ�
	 *	�������˵��Ľӿ���
	 */
	public interface OnMenuIteamClickListener{
		public void onMenuIteamClick(AdapterView<?> l,View v ,int position,long id);
	}
	
}
