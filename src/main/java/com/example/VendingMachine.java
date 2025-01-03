package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {
    private static Map<String, Supplier<Snack>> snackMap = new HashMap();

    static{
        snackMap.put("ChocolateBar", ()->new ChocolateBar());
        snackMap.put("Chips", ()->new Chips());
        snackMap.put("Drink", ()-> new Drink());
    }
    
    Snack getSnack(String snackType) {
        Supplier<Snack> objSupplier = snackMap.getOrDefault(snackType, null);
        if(objSupplier != null){
            return objSupplier.get();
        }else{
            throw new IllegalArgumentException("Invalid Snack type.");
        }
    }


}
