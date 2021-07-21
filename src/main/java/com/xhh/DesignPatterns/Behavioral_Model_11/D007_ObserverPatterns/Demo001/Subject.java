package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo001;


import java.util.ArrayList;
import java.util.List;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers(Message message);
}






