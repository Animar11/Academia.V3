package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hicham on 03/05/2017.
 */
@RestController
    public class Toto {
        @RequestMapping("/hi")
        public String Sayhii(){
            return "hi hiciahm";
        }
    }
