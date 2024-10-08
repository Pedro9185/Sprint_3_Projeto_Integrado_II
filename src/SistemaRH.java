// simular algumas funcionalidades
public class SistemaRH {
    public static void main(String[] args) {
        ManageHR gerenciador = new ManageHR();
        //Cadastrar
        gerenciador.addEmployee("Lucas", "aa", "ti", 1000);
        gerenciador.addEmployee("Maria", "bb", "ti", 2000);
        gerenciador.addEmployee("Zé", "cc", "chefe", 5000);
        //Listar
        gerenciador.listEmployee();
        //editar
        gerenciador.updateEmployee(3, "Zé da manga","chefe", 10000);
        //Listar
        gerenciador.listEmployee();
        //deletar
        gerenciador.deleteEmployee(3);
        //Listar
        gerenciador.listEmployee();
        //Preencher folha de pagamento com alteração de de salário
        gerenciador.fillOutPayroll(1,3000,50);
        //listar
        gerenciador.listEmployee();
        gerenciador.updateEmployee(2,"João","support",800);

        //FUNCIONALIDADES FUNCIONARIO
        Employee employee= gerenciador.getEmployeeById(2);
        //Marcar ponto
        employee.scorePoint();
        //solicitar férias
        employee.requestVacation("de 09 a 30 de setembro");
        //ver solicitações
        employee.getHistoricVacation();
        //gerente aprova
        gerenciador.manageVacation(2, true);
        //ver solicitações
        employee.getHistoricVacation();
        //gerenciar contracheque
        gerenciador.fillOutPayroll(2,5000,500);
        //ver contracheque
        System.out.println(employee.getPaycheck());


    }

}