package com.pysun.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.pysun.design.widget.navigation.PsNavigationView;
import com.pysun.design.widget.navigation.PsTabMenuData;
import com.pysun.design.widget.navigation.PsTabMenuView;

/**
 * Created by ljh on 2018/1/16.
 */

public class NavigationActivity extends AppCompatActivity {


    private final static String TAG = NavigationActivity.class.getSimpleName();
    PsNavigationView psNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        psNavigationView = findViewById(R.id.ps_nv);
        final PsTabMenuData[] tabMenuData = new PsTabMenuData[3];
        PsTabMenuData tabMenuData1 = new PsTabMenuData(getResources().getDrawable(R.drawable.sel_warn_tab), "首页");
        PsTabMenuData tabMenuData2 = new PsTabMenuData(getResources().getDrawable(R.drawable.sel_warn_tab), "看客");
        PsTabMenuData tabMenuData3 = new PsTabMenuData(getResources().getDrawable(R.drawable.sel_warn_tab), "个人");

        tabMenuData[0] = tabMenuData1;
        tabMenuData[1] = tabMenuData2;
        tabMenuData[2] = tabMenuData3;
        psNavigationView.setMenuDatas(tabMenuData);
        psNavigationView.buildMenuView();

        psNavigationView.showNotify(0, 1 + "");
        psNavigationView.setNavigationTabSelectedListener(new PsNavigationView.NavigationTabSelectedListener() {
            @Override
            public void onTabSelected(PsTabMenuView tabMenuView) {
                Log.d(TAG, "onTabSelected" + tabMenuView.getItemPosition());

                Toast.makeText(NavigationActivity.this, "onTabSelected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabReSelected(PsTabMenuView tabMenuView) {
                Log.d(TAG, "onTabSelected" + tabMenuView.getItemPosition());
                Toast.makeText(NavigationActivity.this, "onTabSelected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
