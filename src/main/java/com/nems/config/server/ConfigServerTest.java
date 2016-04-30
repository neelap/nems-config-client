package com.nems.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NE281900 on 4/27/2016.
 */
@RestController
public class ConfigServerTest {
    @Value("${server.port}") String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }
}
