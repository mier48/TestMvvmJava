package com.albertomier.testmvvmjava.ui.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.albertomier.testmvvmjava.databinding.ActivityViewModelBinding;
import com.albertomier.testmvvmjava.ui.viewmodel.AddViewModel;
import com.albertomier.testmvvmjava.core.MathOperations;

public class ViewModelActivity extends AppCompatActivity {

    private ActivityViewModelBinding binding;
    private AddViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewModelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(AddViewModel.class);

        binding.btSumar.setOnClickListener(view -> {
            viewModel.setResult(MathOperations.add(viewModel.getResult()));
            binding.tvSumar.setText(String.valueOf(viewModel.getResult()));
        });
    }
}