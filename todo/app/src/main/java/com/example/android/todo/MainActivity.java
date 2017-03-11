package com.example.android.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<PostRequirementDetail> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();

        PostAdapter adapter = new PostAdapter(this,list);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewTasks);
        RecyclerView.LayoutManager manager =new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        adds();
    }

    private void adds() {
    list.add(new PostRequirementDetail("A+","3","Urgent","Pakistan","Sindh","karachi","indus","friend","123456","call"));
    list.add(new PostRequirementDetail("A+","3","Urgent","Pakistan","Sindh","karachi","indus","friend","123456","call"));
        list.add(new PostRequirementDetail("A+","3","Urgent","Pakistan","Sindh","karachi","indus","friend","123456","call"));
        list.add(new PostRequirementDetail("A+","3","Urgent","Pakistan","Sindh","karachi","indus","friend","123456","call"));

        list.add(new PostRequirementDetail("A+","3","Urgent","Pakistan","Sindh","karachi","indus","friend","123456","call"));

    }
}
