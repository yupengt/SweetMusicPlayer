//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.huwei.sweetmusicplayer.ui.adapters;

import android.content.Context;

public final class AlbumAdapter_
    extends AlbumAdapter
{

    private Context context_;

    private AlbumAdapter_(Context context) {
        context_ = context;
        init_();
    }

    public static AlbumAdapter_ getInstance_(Context context) {
        return new AlbumAdapter_(context);
    }

    private void init_() {
        context = context_;
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

}