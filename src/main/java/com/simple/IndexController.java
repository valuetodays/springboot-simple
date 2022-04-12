package com.simple;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author lei.liu
 * @since 2020-07-15 14:50
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String hostName() throws UnknownHostException {
        int a = 111;
        int b = 222;
        int c = a + b;
        return InetAddress.getLocalHost().getHostName() + "/" + (c);
    }
}

