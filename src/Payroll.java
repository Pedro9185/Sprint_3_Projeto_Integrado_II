// Classe para gerenciar a folha de pagamento
class Payroll {
    private double baseSalary;
    private double bonus;

    public Payroll(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salário Base: R$" + baseSalary + ", Bônus: R$" + bonus + ", Total: R$" + (baseSalary + bonus);
    }
}