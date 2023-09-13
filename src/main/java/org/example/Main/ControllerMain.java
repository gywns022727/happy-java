package org.example.Main;

import org.example.fw.Controller;
import org.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();

        c1.execute();
    }
}
