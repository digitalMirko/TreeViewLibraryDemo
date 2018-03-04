package com.digitalmirko.treeviewlibrarydemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.blox.treeview.BaseTreeAdapter;
import de.blox.treeview.TreeNode;
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

        TreeNode rootNode = new TreeNode("Root");
        TreeNode child1 = new TreeNode("Child 1");
        TreeNode child2 = new TreeNode("Child 2");
        TreeNode child3 = new TreeNode("Child 3");
        TreeNode child4 = new TreeNode("Child 4");
        TreeNode child5 = new TreeNode("Child 5");
        TreeNode child6 = new TreeNode("Child 6");
        TreeNode child7 = new TreeNode("Child 7");
        TreeNode child8 = new TreeNode("Child 8");
        TreeNode child9 = new TreeNode("Child 9");

        // Childs added to Child 2
        child1.addChild(child3);
        child1.addChild(child4);

        // Childs added to Child 2
        child2.addChild(child8);
        child2.addChild(child9);

        // Childs added to Child 4
        child4.addChild(child5);
        child4.addChild(child6);
        child4.addChild(child7);

        // Childs added to root
        rootNode.addChild(child1);
        rootNode.addChild(child2);

        adapter.setRootNode(rootNode);
    }
}
