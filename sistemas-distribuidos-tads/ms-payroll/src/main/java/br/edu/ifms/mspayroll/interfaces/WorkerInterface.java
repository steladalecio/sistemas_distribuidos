package br.edu.ifms.mspayroll.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "ms-worker", url = "localhost:8001")
public interface WorkerInterface {

    @GetMapping("/{id}/salary")
    ResponseEntity<Double> getSalaryWorker (@PathVariable Integer id);
}
