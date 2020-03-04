package com.drakezzz.feign.demo.mapper;

import com.drakezzz.feign.demo.api.dto.WorkerDto;
import com.drakezzz.feign.demo.entity.Worker;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-05T00:21:33+0400",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
@Component
public class WorkerToWorkerDtoMapperImpl implements WorkerToWorkerDtoMapper {

    @Override
    public WorkerDto map(Worker worker) {
        if ( worker == null ) {
            return null;
        }

        WorkerDto workerDto = new WorkerDto();

        workerDto.setName( worker.getName() );
        workerDto.setOccupation( worker.getOccupation() );

        return workerDto;
    }
}
