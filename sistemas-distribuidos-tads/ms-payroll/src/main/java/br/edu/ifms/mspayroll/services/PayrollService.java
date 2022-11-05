package br.edu.ifms.mspayroll.services;

import br.edu.ifms.mspayroll.interfaces.WorkerInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayrollService {
    
    final private RestTemplate restTemplate;
    final private WorkerInterface workerInterface;
    
    @Value("${ms-worker.url}")
    private String workerUrl;

    public PayrollService(RestTemplate restTemplate, WorkerInterface workerInterface) {
        this.restTemplate = restTemplate;
        this.workerInterface = workerInterface;
    }

//    public Double getWorkerSalary(Integer days, Integer id) {
//        Map<String, String> params = new HashMap<>();
//        params.put("id", String.valueOf(id));
//        Double salary = restTemplate.getForObject(workerUrl + "/{id}/salary", Double.class, params);
//        salary += days * (salary * 0.03);
//        return salary;
//    }

    public Double getWorkerSalary(Integer days, Integer id) {

        Double salary = workerInterface.getSalaryWorker(id).getBody();
        salary += days * (salary * 0.03);
        return salary;
    }
}
