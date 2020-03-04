package com.drakezzz.feign.demo.mapper;

import com.drakezzz.feign.demo.api.dto.WorkerDto;
import com.drakezzz.feign.demo.entity.Worker;
import org.mapstruct.Mapper;

@Mapper
public interface WorkerToWorkerDtoMapper {

    WorkerDto map(Worker worker);

}
