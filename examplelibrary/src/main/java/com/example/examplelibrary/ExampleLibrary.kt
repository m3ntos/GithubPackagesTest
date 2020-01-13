package com.example.examplelibrary

import android.content.Context
import com.dvoiss.literallytoast.LitToast

fun add(a: Int, b: Int): Int {
    return a + b
}

fun showRealToast(context: Context, text: String) {
    LitToast.create(context, text, 1000)
        .setPlayToasterSound(true)
        .show()
}
