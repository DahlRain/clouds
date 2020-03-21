package com.dahl.myapp;

import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static android.view.View.OnClickListener;
import static android.view.View.inflate;

public class MainActivity extends AppCompatActivity {
    private LinearLayout dialog_layLinearLayout;
    private LinearLayout dialog_xz;
    private LinearLayout gxll;
    private LinearLayout dialog_jk;
    private LinearLayout ggll;
    private List<Fruit> fruitList = new ArrayList<>();
    SnakeBar toast = new SnakeBar();
    private BottomSheetDialog mBottomSheetDialog;
    private int yes;
    private String nrr;
    private String lj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String jc = tool.readw("/sdcard/Dahl/yss/jk.log");
                if (jc.indexOf("1") != -1) {
                    showDialog1(view);
                    fruitList.clear();
                } else {
                }
            }

        });
        try {
        } catch (Exception e) {
            tool.print("程序出现异常：" + e.toString(), getBaseContext());
        }
        try {
            String xiaoheng5 = HtmlService.getHtml("url");
            String heng1 = "判断版本〈";
            String heng2 = "〉判断版本";
            String heng3 = "更新内容【";
            String heng4 = "】更新内容";
            String heng5 = "下载链接〔";
            String heng6 = "〕下载链接";
            String g1 = "公告〔";
            String g2 = "〕公告";
            String g3 = "gg〔";
            String g4 = "〕gg";
            String xiaoheng6 = xiaoheng5.substring(xiaoheng5.indexOf(heng1), xiaoheng5.indexOf(heng2));
            final String xiaoheng7 = xiaoheng6.replace(heng1, "");
            String gg1 = xiaoheng5.substring(xiaoheng5.indexOf(g1), xiaoheng5.indexOf(g2));
            final String gg2 = gg1.replace(g1, "");
            String gg3 = xiaoheng5.substring(xiaoheng5.indexOf(g3), xiaoheng5.indexOf(g4));
            final String gg4 = gg3.replace(g3, "");
            String xiaoheng8 = xiaoheng5.substring(xiaoheng5.indexOf(heng3), xiaoheng5.indexOf(heng4));
            final String xiaoheng9 = xiaoheng8.replace(heng3, "");
            String xiaoheng10 = xiaoheng5.substring(xiaoheng5.indexOf(heng5), xiaoheng5.indexOf(heng6));
            final String xiaoheng11 = xiaoheng10.replace(heng5, "");
            int xiao = Integer.valueOf(xiaoheng7).intValue();
            ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData mClipData = ClipData.newPlainText("Label", xiaoheng7);
            cm.setPrimaryClip(mClipData);
            if (gg4.indexOf("on") != -1) {
                showDialog4(fab, gg2);
            } else {
            }
            if (xiao == 2) {
            } else {
                showDialog3(fab, xiaoheng9, xiaoheng11);
            }
        } catch (Exception e) {
            tool.print("程序出现异常：" + e.toString(), getBaseContext());
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                boolean uu = isSlideToBottom(recyclerView);
                if (uu == true) {
                    FloatingActionButton fab = findViewById(R.id.fab);
                    try {
                        yes = yes + 1;
                        String url = "http://baidu.com";
                        String b = HtmlService.getHtml(url);
                        String c[] = b.split("\\[");
                        for (int i = 0; i < c.length; i++) {
                            String n = c[i];
                            if (n.indexOf("apk") != -1) {
                                int size = n.indexOf("'");
                                int se = n.indexOf("',");
                                String pp = qwbzj(n, size, se);
                                String shang = pp + "',";
                                String ns = n.replace(shang, "");
                                int nsize = ns.indexOf("'");
                                int nse = ns.indexOf("',");
                                String ppp = qwbzj(ns, nsize, nse);
                                String sss = ppp + ",";
                                String nss = ns.replace(sss, "");
                                int nssize = nss.indexOf("'");
                                int nsse = nss.indexOf("',");
                                String ers = qwbzj(nss, nssize, nsse);
                                String dd = ers.replace("'", "");
                                String dax = dd.replace("',", "");
                                String daxia = dax.replace(",", "");
                                String daxiao = daxia.replace(" ", "");
                                String lianj = ppp.replace("'", "");
                                String nsss = nss.replace(ers, "");
                                int nsssize = nsss.indexOf("'");
                                int nssse = nsss.indexOf("',");
                                String sj = qwbzj(nsss, nsssize, nssse);
                                String ss = sj.replace("'", "");
                                String shij = ss.replace("',", "");
                                String shijian = shij.replace(",", "");
                                String newstr = pp.replace(".apk", "");
                                String newst = newstr.replace("'", "");
                                String er = "大小：" + daxiao + "  " + "时间：" + shijian;
                                Fruit ape = new Fruit(newst, er, lianj);
                                fruitList.add(ape);
                                adapter.notifyDataSetChanged();
                            }
                        }
                    } catch (Exception e) {
                        tool.print("程序出现异常：" + e.toString(), getBaseContext());
                    }
                } else {
                }
            }
        });
        recyclerView.addOnItemTouchListener(new RecycleViewClickListener(
                MainActivity.this,
                recyclerView,
                new RecycleViewClickListener.OnItem2ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        TextView lji = view.findViewById(R.id.lj);
                        lj = lji.getText().toString();
                        showDialog2(view);
                    }
                    @Override
                    public void onItemLongClick(View view, int position) {
                        TextView llj = view.findViewById(R.id.lj);
                        String lianjie = llj.getText().toString();
                        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData mClipData = ClipData.newPlainText("Label", lianjie);
                        cm.setPrimaryClip(mClipData);
                        FloatingActionButton fab = findViewById(R.id.fab);
                        toast.SnakeBar("已复制下载链接", fab, fab, null, null);
                    }
                }
        ));
    }
    public void showDialog1(View view) {
        mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View inflate = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.dialog_lay, null);
        final View dialog_layout = inflate(MainActivity.this, R.layout.dialog_lay, null);
        final TextInputEditText edit1 = dialog_layout.findViewById(R.id.edit1);
        Button ss = dialog_layout.findViewById(R.id.ss);
        dialog_layLinearLayout = dialog_layout.findViewById(R.id.dialog_layLinearLayout);
        CircleButton(dialog_layLinearLayout, 0xffffffff, 40);
        ss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                nrr = edit1.getText().toString();
                mBottomSheetDialog.dismiss();
                try {
                    yes = 1;
                    fruitList.clear();
                    String url = "http://baidu.com";
                    String b = HtmlService.getHtml(url);
                    String c[] = b.split("\\[");
                    for (int i = 0; i < c.length; i++) {
                        String n = c[i];
                        if (n.indexOf("[") != -1) {
                        } else {
                            if (n.indexOf("apk") != -1) {
                                int size = n.indexOf("'");
                                int se = n.indexOf("',");
                                String pp = qwbzj(n, size, se);
                                String shang = pp + "',";
                                String ns = n.replace(shang, "");
                                int nsize = ns.indexOf("'");
                                int nse = ns.indexOf("',");
                                String ppp = qwbzj(ns, nsize, nse);
                                String sss = ppp + ",";
                                String nss = ns.replace(sss, "");
                                int nssize = nss.indexOf("'");
                                int nsse = nss.indexOf("',");
                                String ers = qwbzj(nss, nssize, nsse);
                                String dd = ers.replace("'", "");
                                String dax = dd.replace("',", "");
                                String daxia = dax.replace(",", "");
                                String daxiao = daxia.replace(" ", "");
                                String lianj = ppp.replace("'", "");
                                String nsss = nss.replace(ers, "");
                                int nsssize = nsss.indexOf("'");
                                int nssse = nsss.indexOf("',");
                                String sj = qwbzj(nsss, nsssize, nssse);
                                String ss = sj.replace("'", "");
                                String shij = ss.replace("',", "");
                                String shijian = shij.replace(",", "");
                                String newstr = pp.replace(".apk", "");
                                String newst = newstr.replace("'", "");
                                String er = "大小：" + daxiao + "  " + "时间：" + shijian;
                                Fruit ape = new Fruit(newst, er, lianj);
                                fruitList.add(ape);
                            }
                        }
                    }
                    FloatingActionButton fab = findViewById(R.id.fab);
                } catch (Exception e) {
                    tool.print("程序出现异常：" + e.toString(), getBaseContext());
                }
            }
        });
        mBottomSheetDialog.setContentView(dialog_layout);
        mBottomSheetDialog.show();
        mBottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet)
                .setBackgroundResource(0x00000000);
    }
    public void showDialog2(View view) {
        mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View inflate = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.dialogdown, null);
        final View dialoglayout = inflate(MainActivity.this, R.layout.dialogdown, null);
        final Button lqxz = dialoglayout.findViewById(R.id.llqxz);
        Button xtxz = dialoglayout.findViewById(R.id.xtxz);
        dialog_xz = dialoglayout.findViewById(R.id.dialog_xz);
        CircleButton(dialog_xz, 0xffffffff, 40);
        lqxz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse(lj);
                intent.setData(content_url);
                startActivity(intent);
                mBottomSheetDialog.dismiss();
            }
        });
        xtxz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                toast.SnakeBar("暂未开放", fb, fb, null, null);
                mBottomSheetDialog.dismiss();
            }
        });
        mBottomSheetDialog.setContentView(dialoglayout);
        mBottomSheetDialog.show();
    }
    public void showDialog3(View view, String gxnrr, String gxlj) {
        mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View inflate = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.gxdia, null);
        final View gxlayout = inflate(MainActivity.this, R.layout.gxdia, null);
        final Button gxn = gxlayout.findViewById(R.id.gx);
        final TextView gxnr = gxlayout.findViewById(R.id.gxnr);
        final String hkk = gxlj;
        gxnr.setText(gxnrr);
        gxll = gxlayout.findViewById(R.id.gxll);
        CircleButton(gxll, 0xffffffff, 40);
        gxn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse(hkk);
                intent.setData(content_url);
                startActivity(intent);
                mBottomSheetDialog.dismiss();
            }
        });
        mBottomSheetDialog.setContentView(gxlayout);
        mBottomSheetDialog.show();
    }
    public void showDialog4(View view, String ggnr) {
        mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View inflate = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.gxdia, null);
        final View gglayout = inflate(MainActivity.this, R.layout.gg, null);
        final Button zdl = gglayout.findViewById(R.id.zdl);
        final TextView gggnr = gglayout.findViewById(R.id.ggnr);
        gggnr.setText(ggnr);
        ggll = gglayout.findViewById(R.id.ggll);
        CircleButton(ggll, 0xffffffff, 40);
        zdl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                mBottomSheetDialog.dismiss();
            }
        });
        mBottomSheetDialog.setContentView(gglayout);
        mBottomSheetDialog.show();
    }
    public void xzjktc(View view) {
        mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View inflate = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.xzjk, null);
        final View jklayout = inflate(MainActivity.this, R.layout.xzjk, null);
        final Button jk1 = jklayout.findViewById(R.id.jk1);
        final Button jk2 = jklayout.findViewById(R.id.jk2);
        final Button jk3 = jklayout.findViewById(R.id.jk3);
        dialog_jk = jklayout.findViewById(R.id.dialog_jk);
        CircleButton(dialog_jk, 0xffffffff, 40);
        jk1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                try {
                    tool.writeExternal("/sdcard/Dahl/yss/jk.log", "1");
                } catch (IOException e) {
                    tool.print("程序出现异常：" + e.toString(), getBaseContext());
                }
                toast.SnakeBar("已切换为接口1", fb, fb, null, null);
                mBottomSheetDialog.dismiss();
            }
        });
        jk2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                try {
                    tool.writeExternal("/sdcard/Dahl/yss/jk.log", "2");
                } catch (IOException e) {
                    tool.print("程序出现异常：" + e.toString(), getBaseContext());
                }
                toast.SnakeBar("已切换为接口2", fb, fb, null, null);
                mBottomSheetDialog.dismiss();
            }
        });
        jk3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatingActionButton fb = findViewById(R.id.fab);
                toast.SnakeBar("暂未开放", fb, fb, null, null);
                mBottomSheetDialog.dismiss();
            }
        });
        mBottomSheetDialog.setContentView(jklayout);
        mBottomSheetDialog.show();
    }
    public static boolean isSlideToBottom(RecyclerView recyclerView) {
        if (recyclerView == null) return false;
        if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()
                >= recyclerView.computeVerticalScrollRange())
            return true;
        return false;
    }
    public void CircleButton(View view, int InsideColor, int radiu) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setColor(InsideColor);
        drawable.setCornerRadii(new float[]{radiu, radiu, radiu, radiu, 0, 0, 0, 0});
        view.setBackgroundDrawable(drawable);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_abouts) {
            View vew = findViewById(R.id.fab);
            new MaterialAlertDialogBuilder(MainActivity.this)
                    // new MaterialAlertDialogBuilder(MainActivity.this,R.style.ThemeOverlay_Crane)
                    .setTitle("关于")
                    .setMessage("\nDahl开发\n\n接口来自聚应用")
                    .setPositiveButton("OK", null)
                    .show();
        }
        if (id == R.id.action_settings) {
            View vew = findViewById(R.id.fab);
            toast.SnakeBar("暂未开放", vew, vew, null, null);
        }
        if (id == R.id.action_jks) {
            View vew = findViewById(R.id.fab);
            xzjktc(vew);
        }
        return super.onOptionsItemSelected(item);
    }
    public static String qwbzj(String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        if ("".equals(str2) || i3 < 0 || i4 <= 0 || i3 > str2.length()) {
            return "";
        }
        int i5 = i3 + i4;
        if (i5 > str2.length()) {
            i5 = str2.length();
        }
        return str2.substring(i3, i5);
    }
}


