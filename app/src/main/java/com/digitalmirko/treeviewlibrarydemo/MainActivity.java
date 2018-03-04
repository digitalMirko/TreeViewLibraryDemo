package com.digitalmirko.treeviewlibrarydemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.blox.treeview.BaseTreeAdapter;
import de.blox.treeview.TreeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TreeView treeView = findViewById(R.id.treeview);

        BaseTreeAdapter adapter = new BaseTreeAdapter<ViewHolder>(this, R.layout.node) {
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(View view) {
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(ViewHolder viewHolder, Object data, int position) {
                viewHolder.mTextView.setText(data.toString());
            }
        };
        treeView.setAdapter(adapter);


    }
}
