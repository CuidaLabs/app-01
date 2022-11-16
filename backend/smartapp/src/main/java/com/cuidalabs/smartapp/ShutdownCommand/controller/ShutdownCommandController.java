package com.cuidalabs.smartapp.ShutdownCommand.controller;

import com.cuidalabs.smartapp.ShutdownCommand.model.ShutdownCommand;
import com.cuidalabs.smartapp.ShutdownCommand.service.ShutdownCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// /shutdown-commands/shutdown/12:34:12:34:45:56
@RestController
@RequestMapping("/shutdown-commands")
public class ShutdownCommandController {

    @Autowired
    private ShutdownCommandService shutdownCommandService;

    @PostMapping("/shutdown/{mac}")
    public void shutdownPC(@PathVariable String mac) {
        ShutdownCommand shutdownCommand = new ShutdownCommand();
        shutdownCommand.setMac(mac);

        shutdownCommandService.createCommand(shutdownCommand);

    }
}
