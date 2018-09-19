package com.example.dell.dressing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class DressSelect extends AppCompatActivity {

    private List<Dress> dressList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_select);
        final Intent intent = getIntent();
        initDress();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        DressAdapter adapter = new DressAdapter(dressList);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new DressAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(View view, int position) {
                Intent intent1 = new Intent(DressSelect.this, ModelDispaly.class);
                intent1.putExtras(intent.getExtras());
                intent1.putExtra("position", String.valueOf(position));
                startActivity(intent1);
            }
        });
    }

    private void initDress() {
//        for (int i = 0; i <20; i ++) {
//            Dress xianyu = new Dress("Salty Fish", R.drawable.xianyu_pic);
//            dressList.add(xianyu);
//        }
        Dress zero = new Dress("first", R.drawable.zero);
        dressList.add(zero);
        Dress one = new Dress("second", R.drawable.one);
        dressList.add(one);
    }

}
