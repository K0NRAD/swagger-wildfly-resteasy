package de.xakte.swr.control;

import de.xakte.swr.service.PingService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PingControl {

    @Inject
    private PingService pingService;

    public String echo( String message ) {
        return pingService.echo(message);
    }

    public String reverse( String message ) {
        return pingService.reverse(message);
    }
}
