package com.albertomier.testmvvmjava.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.albertomier.testmvvmjava.databinding.ActivityUserViewModelBinding;
import com.albertomier.testmvvmjava.databinding.ActivityViewModelBinding;
import com.albertomier.testmvvmjava.domain.model.User;
import com.albertomier.testmvvmjava.ui.viewmodel.AddViewModel;
import com.albertomier.testmvvmjava.ui.viewmodel.UserViewModel;

import java.util.List;

public class UserViewModelActivity extends AppCompatActivity {

    private ActivityUserViewModelBinding binding;
    private UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserViewModelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(UserViewModel.class);

        setListeners();
    }

    private void setListeners() {
        binding.btSalvar.setOnClickListener(view -> {
            User user = new User();
            user.setId(1);
            user.setName(binding.etNombre.getText().toString());
            user.setAge(binding.etEdad.getText().toString());

            viewModel.addUser(user);
        });

        binding.btVer.setOnClickListener(view -> {
            String txt = "";
            for (User user : viewModel.getUserList()) {
                txt += user.getName() + ", " + user.getAge() + " años\n";
            }

            binding.tvUser.setText(txt);
        });
    }
}