package com.drakezzz.feign.demo.service.impl;

import com.drakezzz.feign.demo.entity.Worker;
import com.drakezzz.feign.demo.feign.client.WorkerFeignClient;
import com.drakezzz.feign.demo.feign.dto.WorkerFeignDto;
import com.drakezzz.feign.demo.mapper.WorkerFeignDtoToWorkerMapper;
import com.drakezzz.feign.demo.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerFeignDtoToWorkerMapper workerFeignDtoToWorkerMapper;

    private final WorkerFeignClient workerFeignClient;

    @Override
    public Worker getWorker() {
        WorkerFeignDto workerFeignDto = workerFeignClient.getWorker();
        return workerFeignDtoToWorkerMapper.map(workerFeignDto);
    }

}
