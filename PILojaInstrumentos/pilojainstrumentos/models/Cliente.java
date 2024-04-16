
package com.mycompany.pilojainstrumentos.models;

/**
 *
 * @author Helo
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String CPF;
    
    //Construtores
    public Cliente(){
        
    }
    
    public Cliente(String nomeCliente, String emailCliente, String CPF) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.CPF = CPF;
    }
    
    public Cliente(int idCliente, String nomeCliente, String emailCliente, String CPF) {
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
    
    public String getCpf() {
        return CPF;
    }
    public void setCpf(String CPF) {
        this.CPF = CPF;
    }
    
}
