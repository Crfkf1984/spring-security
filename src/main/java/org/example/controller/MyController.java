package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String infoAllEmplee() {
        return "info";
    }

    @GetMapping("/hr_info")
    public String getInfoHR() {
        return "infoHR";
    }

    @GetMapping("/manager_info")
    public String getMenedgerInfo() {
        return "managerInfo";
    }
}
