package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class UsuarioDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public UsuarioDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String criarUsuario(Usuario user) throws Exception {
		stmt = con.prepareStatement("INSERT INTO T_DBC_USUARIO (id_usuario, " + "ds_senha," + "ds_tipo," + "ds_nome,"
				+ "nr_cpf," + "dt_nascimento," + "ds_email,nr_fone,id_endereco) VALUES(?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1, user.getIdUsuario());
		stmt.setString(2, user.getDsSenha());
		stmt.setInt(3, user.getDsTipo());
		stmt.setString(4, user.getDsNome());
		stmt.setString(5, user.getDtNascimento());
		stmt.setString(6, user.getDsEmail());
		stmt.setString(7, user.getFone());
		stmt.setInt(8, user.getEndereco().getIdEndereco());

		stmt.executeUpdate();
		return "Inserido com sucesso";
	}

	public Usuario consultarPorId(int numero) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM T_DBC_USUARIO  INNER JOIN T_DBC_ENDERECO ON "
				+ "(T_DBC_ENDERECO.id_endereco =T_DBC_USUARIO.ID_ENDERECO)" + " WHERE ID_USUARIO = ?");
		stmt.setInt(1, numero);
		rs = stmt.executeQuery();
		Usuario user = new Usuario();
		if (rs.next()) {
			user.setIdUsuario(rs.getInt("ID_USUARIO"));
			user.setDsSenha(rs.getString("ds_senha"));
			user.setDsTipo(rs.getInt("ds_tipo"));
			user.setDsNome(rs.getString("ds_nome"));
			user.setCpf(rs.getString("nr_cpf"));
			user.setDtNascimento(rs.getString("dt_nascimento"));
			user.setDsEmail(rs.getString("ds_email"));
			user.setFone(rs.getString("nr_fone"));
			user.setEndereco(
					new Endereco(rs.getInt("id_endereco"), rs.getString("ds_logradouro"), rs.getString("ds_cidade"),
							rs.getInt("numero"), rs.getString("ds_estado"), rs.getString("ds_completamento")));

		}
		rs.close();
		return user;
	}

	public int atualizaUsuario(Usuario usuario) throws Exception {
		stmt = con.prepareStatement(
				"UPDATE T_DBC_USUARIO SET ds_senha = ?,  ds_nome = ?, nr_cpf = ?, dt_nascimento = ?, ds_email = ?, nr_fone = ? WHERE ID_USUARIO = ?");
		stmt.setString(1, usuario.getDsSenha());
		stmt.setString(2, usuario.getDsNome());
		stmt.setString(3, usuario.getCpf());
		stmt.setString(4, usuario.getDtNascimento());
		stmt.setString(5, usuario.getDsEmail());
		stmt.setString(6, usuario.getFone());
		stmt.setInt(7, usuario.getIdUsuario());
		return stmt.executeUpdate();
	}

	public List<Usuario> consultarPorNome(String nome) throws Exception {
		List<Usuario> lista = new ArrayList<Usuario>();
		stmt = con.prepareStatement("SELECT * FROM T_DBC_USUARIO INNER JOIN T_DBC_ENDERECO ON"
				+ "(T_DBC_ENDERECO.ID_ENDERECO = T_DBC_USUARIO.ID_ENDERECO)" + "WHERE DS_NOME LIKE ?");
		stmt.setString(1, nome + "%");
		rs = stmt.executeQuery();
		while (rs.next()) {
			lista.add(new Usuario(rs.getInt("ID_USUARIO"), rs.getString("ds_java"), rs.getInt("ds_tipo"),
					rs.getString("ds_nome"), rs.getString("nr_cpf"), rs.getString("dt_nascimento"),
					rs.getString("ds_email"), rs.getString("nr_fone"),
					new Endereco(rs.getInt("id_endereco"), rs.getString("ds_logradouro"), rs.getString("ds_cidade"),
							rs.getInt("ds_numero"), rs.getString("ds_estado"), rs.getString("ds_completamento"))));
		}
		rs.close();
		return lista;
	}

	public int editarSenha(int numero) throws Exception {
		stmt = con.prepareStatement("UPDATE T_DBC_USUARIO SET DS_SENHA WHERE id_usuario = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public int deletarUsuario(int numero) throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_DBC_USUARIO WHERE ID_USUARIO = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}

}
