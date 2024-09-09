import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe que representa um funcionário
class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private List<LocalDate> historicPoint;  // Histórico de pontos
    private List<String> historicVacation;    // Histórico de solicitações de férias
    private Payroll paycheck;     // Contracheque do funcionário

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.historicPoint = new ArrayList<>();
        this.historicVacation = new ArrayList<>();
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<LocalDate> getHistoricPoint() {
        return historicPoint;
    }

    public void setHistoricPoint(List<LocalDate> historicPoint) {
        this.historicPoint = historicPoint;
    }

    public void setHistoricVacation(List<String> historicVacation) {
        this.historicVacation = historicVacation;
    }

    public List<String> getHistoricVacation() {
        return historicVacation;
    }

    public Payroll getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(Payroll paycheck) {
        this.paycheck = paycheck;
    }
    //metodos
    public void scorePoint() {
        LocalDate today = LocalDate.now();
        historicPoint.add(today);
        System.out.println("Ponto marcado com sucesso no dia " + today);
    }

    public void requestVacation(String period) {
        historicVacation.add("Solicitação de férias: " + period + " - Aguardando aprovação");
        System.out.println("Solicitação de férias registrada.");
    }


    //Customizar como o objeto é mostrado quando for chamado
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + name + ", Cargo: " + position + ", Salário: R$" + salary;
    }
}
