package com.example.patel.appliedhelper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CompanyListAdapter extends BaseAdapter{

    private Context mContext;
    private List<Company> mCompanyList;

    public CompanyListAdapter(Context mContext, List<Company> mCompanyList) {
        this.mContext = mContext;
        this.mCompanyList = mCompanyList;
    }

    @Override
    public int getCount() {
        return mCompanyList.size();
    }

    @Override
    public Object getItem(int i) {
        return mCompanyList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.item_company_list, null);
        TextView tvName = (TextView)v.findViewById(R.id.tv_name);
        TextView tvDateApplied = (TextView)v.findViewById(R.id.tv_applied_date);
        TextView tvStatus = (TextView)v.findViewById(R.id.tv_status);

        //set the text views
        tvName.setText(mCompanyList.get(i).getName());
        tvDateApplied.setText(mCompanyList.get(i).getDate_applied());
        tvStatus.setText(mCompanyList.get(i).getStatus());

        //save company id to tag
        v.setTag(mCompanyList.get(i).getId());
        return v;
    }
}
