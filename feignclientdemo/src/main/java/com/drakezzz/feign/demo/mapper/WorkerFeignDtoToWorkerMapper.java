package com.drakezzz.feign.demo.mapper;

import com.drakezzz.feign.demo.entity.Worker;
import com.drakezzz.feign.demo.feign.dto.WorkerFeignDto;
import org.mapstruct.Mapper;

@Mapper
public interface WorkerFeignDtoToWorkerMapper {

    Worker map(WorkerFeignDto workerFeignDto);

}
