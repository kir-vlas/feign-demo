package com.drakezzz.feign.demo.feign.client;

import com.drakezzz.feign.demo.feign.dto.WorkerFeignDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "demo-server", path = "/api/internal/v1")
public interface WorkerFeignClient {

    @GetMapping("/workers")
    WorkerFeignDto getWorker();

}
