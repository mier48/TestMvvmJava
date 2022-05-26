package com.albertomier.testmvvmjava.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.albertomier.testmvvmjava.R;
import com.albertomier.testmvvmjava.databinding.ActivityDataBindingBinding;
import com.albertomier.testmvvmjava.databinding.ActivityMainBinding;
import com.albertomier.testmvvmjava.domain.model.User;

public class DataBindingActivity extends AppCompatActivity {

    private ActivityDataBindingBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        user = new User(1, "Nombre 1", "24");

        binding.setUser(user);
    }
}