package com.nour.mvvm.data

class Repository {
    val fakeData = FakeData()

        fun getRandomNote():String= fakeData.randomNote

}