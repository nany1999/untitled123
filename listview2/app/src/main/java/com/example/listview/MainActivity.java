package com.example.listview;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=findViewById(R.id.listview);
        View list_empty=findViewById(R.id.talk_empty);
        listview.setEmptyView(list_empty);
        Button button=findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"请点击",Toast.LENGTH_SHORT).show();


        }

        });



//                button.setOnClickListener();






    }
}
