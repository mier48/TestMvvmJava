package com.albertomier.testmvvmjava.ui.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.albertomier.testmvvmjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setListeners();
    }

    private void setListeners() {
        binding.btViewModel.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, ViewModelActivity.class)));

        binding.btUserViewModel.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, UserViewModelActivity.class)));

        binding.btLiveData.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, LiveDataActivity.class)));

        binding.btDataBinding.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, DataBindingActivity.class)));
    }
}