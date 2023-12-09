package employeeApp.model;

import javax.swing.*;
import java.util.Arrays;

public class Employee {
    private String fullName;
    private long id;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(String fullName, long id, String email, String password, String[] healthPlans) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public String getFullName() {
        return fullName;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if(index<0 || index > healthPlans.length){
            System.out.println("Index değeri 0' dan küçük girilemez.");
        } else{
            boolean isExist = false;
            for(String healthPlan: healthPlans){;
                if(healthPlan.equals(name)){
                    isExist= true;
                    System.out.println(name + "zaten dizi içerisinde var");
                    break;

                }
            }
            if(!isExist){
                if(healthPlans[index]==null){
                    healthPlans[index] = name;
                }else{
                    System.out.println("İlgili index dolu");
                }
            }



        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
