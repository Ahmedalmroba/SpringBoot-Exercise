package com.example.springboot_ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


@GetMapping("/name")
public String getName() {
    return "ahmed mohmmed almroba";
}
    @GetMapping("/age")
    public String getage() {
        return "25";
    }
    @GetMapping("/check/status")
        public String getstaats(){
            return "Evrything ok";



}
    @GetMapping("/health")
    public String getHealth() {
        return "Server health is up and running";
    }



@GetMapping("/names")
public String[] getNames() {
    String[] names = {"ahmed", "mohammed", "almroba"};
    return names;


}
}



