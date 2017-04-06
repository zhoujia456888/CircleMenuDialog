# About
可旋转的环形菜单弹出框。啊，就是一个好玩的弹出框而已。项目参考了https://github.com/gzu-liyujiang/CircleMenu。

#Usage
```java
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
```

# Screenshots
![效果图](/demo.png)

