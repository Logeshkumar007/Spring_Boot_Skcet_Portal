package com.day1.day1app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class day1controller {
// @RequestMapping("/helo")
// public String greet()
// {
// return "Hii and welcome to SKCET";
// }
// }


// @RestController
// @RequestMapping("/helo")
// public class day1controller{
//     @GetMapping("pavi")
//     public String greet()
//     {
//         return "helo";
//     }
// }




@RestController
public class day1controller {
@RequestMapping("/path/{name}")
public String greet(@PathVariable("name")String pass)
{
return "Hii " + pass;
}
}