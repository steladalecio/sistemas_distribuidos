package br.edu.ifms.msworker.controllers;

import br.edu.ifms.msworker.models.Worker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    
    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorker (@PathVariable Integer id) {
        var worker = new Worker(id);
        return ResponseEntity.ok(worker);
    }

    @GetMapping("/{id}/salary")
    public ResponseEntity<Double> getSalaryWorker (@PathVariable Integer id) {
        var worker = new Worker(id);
        return ResponseEntity.ok(worker.getSalary());
    }
}
