package com.drakezzz.feign.demo.api.controller;

import com.drakezzz.feign.demo.api.dto.WorkerDto;
import com.drakezzz.feign.demo.entity.Worker;
import com.drakezzz.feign.demo.mapper.WorkerToWorkerDtoMapper;
import com.drakezzz.feign.demo.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/workers")
public class WorkerController {

    private final WorkerToWorkerDtoMapper workerToWorkerDtoMapper;

    private final WorkerService workerService;

    @GetMapping
    public WorkerDto getWorker() {
        Worker worker = workerService.getWorker();
        return workerToWorkerDtoMapper.map(worker);
    }

}
