// simular algumas funcionalidades
public class SistemaRH {
    public static void main(String[] args) {
        ManageHR gerenciador = new ManageHR();
        //Cadastrar
        gerenciador.cadastrarFuncionario("Lucas", "ti", 1000);
        gerenciador.cadastrarFuncionario("Maria", "ti", 2000);
        //Listar
        gerenciador.listarFuncionarios();
        //Preencher folha de pagamento com alteração de de salário
        gerenciador.preencherFolhaPagamento(1,3000,50);
        //listar
        gerenciador.listarFuncionarios();

    }

}