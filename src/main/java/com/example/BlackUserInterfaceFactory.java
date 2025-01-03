package com.example;

public class BlackUserInterfaceFactory implements UserInterfaceFactory{

  @Override
  public Button createButton() {
    return new BlackButton();
  }

  @Override
  public ScrollBar createScrollBar() {
   return new BlackScrollBar();
  }

}
