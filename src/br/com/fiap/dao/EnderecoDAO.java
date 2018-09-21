package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class EnderecoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public EnderecoDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String criarEndereco(Endereco end) throws Exception {
		stmt = con.prepareStatement(
				"INSERT INTO T_DBC_ENDERECO (id_endereco,ds_logradouro,ds_cidade,ds_numero,ds_estado,ds_completamento) VALUES(?,?,?,?,?,?)");
		stmt.setInt(1, end.getIdEndereco());
		stmt.setString(2, end.getLogradouro());
		stmt.setString(3, end.getCidade());
		stmt.setInt(4, end.getNumero());
		stmt.setString(5, end.getEstado());
		stmt.setString(6, end.getComplemento());
		stmt.executeUpdate();
		return "Inserido com sucesso";
	}

	public String atualizaUsuario(Usuario usuario) throws Exception {
		stmt = con.prepareStatement(
				"UPDATE T_DBC_USUARIO SET ds_senha = ?,  ds_nome = ?, nr_cpf = ?, dt_nascimento = ?, ds_email = ?, nr_fone = ?, id_endereco = ? WHERE ID_USUARIO = ?");
		stmt.setString(1, usuario.getDsSenha());
		stmt.setString(2, usuario.getDsNome());
		stmt.setString(3, usuario.getCpf());
		stmt.setString(4, usuario.getDtNascimento());
		stmt.setString(5, usuario.getDsEmail());
		stmt.setString(6, usuario.getFone());
		stmt.setString(7, usuario.getEndereco().getAll());
		stmt.setInt(8, usuario.getIdUsuario());
		stmt.executeUpdate();
		return "Dados do usuario atualizados com sucesso";
	}

	public Endereco consultarId(int numero) throws Exception {
		stmt = con.prepareStatement("Select * from t_dbc_endereco where id_endereco = ?");
		stmt.setInt(1, numero);
		rs = stmt.executeQuery();
		Endereco end = new Endereco();
		if (rs.next()) {
			end.setIdEndereco(rs.getInt("id_endereco"));
			end.setLogradouro(rs.getString("ds_logradouro"));
			end.setCidade(rs.getString("ds_cidade"));
			end.setNumero(rs.getInt("ds_numero"));
			end.setEstado(rs.getString("ds_estado"));
			end.setEstado(rs.getString("ds_complemento"));
		}

		rs.close();
		return end;
	}

	public int trocarEndereco(Endereco end) throws Exception {
		stmt = con.prepareStatement(
				"UPDATE T_DBC_ENDERECO SET ds_logradouro=?, ds_cidade=?, ds_numero = ? , ds_estado=?, ds_complemento=? WHERE ID_ENDERECO=?");
		stmt.setString(1, end.getLogradouro());
		stmt.setString(2, end.getCidade());
		stmt.setInt(3, end.getNumero());
		stmt.setString(4, end.getEstado());
		stmt.setString(5, end.getComplemento());

		stmt.setInt(6, end.getIdEndereco());
		return stmt.executeUpdate();
	}

	public int apagar(int numero) throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_DBC_ENDERECO WHERE ID_ENDERECO = ? ");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}

}
