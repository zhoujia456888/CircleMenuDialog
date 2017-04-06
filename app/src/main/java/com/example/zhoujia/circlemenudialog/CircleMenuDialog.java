package com.example.zhoujia.circlemenudialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by zhoujia on 2017/4/5.
 */

public class CircleMenuDialog extends Dialog{
    private String[] itemTexts ;
    private int[] itemIcons ;
    private String centertxtStr;
    Context context;
    ItemOnclickListener itemOnclickListener;
    public CircleMenuDialog(Context context1) {
        super(context1, R.style.CircleMenuDialog);
        context=context1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_circlemenu);
        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu_items);
        TextView txtcenter=(TextView)findViewById(R.id.circle_menu_center);
        circleMenu.setRotating(true);//是否启用旋转
        //circleMenu.setItems(itemIcons);//只显示图标
        circleMenu.setIconSize(50);//图标大小，单位为dp

        circleMenu.setOnItemClickListener(new CircleMenu.OnItemClickListener() {
            @Override
            public void onItemClick(CircleMenu.ItemView view) {
               // KLog.e(view.getPosition());
                itemOnclickListener.onClick(view.getPosition());
            }
        });
        findViewById(R.id.circle_menu_center).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        if(centertxtStr!=null){
            txtcenter.setText(centertxtStr);
        }
        if(itemTexts.length!=0&&itemIcons.length!=0){
            circleMenu.setItems(itemTexts, itemIcons);//显示文字及图标
        }
    }


    //设置中间的字
    public void setCentertxt(String message) {
        centertxtStr = message;
    }

    //设置转盘上的图片
    public void setItemTIcons(int[] Icons){
        itemIcons=Icons;
    }

    //设置转盘上的文字
    public void setItemTexts(String[] itemsRes){
        itemTexts=itemsRes;
    }

    //按键监听返回
    public void setItemOnclickListener(ItemOnclickListener onItemOnclickListener) {
        this.itemOnclickListener = onItemOnclickListener;
    }
    public interface ItemOnclickListener {
        public void onClick(int position);
    }

}
