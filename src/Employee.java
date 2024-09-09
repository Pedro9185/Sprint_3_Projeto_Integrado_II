import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe que representa um funcionário
class Employee {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private List<LocalDate> historicoPonto;  // Histórico de pontos
    private List<String> historicoFerias;    // Histórico de solicitações de férias
    private Payroll contracheque;     // Contracheque do funcionário

    public Employee(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.historicoPonto = new ArrayList<>();
        this.historicoFerias = new ArrayList<>();
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<LocalDate> getHistoricoPonto() {
        return historicoPonto;
    }

    public void setHistoricoPonto(List<LocalDate> historicoPonto) {
        this.historicoPonto = historicoPonto;
    }

    public void setHistoricoFerias(List<String> historicoFerias) {
        this.historicoFerias = historicoFerias;
    }

    public List<String> getHistoricoFerias() {
        return historicoFerias;
    }

    public Payroll getContracheque() {
        return contracheque;
    }

    public void setContracheque(Payroll contracheque) {
        this.contracheque = contracheque;
    }
    //metodos
    public void marcarPonto() {
        LocalDate hoje = LocalDate.now();
        historicoPonto.add(hoje);
        System.out.println("Ponto marcado com sucesso no dia " + hoje);
    }

    public void solicitarFerias(String periodo) {
        historicoFerias.add("Solicitação de férias: " + periodo + " - Aguardando aprovação");
        System.out.println("Solicitação de férias registrada.");
    }


    //Customizar como o objeto é mostrado quando for chamado
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario;
    }
}
