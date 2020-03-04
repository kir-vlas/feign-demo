package com.drakezzz.feign.demo.mapper;

import com.drakezzz.feign.demo.entity.Worker;
import com.drakezzz.feign.demo.feign.dto.WorkerFeignDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-05T00:21:33+0400",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
@Component
public class WorkerFeignDtoToWorkerMapperImpl implements WorkerFeignDtoToWorkerMapper {

    @Override
    public Worker map(WorkerFeignDto workerFeignDto) {
        if ( workerFeignDto == null ) {
            return null;
        }

        Worker worker = new Worker();

        worker.setName( workerFeignDto.getName() );
        worker.setOccupation( workerFeignDto.getOccupation() );

        return worker;
    }
}
