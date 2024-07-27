package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    @GetMapping(value = "/path")
    public String getHello() {
        try {
            URL url = new URL("http://checkip.amazonaws.com/");
            BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
            String ip =br.readLine();
            return "Hello from Vikranth: "+ip+" time: "+LocalDateTime.now();
        } catch (Exception e) {
            // TODO: handle exception
            return "Error";
        }
        
    }
    
}
