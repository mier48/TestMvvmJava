package com.albertomier.testmvvmjava.ui.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class ViewModelBindingAdapter {

    @BindingAdapter("visibility")
    public static void setVisibility(View view, boolean visibility) {
        view.setVisibility(visibility ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter({"visibility", "size"})
    public static void setSize(TextView textView, boolean visibility, float size) {
        textView.setVisibility(visibility ? View.VISIBLE : View.GONE);
        textView.setTextSize(size);
    }
}
