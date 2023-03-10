package com.nour.mvc.data;

import java.util.Random;

public class FakeData {
    private String []Note  = {"note1", "note2", "note3", "note4","note5", "note6", "note7", "note8", "note9", "note10"};

   public String getRandomNote() {
       int randomIndex = new Random ().nextInt(10);
       return Note[randomIndex];
   }

}
