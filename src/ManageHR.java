import java.util.ArrayList;
import java.util.List;

// Classe que gerencia os funcionários
class ManageHR {
    private List<Employee> employees;
    private int nextId = 1;  // Gerador de ID simples

    public ManageHR() {
        employees = new ArrayList<>();
    }

    //cadastrar funcionário
    public void cadastrarFuncionario(String nome, String cargo, double salario) {
        Employee employee = new Employee(nextId++, nome, cargo, salario);
        employees.add(employee);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    //editar funcionário
    public void editarFuncionario(int id, String novoNome, String novoCargo, double novoSalario) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setNome(novoNome);
                employee.setCargo(novoCargo);
                employee.setSalario(novoSalario);
                System.out.println("Funcionário editado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    //remover funcionário
    public void removerFuncionario(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Funcionário removido com sucesso!");
    }

    //listar todos os funcionários
    public void listarFuncionarios() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    // Aprovação ou reprovação de férias
    public void gerenciarFerias(int idFuncionario, boolean aprovar) {
        Employee employee = buscarFuncionarioPorId(idFuncionario);
        if (employee != null) {
            List<String> historicoFerias = employee.getHistoricoFerias();
            if (!historicoFerias.isEmpty()) {
                String ultimaSolicitacao = historicoFerias.get(historicoFerias.size() - 1);
                if (aprovar) {
                    historicoFerias.set(historicoFerias.size() - 1, ultimaSolicitacao.replace("Aguardando aprovação", "Aprovado"));
                    System.out.println("Férias aprovadas.");
                } else {
                    historicoFerias.set(historicoFerias.size() - 1, ultimaSolicitacao.replace("Aguardando aprovação", "Reprovado"));
                    System.out.println("Férias reprovadas.");
                }
            } else {
                System.out.println("Nenhuma solicitação de férias encontrada.");
            }
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    //Preencher folha de pagamento
    public void preencherFolhaPagamento(int idFuncionario, double salario, double bonus) {
        Employee employee = buscarFuncionarioPorId(idFuncionario);
        if (employee != null) {
            Payroll folha = new Payroll(salario, bonus);
            employee.setSalario(salario);
            employee.setContracheque(folha);
            System.out.println("Folha de pagamento preenchida.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    //metodo para buscar funcionário pelo ID
    public Employee buscarFuncionarioPorId(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}