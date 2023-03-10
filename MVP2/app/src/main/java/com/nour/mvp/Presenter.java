package com.nour.mvp;

import com.nour.mvp.data.FakeData;


public class Presenter {
    private ViewInterface presenter;

    private FakeData fakeData = new FakeData();

    public Presenter(ViewInterface presenter) {
        this.presenter = presenter;
    }

    public void getNote(){
        presenter.getNote (fakeData.getRandomNote ());
    }
}
