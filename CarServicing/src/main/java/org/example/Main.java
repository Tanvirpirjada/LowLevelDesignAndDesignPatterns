package org.example;

import org.example.enums.CarType;
import org.example.implementations.GeneralServices;
import org.example.implementations.ServiceProvider;
import org.example.interfaces.IService;

import javax.swing.text.DefaultEditorKit;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

//        IService service=new GeneralServices(CarType.SEDAN); we dont have to create object in main class
//        List<IService> serviceList=new ArrayList<>();
//        serviceList.add(service);

        List<String> serviceList=new ArrayList<>();
        serviceList.add("org.example.implementations.GeneralServices");
        serviceList.add("org.example.implementations.BrackService");
        serviceList.add("org.example.implementations.EngineService");
        ServiceProvider serviceProvider=new ServiceProvider(CarType.SEDAN,serviceList);

       // System.out.println(serviceProvider.getTotalPrice());
        System.out.println(serviceProvider.Bill());

    }
}