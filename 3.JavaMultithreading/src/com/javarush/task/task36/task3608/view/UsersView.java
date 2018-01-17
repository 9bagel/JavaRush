package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.List;

public class UsersView implements View {
    private Controller controller;


    @Override
    public void refresh(ModelData modelData) {
        List<User> users = modelData.getUsers();

        System.out.println("All users:");
        for (User user : users) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");

    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
