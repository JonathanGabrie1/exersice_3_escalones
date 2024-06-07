package com.example.ejercicio_3_escalones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;
public class HelloApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the steps: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= Math.abs(number); i++) {
                for (int j = 1; j <= Math.abs(number)-i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }



        } else if (number < 0 ) {
            for (int i = 1; i <= Math.abs(number); i++){
                for (int j = 1; j < i+1; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }

        } else if (number == 0 ) {
            System.out.println("__");
        }
    }
}

