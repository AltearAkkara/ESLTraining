package com.akkaratanapat.altear.esltraining.SimpleComponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.akkaratanapat.altear.esltraining.R;

public class ListviewActivity extends Activity {

    ListView listView;
    String[] str = {"A","B"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        List list = new List(getBaseContext(),android.R.layout.simple_list_item_1,str);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), str[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
