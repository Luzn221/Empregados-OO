package Aplicattion;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class App {
    private static final Employee[] list = null;
    public static void main(String[] args) throws Exception {


        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.nextLine();
        
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        clearbuffer(sc);

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println();

        Department department = new Department(name, payDay, new Address(email, telefone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.println("Dados do funcionário "+ i+": ");
            System.out.print("Nome: ");
            String nomefuncionario = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            department.setEmployee(null);
        }
        
        showReport(department);
    }
    private static void showReport(Department department) {
        System.out.print("Departamento :"+department.getName());

        System.out.println("Valor total de salario= "+department.payroll());

        System.out.println("Pagamento realizado: "+ department.getPayDay());

        System.out.println("funcionarios: ");
        
        
        for (Employee emp : list) {
            System.out.println(emp.getName());
        }
    }
    private static void clearbuffer(Scanner scanner) {
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
    }
}
