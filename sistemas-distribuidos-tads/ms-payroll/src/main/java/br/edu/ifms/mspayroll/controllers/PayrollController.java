package br.edu.ifms.mspayroll.controllers;

import br.edu.ifms.mspayroll.services.PayrollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
    final private PayrollService service;

    public PayrollController(PayrollService service) {
        this.service = service;
    }

    @GetMapping(value = "/days/{days}/workerId/{id}")
    public ResponseEntity<Double> getPayroll (@PathVariable Integer days, @PathVariable Integer id) {
         return ResponseEntity.ok(service.getWorkerSalary(days, id));
        }
}
