package com.example.helloworld.fragments;

import java.util.zip.Inflater;

import com.example.helloworld.R;
import com.example.helloworld.fragments.inputcells.SimpleTextInputCellFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PasswordRecoverStep1Fragment extends Fragment {
	SimpleTextInputCellFragment fragEmail;
	View view;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		if(view==null){
		 view = inflater.inflate(R.layout.fragment_password_recover_step1, null);

			fragEmail = (SimpleTextInputCellFragment) getFragmentManager().findFragmentById(R.id.input_email);

			view.findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					goNext();
				}
			});
		}

		return view;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		fragEmail.setLabelText("ע������");
		fragEmail.setHintText("����ע�������ַ");
	}

	public static interface OnGoNextListener{
		void onGoNext();
	}

	OnGoNextListener onGoNextListener;

	public void setOnGoNextListener(OnGoNextListener onGoNextListener) {
		this.onGoNextListener = onGoNextListener;
	}

	void goNext(){
		if(onGoNextListener!=null){
			onGoNextListener.onGoNext();
		}
	}
}
