package com.albertomier.testmvvmjava.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.albertomier.testmvvmjava.domain.model.User;

public class DataBindingLiveDataViewModel extends ViewModel {

    private MutableLiveData<User> user;
    private MutableLiveData<Boolean> visibility;
    private MutableLiveData<Float> size;

    public DataBindingLiveDataViewModel() {
        user = new MutableLiveData<>();

        visibility = new MutableLiveData<>();
        visibility.setValue(true);

        size = new MutableLiveData<>();
        size.setValue(16f);
    }

    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public MutableLiveData<Boolean> getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility.setValue(visibility);
    }

    public MutableLiveData<Float> getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size.setValue(size);
    }

    public void updateUser() {
        User user = new User(1, "Nombre 1", "43");
        this.user.setValue(user);
    }

    public void changeVisibility() {
        if (visibility.getValue()) {
            visibility.setValue(false);
        } else {
            visibility.setValue(true);
        }
        size.setValue(size.getValue() + 5f);
    }
}
