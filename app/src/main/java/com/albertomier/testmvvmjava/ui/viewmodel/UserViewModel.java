package com.albertomier.testmvvmjava.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.albertomier.testmvvmjava.domain.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel extends ViewModel {

    private List<User> userList;

    public UserViewModel() {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
