package com.example.alertdialog;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  private static final String[] lang={"Kotlin", "Java", "Python", "PHP", "C#", "Ruby", "Perl"};
  private static final String[] city={"北京", "上海", "广州", "深圳", "杭州", "成都", "厦门"};
  private static final String[] story={"悲剧","喜剧","幽默","搞笑"};
  private static final boolean[] checkItems={true,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //下拉选择
//        builder.setTitle("你选择的开发语言") ;
//        builder.setItems(lang, new DialogInterface.OnClickListener(){
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//               Toast.makeText(getApplicationContext(),"你选择了"+ lang[which],Toast.LENGTH_SHORT).show();
//            }
//        });
        //弹框提示
//        builder.setIcon(R.drawable.icon);
//        builder.setTitle("系统提示");
//        builder.setMessage("这是一个最普通的 AlertDialog,\\n带有三个按钮，分别是取消，普通和确定\\n");
//        builder.setNegativeButton("取消",new DialogInterface.OnClickListener(){
//        @Override
//            public void onClick(DialogInterface dialog, int which){
//            Toast.makeText(MainActivity.this,"你点击了取消", Toast.LENGTH_LONG).show();
//
//        }
//
//        }
//        );
//        builder.setNegativeButton("确定",new DialogInterface.OnClickListener(){
//          @Override
//          public void onClick(DialogInterface dialog, int which){
//              Toast.makeText(MainActivity.this,"你点击了确定",Toast.LENGTH_SHORT).show();
//          }
//        });
//         builder.setNegativeButton("普通按钮",new DialogInterface.OnClickListener(){
//             @Override
//             public void onClick(DialogInterface dialog, int which){
//                 Toast.makeText(MainActivity.this,"你点击了普通按钮",Toast.LENGTH_SHORT).show();
//             }
//         });

        //单选
//         builder.setTitle("请选择城市");
//         builder.setSingleChoiceItems(city,0,new DialogInterface.OnClickListener(){
//             @Override
//             public void onClick(DialogInterface dialog, int which){
//                 Toast.makeText(getApplicationContext(),"你选择了"+city[which],Toast.LENGTH_SHORT).show();
//             }
//         });
         //多选
         builder.setTitle("请选择类型");
         builder.setMultiChoiceItems(story,checkItems,new DialogInterface.OnMultiChoiceClickListener(){
             @Override
             public void onClick(DialogInterface dialog, int which, boolean isChecked){
                 checkItems[which] = isChecked;

             }
         });
            builder.setPositiveButton("确定",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which){
                   String result ="";
                   for(int i=0; i <checkItems.length; i++){
                       if(checkItems[i]){
                           result += story[i]+"";
                       }
                       Toast.makeText(getApplicationContext(),"你选择了"+result,Toast.LENGTH_SHORT).show();

                   }

                }

            });

         AlertDialog dialog =builder.create();
         dialog.show();


    }
}
