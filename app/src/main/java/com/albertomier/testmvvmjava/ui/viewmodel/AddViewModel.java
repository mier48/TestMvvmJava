package com.albertomier.testmvvmjava.ui.viewmodel;

import androidx.lifecycle.ViewModel;

public class AddViewModel extends ViewModel {

    private int result = 0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
