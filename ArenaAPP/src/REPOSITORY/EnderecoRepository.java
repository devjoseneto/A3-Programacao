/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;

import MODELS.EnderecoModel;
import MODELS.EquipeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author netoi
 */
public class EnderecoRepository {

    Connection conn;
    PreparedStatement pstm;

    public int createEndereco(EnderecoModel endereco) {
        int id_endereco = 0;
        try {
            String sqlID = "select id_endereco from endereco where rua = ? and bairro = ? and numero = ? and cidade = ?;";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sqlID);
            pstm.setString(1, endereco.getRua());
            pstm.setString(2, endereco.getBairro());
            pstm.setString(3, endereco.getNum());
            pstm.setString(4, endereco.getCidade());

            ResultSet rsId = pstm.executeQuery();

            if (rsId.next()) {
                id_endereco = rsId.getInt("id_endereco");
            } else {
                String sql = "insert into endereco (rua, bairro, numero, cidade) values (?, ?, ?, ?);";
                conn = new ConexaoBD().conectaDB();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, endereco.getRua());
                pstm.setString(2, endereco.getBairro());
                pstm.setString(3, endereco.getNum());
                pstm.setString(4, endereco.getCidade());

                pstm.execute();
                pstm.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar endereco");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_endereco;
    }

    public EnderecoModel readEndereco(EquipeModel equipe) {
        String sql = "select * from endereco WHERE id_endereco = ?;";
        conn = new ConexaoBD().conectaDB();
        EnderecoModel endereco = new EnderecoModel();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(equipe.getId_endereco()));

            ResultSet rs = pstm.executeQuery();
            if (rs != null && rs.next()) {
                endereco.setRua(rs.getString("rua"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setNum(rs.getString("numero"));
                endereco.setCidade(rs.getString("cidade"));
            }
            return endereco;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository Read Endereco" + ex);
            return null;
        }
    }

    public void updateEndereco(EnderecoModel endereco) {
        try {
            String sql = "update endereco\n"
                    + "set rua = ?,\n"
                    + "bairro = ?,\n"
                    + "numero = ?,\n"
                    + "cidade = ?\n"
                    + "where id_endereco = ?;";
            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, endereco.getRua());
            pstm.setString(2, endereco.getBairro());
            pstm.setString(3, endereco.getNum());
            pstm.setString(4, endereco.getCidade());
            pstm.setString(5, String.valueOf(endereco.getId_endereco()));

            pstm.execute();
            pstm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UEnderecoRepository: " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
