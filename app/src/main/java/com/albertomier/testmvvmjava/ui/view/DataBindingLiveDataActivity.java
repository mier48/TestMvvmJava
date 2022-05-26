package com.albertomier.testmvvmjava.ui.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.albertomier.testmvvmjava.R;
import com.albertomier.testmvvmjava.databinding.ActivityDataBindingLiveDataBinding;
import com.albertomier.testmvvmjava.domain.model.User;
import com.albertomier.testmvvmjava.ui.viewmodel.DataBindingLiveDataViewModel;

public class DataBindingLiveDataActivity extends AppCompatActivity {

    private ActivityDataBindingLiveDataBinding binding;
    private DataBindingLiveDataViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_live_data);
        viewModel = new ViewModelProvider(this).get(DataBindingLiveDataViewModel.class);

        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);

        User user = new User(1, "Nombre 2", "32");
        viewModel.setUser(user);
    }
}