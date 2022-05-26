package com.albertomier.testmvvmjava.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.albertomier.testmvvmjava.domain.model.User;

import java.util.ArrayList;
import java.util.List;

public class LiveDataViewModel extends ViewModel {

    private MutableLiveData<List<User>> userListLiveData;
    private List<User> userList;

    public LiveData<List<User>> getUserList() {
        if (userListLiveData == null) {
            userListLiveData = new MutableLiveData<>();
            userList = new ArrayList<>();
        }

        return userListLiveData;
    }

    public void addUser(User user) {
        userList.add(user);
        userListLiveData.setValue(userList);
    }
}
