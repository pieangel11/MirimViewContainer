package com.example.mirimviewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest2 extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_test2);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecPuppy = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecPuppy.setContent(R.id.linear_puppy);
        tabHost.addTab(tabSpecPuppy);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.linear_cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.linear_rabbit);
        tabHost.addTab(tabSpecRabbit);
        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("Horse").setIndicator("말");
        tabSpecHorse.setContent(R.id.linear_horse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}