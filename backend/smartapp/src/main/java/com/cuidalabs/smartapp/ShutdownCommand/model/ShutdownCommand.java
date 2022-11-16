package com.cuidalabs.smartapp.ShutdownCommand.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ShutdownCommand {
    private String mac;
    private LocalDateTime data;
}
