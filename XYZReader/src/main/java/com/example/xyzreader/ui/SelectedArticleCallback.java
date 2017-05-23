package com.example.xyzreader.ui;

import android.net.Uri;
import android.view.View;

/**
 * Created by David on 5/15/17.
 */

public interface SelectedArticleCallback {

    void onSelectedArticle(Uri uri, long selectedArticle, View photo);
}
