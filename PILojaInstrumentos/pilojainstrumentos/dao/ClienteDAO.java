package com.mycompany.pilojainstrumentos.dao;

import com.mycompany.pilojainstrumentos.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    static String URL = "jdbc:mysql://localhost:3306/exemplopdv";
    static String login = "root";
    static String senha = "adminadmin";

    public static boolean verificaCPF(String cpf) {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Carregar o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, login, senha);

            // Preparar a consulta SQL para verificar se o CPF já está cadastrado
            String sql = "SELECT COUNT(*) AS count FROM cliente WHERE cpf = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpf);

            // Executar a consulta
            rs = stmt.executeQuery();

            // Verificar se o CPF já está cadastrado
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Lidar com exceções (imprimir, registrar, lançar, etc.)
            e.printStackTrace();
        } finally {
            // Fechar recursos (ResultSet, PreparedStatement, Connection)
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false; // Se ocorrer alguma exceção ou se o CPF não estiver cadastrado
    }

    public static boolean salvar(Cliente obj) {
        Connection conexao = null;

        boolean retorno = false;

        try {
            //1 Carregar driver o mysql

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 Fazer conexão com o banco
            conexao = DriverManager.getConnection(URL, login, senha);

            //3 Preparar o comando SQL
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "INSERT INTO cliente (nomeCliente, cpf, emailCliente) VALUES (?,?,?);"
            );

            instrucaoSQL.setString(1, obj.getNomeCliente());
            instrucaoSQL.setString(2, obj.getCpf());
            instrucaoSQL.setString(3, obj.getEmailCliente());

            //4 Executar o comando
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver nao encontrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }

    public static ArrayList<Cliente> listar() {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;

        try {
            //1 Carregar driver o mysql

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 Fazer conexão com o banco
            conexao = DriverManager.getConnection(URL, login, senha);

            //3 Preparar o comando SQL
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM Cliente;"
            );
            //4 Executar o Comando
            rs = instrucaoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nomeCliente");
                    String CPF = rs.getString("CPF");
                    String email = rs.getString("emailCliente");

                    Cliente item = new Cliente(id, nome, email, CPF);
                    listaRetorno.add(item);
                }
            }

        } catch (Exception e) {
            listaRetorno = null;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listaRetorno;
    }
    public static ArrayList<Cliente> readForNome(String nomes) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;

        try {
            //1 Carregar driver o mysql

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 Fazer conexão com o banco
            conexao = DriverManager.getConnection(URL, login, senha);

            //3 Preparar o comando SQL
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM Cliente WHERE nomeCliente LIKE ?"
            );
                    instrucaoSQL.setString(1, "%"+nomes+"%");
            //4 Executar o Comando
            rs = instrucaoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nomeCliente");
                    String CPF = rs.getString("CPF");
                    String email = rs.getString("emailCliente");

                    Cliente item = new Cliente(id, nome, email, CPF);
                    listaRetorno.add(item);
                }
            }

        } catch (Exception e) {
            listaRetorno = null;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listaRetorno;
    }

    public static boolean alterar(Cliente obj) {
        Connection conexao = null;

        boolean retorno = false;

        try {
            //1 Carregar driver o mysql

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 Fazer conexão com o banco
            conexao = DriverManager.getConnection(URL, login, senha);

            //3 Preparar o comando SQL
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "UPDATE  Cliente SET nomeCliente=?,emailCliente=? WHERE idCliente =?;"
            );

            instrucaoSQL.setString(1, obj.getNomeCliente());
            instrucaoSQL.setString(2, obj.getEmailCliente());
            instrucaoSQL.setInt(3, obj.getIdCliente());

            //4 Executar o comando
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver nao encontrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }

    public static boolean excluir(int idExcluir) {
        Connection conexao = null;

        boolean retorno = false;

        try {
            //1 Carregar driver o mysql

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 Fazer conexão com o banco
            conexao = DriverManager.getConnection(URL, login, senha);

            //3 Preparar o comando SQL
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "DELETE FROM  Cliente WHERE idCliente =?;"
            );

            instrucaoSQL.setInt(1, idExcluir);

            //4 Executar o comando
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver nao encontrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }

}
