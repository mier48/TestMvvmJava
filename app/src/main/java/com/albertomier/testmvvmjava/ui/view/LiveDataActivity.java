package com.albertomier.testmvvmjava.ui.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.albertomier.testmvvmjava.databinding.ActivityLiveDataBinding;
import com.albertomier.testmvvmjava.domain.model.User;
import com.albertomier.testmvvmjava.ui.viewmodel.LiveDataViewModel;

public class LiveDataActivity extends AppCompatActivity {

    private ActivityLiveDataBinding binding;
    private LiveDataViewModel viewModel;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLiveDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(LiveDataViewModel.class);

        setListeners();
    }

    private void setListeners() {
        binding.btSave.setOnClickListener(view -> {
            User user;
            switch (number) {
                case 0:
                    user = new User(number, "Nombre 1", "20");
                    break;
                case 1:
                    user = new User(number, "Nombre 2", "18");
                    break;
                case 2:
                    user = new User(number, "Nombre 3", "35");
                    break;
                default:
                    user = new User(number, "Nombre 99", "34");
            }
            viewModel.addUser(user);
            number++;
        });

        viewModel.getUserList().observe(this, users -> {
            String txt = "";
            for (User user : users) {
                txt += user.getName() + ", " + user.getAge() + " años\n";
            }

            binding.tvLiveData.setText(txt);
        });
    }
}