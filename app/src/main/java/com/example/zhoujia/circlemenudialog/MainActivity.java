package com.example.zhoujia.circlemenudialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCiecleMenuDialog;

    String[] itemsRes=new String[]{"新建皮肤 ",
            "导入皮肤",
            "我的皮肤",
            "我的素材",
            "建议反馈",
            "更多作品",
            "版本更新"};
    int[] itemIcons=new int[]{
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_upgrade,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_upgrade,
            R.mipmap.ic_upgrade
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCiecleMenuDialog=(Button)findViewById(R.id.btnCiecleMenuDialog);
        btnCiecleMenuDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CircleMenuDialog circleMenuDialog=new CircleMenuDialog(MainActivity.this);
                circleMenuDialog.setCentertxt("这里是中间的文字");
                circleMenuDialog.setItemTexts(itemsRes);
                circleMenuDialog.setItemTIcons(itemIcons);
                circleMenuDialog.setItemOnclickListener(new CircleMenuDialog.ItemOnclickListener() {
                    @Override
                    public void onClick(int position) {
                        circleMenuDialog.dismiss();
                        Toast.makeText(MainActivity.this, itemsRes[position], Toast.LENGTH_SHORT).show();
                    }
                });
                circleMenuDialog.show();
            }
        });
    }
}
