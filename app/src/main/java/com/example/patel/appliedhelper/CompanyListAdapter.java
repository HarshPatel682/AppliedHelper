package com.example.patel.appliedhelper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CompanyListAdapter extends ArrayAdapter<Company> {

    private static final String TAG = "CompanyListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    private List<Company> mCompanyList;

    private static class ViewHolder {
        TextView tvName;
        TextView tvDateApplied;
        TextView tvStatus;
    }

    public CompanyListAdapter(Context mContext, int mResource, ArrayList<Company> mCompanyList) {
        super(mContext, mResource, mCompanyList);
        this.mContext = mContext;
        this.mResource = mResource;
        this.mCompanyList = mCompanyList;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View result;
        ViewHolder holder;

        String name = getItem(i).getName();
        String dateApplied = getItem(i).getDate_applied();
        String status = getItem(i).getStatus();

        Company company = new Company(name, dateApplied, status);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.tvName = (TextView)convertView.findViewById(R.id.tv_name);
            holder.tvDateApplied = (TextView)convertView.findViewById(R.id.tv_applied_date);
            holder.tvStatus = (TextView)convertView.findViewById(R.id.tv_status);

            result = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }



        holder.tvName.setText(company.getName());
        holder.tvDateApplied.setText(company.getDate_applied());
        holder.tvStatus.setText(company.getStatus());

        return convertView;
    }
}
