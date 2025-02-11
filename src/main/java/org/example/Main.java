package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Get URL input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter URL: ");
            String url = reader.readLine();

            // Instantiate the controller and start the download process
            ImgDownloaderController controller = new ImgDownloaderController();
            controller.start(url);

        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}