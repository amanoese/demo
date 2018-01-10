package com.example.demo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class DemoControler {

  @RequestMapping("/")
  public String home(Model model) {
    model.addAttribute("msg","sample messege!");
    return "index";
  }
}
