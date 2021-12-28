package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Animation animation;
    String[] title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        listView = findViewById(R.id.list_view);
        title=getResources().getStringArray(R.array.title);

        MainAdapter adpater = new MainAdapter(MainActivity.this,title);
        animation = AnimationUtils.loadAnimation(this, R.anim.animation1);
        listView.setAdapter(adpater);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ""+title[i], Toast.LENGTH_SHORT).show();
            }
        });

    }

}