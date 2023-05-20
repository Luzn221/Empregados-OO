package Aplicattion;

import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Department department = new Department();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        department.setName(sc.nextLine());

        System.out.print("Dia do pagamento: ");
        department.setPayDay(sc.nextInt());
        clearbuffer(sc);

        System.out.print("Email: ");
        String email = sc.nextLine();


        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println();

        department.setAddress(new Address(email, telefone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            clearbuffer(sc);
            System.out.println("Dados do funcionário " + i + ": ");
            System.out.print("Nome: ");

            String nomeFuncionario = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(nomeFuncionario, salary);

            department.addEmployee(employee);

            System.out.println();
        }

        showReport(department);
    }

    private static void showReport(Department department) {

        System.out.println("Departamento :" + department.getName());

        System.out.println("Valor total de salario= " + department.payroll());

        System.out.println("Pagamento realizado: " + department.getPayDay());

        System.out.println("funcionarios: ");
        for (Employee emp : department.getEmployee()) {
            System.out.println(emp.getName());
        }
        System.out.println("\nPara dúvidas entrar em contato com: "+department.getAddress().getEmail()+".");
        System.out.println("Telefone: "+department.getAddress().getPhone());
    }

    private static void clearbuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
