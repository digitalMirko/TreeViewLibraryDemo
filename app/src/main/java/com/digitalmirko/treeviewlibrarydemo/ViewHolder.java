package com.digitalmirko.treeviewlibrarydemo;

import android.view.View;
import android.widget.TextView;

public class ViewHolder {

        TextView mTextView;

        ViewHolder(View view) {
            mTextView = view.findViewById(R.id.textView);
        }
}
