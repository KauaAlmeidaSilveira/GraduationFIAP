package br.com.fiap.main;

import br.com.fiap.beans.Address;
import br.com.fiap.beans.Client;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = JOptionPane.showInputDialog("Enter client name: ");
        
        String email = JOptionPane.showInputDialog("Enter client email: ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter client age: "));
        
        String cpf = JOptionPane.showInputDialog("Enter client cpf: ");
        
        String logradouro = JOptionPane.showInputDialog("Enter your place: ");
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
        
        int cep = Integer.parseInt(JOptionPane.showInputDialog("Enter cep: "));
        
        String bairro = JOptionPane.showInputDialog("Enter bairro: ");
        
        String municipio = JOptionPane.showInputDialog("Enter municipio: ");
        
        String cidade = JOptionPane.showInputDialog("Enter cidade: ");
        
        String nacionalidade = JOptionPane.showInputDialog("Enter nacionalidade: ");
        
        Address address = new Address(logradouro, num, cep, bairro, municipio, cidade, nacionalidade);
        
        Client client = new Client(name, cpf, address, email, age);

        System.out.println("INFO CLIENT\n");

        System.out.println(client.toString());
        
        System.out.println("\nINFO ADDRESS\n");
        
        System.out.println(client.getAddress());

        sc.close();

    }
}
