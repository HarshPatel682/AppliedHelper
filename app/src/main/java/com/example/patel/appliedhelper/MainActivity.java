package com.example.patel.appliedhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvCompany;
    private CompanyListAdapter adapter;
    private List<Company> mCompanyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCompany = (ListView) findViewById(R.id.listview_companies);
        mCompanyList = new ArrayList<>();

        //creating some sample companies
        mCompanyList.add(new Company(1, "Sample 1", "10/09/2017", "Waiting"));
        mCompanyList.add(new Company(2, "Sample 2", "12/24/2017", "Rejected"));
        mCompanyList.add(new Company(3, "Sample 3", "1/15/2018", "Waiting"));

        adapter = new CompanyListAdapter(getApplicationContext(), mCompanyList);
        lvCompany.setAdapter(adapter);

        lvCompany.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Clicked Company: " + view.getTag(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
