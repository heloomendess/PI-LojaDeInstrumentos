
package com.mycompany.pilojainstrumentos.models;

/**
 *
 * @author Helo
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String emailCliente;
    private int CPF;
    
    //Construtores
    public Cliente(String nome, String email, String cpf) {
        
    }
    
    public Cliente(int idCliente, String nomeCliente, String emailCliente, int CPF) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.CPF = CPF;
    }
    
    // Setters and Getters
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
}
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getEmailCliente() {
        return emailCliente;
}
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    public int getCpf() {
        return CPF;
    }
    public void setCpf(int CPF) {
        this.CPF = CPF;
    }
    
}
