package org.example.implementations;

import org.example.enums.CarType;
import org.example.interfaces.IService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ServiceProvider {

    private CarType carType;
    private List<IService> services=new ArrayList<>();
    public ServiceProvider(CarType carType, List<String> services) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.carType=carType;
        for(String serviceName: services){
            Class<?> clazz= Class.forName(serviceName);
            Constructor<?> cons=clazz.getConstructor(CarType.class);
            IService iService=(IService) cons.newInstance(carType);
            this.services.add(iService);
        }
    }

    public float getTotalPrice(){
        float totalPrice=0.0f;
        for(IService service: services){
            totalPrice+=service.getPrice();
        }
        return totalPrice;
    }


    public String Bill(){
        List<String> list=new ArrayList<>();
        for(IService service: services){
            String s=" charge for "+service.getClass().toString().substring(34)+" is "+service.getPrice();
                    list.add(s);
        }
        if(getTotalPrice()>10000){
           list.add("Free Complementary Cleaning");
        }
        return list.toString()+"\n"+"total price "+getTotalPrice();
    }

}
