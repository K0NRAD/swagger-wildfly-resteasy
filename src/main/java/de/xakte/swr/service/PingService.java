package de.xakte.swr.service;

import javax.ejb.Stateless;

@Stateless
public class PingService {

    public String echo(String message) {
        return message;
    }

    public String reverse(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
