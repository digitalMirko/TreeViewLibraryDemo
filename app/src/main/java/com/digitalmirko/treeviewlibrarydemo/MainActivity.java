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
        TreeNode child3 = new TreeNode("C_3");
        TreeNode child4 = new TreeNode("Child 4");
        TreeNode child5 = new TreeNode("C_5");
        TreeNode child6 = new TreeNode("C_6");
        TreeNode child7 = new TreeNode("C_7");
        TreeNode child8 = new TreeNode("C_8");
        TreeNode child9 = new TreeNode("Child 9");
        TreeNode child10 = new TreeNode("Child 10");
        TreeNode child11 = new TreeNode("C_11");
        TreeNode child12 = new TreeNode("C_12");
        TreeNode child13 = new TreeNode("C_13");
        TreeNode child14 = new TreeNode("C_14");

        // Childs added to root
        rootNode.addChild(child1);
        rootNode.addChild(child2);

        // Childs 3 & 4 added to Child 1
        child1.addChild(child3);
        child1.addChild(child4);

        // Childs 5 & 6 added to Child 2
        child2.addChild(child5);
        child2.addChild(child6);

        // Childs 7, 8 & 9 added to Child 4
        child4.addChild(child7);
        child4.addChild(child8);
        child4.addChild(child9);

        // Childs 10 & 11 added to Child 9
        child9.addChild(child10);
        child9.addChild(child11);

        // Childs 12, 13 & 14 added to Child 10
        child10.addChild(child12);
        child10.addChild(child13);
        child10.addChild(child14);

        adapter.setRootNode(rootNode);
    }
}
