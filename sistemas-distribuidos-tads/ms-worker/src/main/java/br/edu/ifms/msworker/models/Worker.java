package br.edu.ifms.msworker.models;

public class Worker {
    private Integer id;
    private String name;
    private Double salary;

    public Worker(Integer id) {
        this.id = id;
        this.name = "João";
        this.salary = 3000D;
    }

    public Integer getId (){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSalary (Double salary) {
        this.salary = salary;
    }
    
}
