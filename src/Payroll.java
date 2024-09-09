// Classe para gerenciar a folha de pagamento
class Payroll {
    private double salarioBase;
    private double bonus;

    public Payroll(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salário Base: R$" + salarioBase + ", Bônus: R$" + bonus + ", Total: R$" + (salarioBase + bonus);
    }
}