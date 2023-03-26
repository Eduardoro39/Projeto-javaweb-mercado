/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercadoonline.DAO;

import br.com.mercadoonline.model.Cidade;
import br.com.mercadoonline.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class CidadeDAO implements GenericDAO {

    private Connection conn;

    public CidadeDAO() throws Exception {
        try {            
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar no BD! Erro: " + ex.getMessage());
        }
    } 
    
    @Override
    public Boolean save(Object object) {
        Cidade cidade = (Cidade) object;        
        PreparedStatement stmt = null;        
        String sql = "INSERT INTO cidade(nome_cidade, uf_cidade) VALUES (?, ?);";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cidade.getNomeCidade());
            stmt.setString(2, cidade.getUfCidade());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Cidade! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão com o BD! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> findAll() {
        List<Object> resultado = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "SELECT * from cidade;";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setIdCidade(rs.getInt("id_cidade"));
                cidade.setNomeCidade(rs.getString("nome_cidade"));
                cidade.setUfCidade(rs.getString("uf_cidade"));
                resultado.add(cidade);
            }
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Cidades! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão com o BD! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return resultado;
    }

    @Override
    public void deleteById(Integer idObject) {
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM cidade WHERE id_cidade = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Cidade! Erro: " + ex.getMessage());
            ex.printStackTrace();            
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão com o BD! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object findById(Integer idObject) {
        Cidade cidade = null;
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "SELECT * from cidade WHERE id_cidade = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                cidade = new Cidade();
                cidade.setIdCidade(rs.getInt("id_cidade"));
                cidade.setNomeCidade(rs.getString("nome_cidade"));
                cidade.setUfCidade(rs.getString("uf_cidade"));                
            }
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Cidade! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão com o BD! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return cidade;
    }

    @Override
    public Boolean update(Object object) {
        Cidade cidade = (Cidade) object;        
        PreparedStatement stmt = null;        
        String sql = "UPDATE cidade SET nome_cidade=?, uf_cidade=? WHERE id_cidade=?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cidade.getNomeCidade());
            stmt.setString(2, cidade.getUfCidade());
            stmt.setInt(3, cidade.getIdCidade());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Cidade! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão com o BD! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
}
