package com.bawei.fragmentcanshu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//将布局文件转换成对象
		view = inflater.inflate(R.layout.fragment1, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Bundle arguments = getArguments();
		String string = arguments.getString("haha");
		TextView textView = (TextView) view.findViewById(R.id.textView);
		textView.setText(string);

	}
	public static Fragment1 newFragment(String str) {
		//创建对象
		Fragment1 fragment1 = new Fragment1();
		//创建bundle用来传递参数
		Bundle args = new Bundle();
		args.putString("haha", str);
		fragment1.setArguments(args);
		//返回
		return fragment1;
	}

}
