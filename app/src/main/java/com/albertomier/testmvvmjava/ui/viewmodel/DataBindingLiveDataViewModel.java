package com.albertomier.testmvvmjava.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.albertomier.testmvvmjava.domain.model.User;

public class DataBindingLiveDataViewModel extends ViewModel {

    private MutableLiveData<User> user;

    public DataBindingLiveDataViewModel() {
        user = new MutableLiveData<>();
    }

    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public void updateUser() {
        User user = new User(1, "Nombre 1", "43");
        this.user.setValue(user);
    }
}
