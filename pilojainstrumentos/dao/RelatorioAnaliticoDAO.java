package com.mycompany.pilojainstrumentos.dao;

import com.mycompany.pilojainstrumentos.models.RelatorioAnalitico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RelatorioAnaliticoDAO {

    static String URL = "jdbc:mysql://localhost:3306/exemplopvd";
    static String login = "root";
    static String senha = "adminadmin";

    public static ArrayList<RelatorioAnalitico> listarPorVenda(int idVenda) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        ArrayList<RelatorioAnalitico> listaRetorno = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);

            String sql = "SELECT itemVenda.idProduto,Produto.nomeProduto , itemVenda.vlrUnitario, itemVenda.qtdProduto FROM itemVenda"
                    + " INNER JOIN Produto ON itemVenda.idProduto = Produto.idProduto"
                    + " WHERE itemVenda.idVenda = ?";
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, idVenda);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                
                RelatorioAnalitico item = null;
                
                int idProduto =rs.getInt("idProduto");
                String nomeProduto = rs.getString("nomeProduto");
                float valorUnitario = rs.getFloat("vlrUnitario");
                int qtdProduto = rs.getInt("qtdProduto");

                item = new RelatorioAnalitico(nomeProduto, qtdProduto, valorUnitario);
                listaRetorno.add(item);
            }

        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging purposes
        } finally {
            try {
                if (rs != null) rs.close();
                if (comandoSQL != null) comandoSQL.close();
                if (conexao != null) conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return listaRetorno;
    }
}
