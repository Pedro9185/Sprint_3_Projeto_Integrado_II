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
    public void addEmployee(String name,String lastName, String position, double salary) {
        Employee employee = new Employee(nextId++, name,lastName, position, salary);
        employees.add(employee);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    //editar funcionário
    public void updateEmployee(int id, String newName, String newPosition, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(newName);
                employee.setPosition(newPosition);
                employee.setSalary(newSalary);
                System.out.println("Funcionário editado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    //remover funcionário
    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Funcionário removido com sucesso!");
    }


    //listar todos os funcionários
    public void listEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    // Aprovação ou reprovação de férias
    public void manageVacation(int idEmployee, boolean approve) {
        Employee employee = getEmployeeById(idEmployee);
        if (employee != null) {
            List<String> historicVacation = employee.getHistoricVacation();
            if (!historicVacation.isEmpty()) {
                String lastRequest = historicVacation.get(historicVacation.size() - 1);
                if (approve) {
                    historicVacation.set(historicVacation.size() - 1, lastRequest.replace("Aguardando aprovação", "Aprovado"));
                    System.out.println("Férias aprovadas.");
                } else {
                    historicVacation.set(historicVacation.size() - 1, lastRequest.replace("Aguardando aprovação", "Reprovado"));
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
    public void fillOutPayroll(int idFuncionario, double salario, double bonus) {
        Employee employee = getEmployeeById(idFuncionario);
        if (employee != null) {
            Payroll sheet = new Payroll(salario, bonus);
            employee.setSalary(salario);
            employee.setPaycheck(sheet);
            System.out.println("Folha de pagamento preenchida.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    //metodo para buscar funcionário pelo ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}