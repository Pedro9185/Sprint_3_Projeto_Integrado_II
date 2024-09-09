// simular algumas funcionalidades
public class SistemaRH {
    public static void main(String[] args) {
        ManageHR gerenciador = new ManageHR();
        //Cadastrar
        gerenciador.addEmployee("Lucas", "aa", "ti", 1000);
        gerenciador.addEmployee("Maria", "bb", "ti", 2000);
        //Listar
        gerenciador.listEmployee();
        //Preencher folha de pagamento com alteração de de salário
        gerenciador.fillOutPayroll(1,3000,50);
        //listar
        gerenciador.listEmployee();
        gerenciador.updateEmployee(2,"João","support",800);


    }

}