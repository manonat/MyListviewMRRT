package com.virtualsiam.mylistviewmrrt;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // A. เค้าจะประกาศตัวแปรสำหรับ listview ที่สร้างไว้ตอนแรก
    private ListView listView_mrrt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // A. เค้าประกาศต่อจากข้างบนไงจ๊ะ
        listView_mrrt = (ListView)findViewById(R.id.listView_mrrt);
        listView_mrrt.setAdapter(new ListViewAdapter());

    }


    private class ListViewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView , ViewGroup parent) {
            if (convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.item_listview, null);

            }else{

            }
            return convertView;
        }
    }
}

