package com.example.listviewchat;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import cn.twle.android.common.MsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview_chat;

    private ArrayList<ChatBean> mData = null;
    private MsAdapter chatAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview_chat=findViewById(R.id.listview_chat);
        mData = new ArrayList<ChatBean>();
        ChatBean chat=new ChatBean();
        chat.setName("caicai");
        chat.setSay("你好");
        chat.setIcon(R.drawable.sep1);
        mData.add(chat);
        ChatBean chat1=new ChatBean();
        chat1.setName("xiaomi");
        chat1.setSay("喵呜");
        chat1.setIcon(R.drawable.sep2);
        mData.add(chat1);
        chatAdapter = new MsAdapter<ChatBean>(mData,R.layout.chat_left){

            //定义两个类别标志
            private static final int TYPE_LEFT = 0;
            private static final int TYPE_RIGHT = 1;

            //多布局的核心，通过这个判断类别
            @Override
            public int getItemViewType(int position) {

                ChatBean chat = (ChatBean)mData.get(position);

                if (chat.isMe()) {
                    return TYPE_RIGHT;
                }

                return TYPE_LEFT;
            }

            // 类别数目
            @Override
            public int getViewTypeCount() {
                return 2;
            }

            public View getView(int position, View convertView, ViewGroup parent) {

                int t = getItemViewType(position);

                Log.d("T",String.valueOf(t));
                int ly = R.layout.chat_left;

                ViewHolder holder;

                switch (t) {
                    case TYPE_LEFT:
                        ly = R.layout.chat_left;
                        holder = ViewHolder.bind(parent.getContext(), convertView, parent, ly
                                , position);
                        break;
                    default:
                        ly = R.layout.chat_right;
                        Log.d("","in right");
                        holder = ViewHolder.bind(parent.getContext(), convertView, parent, ly
                                , position);
                        break;

                }

                bindView(holder, getItem(position));
                return holder.getItemView();
            }

            @Override
            public void bindView(ViewHolder holder, ChatBean obj)
            {
                holder.setImageResource(R.id.icon,obj.getIcon());
                holder.setText(R.id.name,obj.getName());
            }
        };

        listview_chat.setAdapter(chatAdapter);
    }
}



