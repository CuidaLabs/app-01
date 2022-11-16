package com.cuidalabs.smartapp.ShutdownCommand.service;

import com.cuidalabs.smartapp.ShutdownCommand.model.ShutdownCommand;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ShutdownCommandService {
    public void createCommand(ShutdownCommand command) {
        command.setData(LocalDateTime.now());
        // salvar no banco
        this.executeCommand(command);
    }

    private void executeCommand(ShutdownCommand command) {

    }
}
