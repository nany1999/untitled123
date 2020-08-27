package com.example.listviewbean;

import android.content.Context;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import cn.twle.android.common.MsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private ListView list_book;
    private MsAdapter<BookBean> adapter2 = null;
    private List<BookBean> mData2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        init();

    }

    private void init() {
        ListView list_book = findViewById(R.id.list_book);
        mData2 = new ArrayList<BookBean>();
        mData2.add(new BookBean("《时间简史（插图本）》", "史蒂芬·霍金"));
        mData2.add(new BookBean("《梦幻花》", "东野圭吾"));
        mData2.add(new BookBean("《原则》", "瑞·达利欧"));

        adapter2 = new MsAdapter<BookBean>((ArrayList)mData2,R.layout.list_book_item) {
            @Override
            public void bindView(ViewHolder holder, BookBean obj) {
                holder.setText(R.id.name,obj.getName());
                holder.setText(R.id.author,obj.getAuthor());
            }
        };


        list_book.setAdapter(adapter2);
   }
}


