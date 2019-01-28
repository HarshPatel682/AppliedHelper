package com.example.patel.appliedhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ListView lvCompany;
    private CompanyListAdapter adapter;
    private ArrayList<Company> mCompanyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate : Started");

        lvCompany = (ListView) findViewById(R.id.listview_companies);
        mCompanyList = new ArrayList<>();

        //creating some sample companies
        mCompanyList.add(new Company( "Sample 1", "10/09/2017", "Waiting"));
        mCompanyList.add(new Company( "Sample 2", "12/24/2017", "Rejected"));
        mCompanyList.add(new Company( "Sample 3", "1/15/2018", "Waiting"));

        adapter = new CompanyListAdapter(this, R.layout.item_company_list, mCompanyList);
        lvCompany.setAdapter(adapter);

        lvCompany.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Clicked Company: " + view.getTag(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
