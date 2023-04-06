package org.example.implementations;

import org.example.enums.CarType;
import org.example.interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class BrackService implements IService {
    private CarType carType;

    private Map<CarType,Integer> CarTypePrices=new HashMap<>();
    public BrackService(CarType carType){
        this.carType=carType;
        CarTypePrices.put(CarType.SEDAN,4000);
        CarTypePrices.put(CarType.HATCHBACK,2000);
        CarTypePrices.put(CarType.SUV,5000);
    }
    @Override
    public int getPrice() {
        return CarTypePrices.get(this.carType);
    }
}
