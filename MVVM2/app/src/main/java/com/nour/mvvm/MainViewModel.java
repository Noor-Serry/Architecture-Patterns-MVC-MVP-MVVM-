package com.nour.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nour.mvvm.data.Repository;

public class MainViewModel extends ViewModel{

    private Repository repository = new Repository ();
    public   MutableLiveData<String> note = new MutableLiveData<>();

    public void getNote(){
      note.postValue ( repository.getRandomNote () );
    }
}
