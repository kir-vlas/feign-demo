package com.drakezzz.feign.server.api.controller;

import com.drakezzz.feign.server.api.dto.Worker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/internal/v1/workers")
public class WorkerController {

    @Value("${worker.name}")
    private String workerName;

    @GetMapping
    public Worker getGuestClient() {
        Worker worker = new Worker();
        worker.setName(workerName);
        worker.setOccupation("Farmer");
        return worker;
    }

}
