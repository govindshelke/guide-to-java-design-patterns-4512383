package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  
  private static final Map<String, Supplier<UserInterfaceFactory>> factoryMap
  = new HashMap<>();
  
  static{
    factoryMap.put("RED", RedUserInterfaceFactory::new);
    factoryMap.put("BLUE",BlueUserInterfaceFactory::new);
    factoryMap.put("BLACK", BlackUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory getUserInterfaceFactory(String color){
    Supplier<UserInterfaceFactory> supplier = factoryMap.get(color);
    if(supplier != null){
      return supplier.get();
    }else{
      throw new IllegalArgumentException("Color not supported.");
    }
  }
}
