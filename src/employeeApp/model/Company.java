package employeeApp.model;

public class Company {

    private long id;
    private String name;
private double giro;
private String[] developerName;

private void checkGiro(double giro){
    if(giro<0){
        this.giro = 0;

    }
    else{
        this.giro = giro;
    }
}

    public Company(long id, String name, double giro, String[] developerName) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerName = developerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String[] developerName) {
        this.developerName = developerName;
    }

    public void addEmployee(int index, String name){
        if(developerName[index] == null){
        developerName[index] = name;
    }else{
            System.out.println("İlgili index dolu");
        }
    }


}
