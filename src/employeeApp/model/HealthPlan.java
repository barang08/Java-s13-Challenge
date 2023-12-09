package employeeApp.model;

import employeeApp.enums.Plan;

public class HealthPlan {
    private String name;
    private long id;
    private Plan plan;

    public HealthPlan(String name, long id, Plan plan) {
        this.name = name;
        this.id = id;
        this.plan = plan;
        

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;


    }

    @Override
    public String toString() {
        return "HealthPlan{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", plan=" + plan +
                '}';
    }
}
