package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Assunto;
import br.com.fiap.beans.Topico;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class AssuntoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public AssuntoDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String criarAssunto(Assunto ass) throws Exception {
		stmt = con.prepareStatement("INSERT INTO T_DBC_ASSUNTO (ID_ASSUNTO, DS_NOME) VALUES (?,?)");
		stmt.setInt(1, ass.getIdAssunto());
		stmt.setString(2, ass.getDescricao());
		stmt.executeUpdate();
		return "Criado com Sucesso!";
	}

	public Assunto consultarPorId(int numero) throws Exception {
		stmt = con.prepareStatement(
				"SELECT * FROM T_DBC_ASSUNTO INNER JOIN ON (T_DBC_EVENTO.ID_EVENTO=T_DBC_ASSUNTO.ID_EVENTO) WHERE ID_ASSUNTO=?");
		stmt.setInt(1, numero);
		rs = stmt.executeQuery();
		Assunto ass = new Assunto();
		if (rs.next()) {

			ass.setAll(rs.getInt("ID_EVENTO"), new Usuario(rs.getInt("ID_USUARIO")), new Topico(rs.getInt("id_Topico")),
					rs.getString("dt_Abertura"), rs.getString("ds_Evento"), rs.getString("nm_evento"),
					rs.getInt("id_Assunto"), rs.getString("ds_NOME"));
		}
		rs.close();
		return ass;
	}

	public int mudarDescricao(Assunto assunto) throws Exception {
		stmt = con.prepareStatement("UPDATE T_DBC_ASSUNTO SET DS_NOME = ? WHERE ID_ASSUNTO=?");
		stmt.setString(1, assunto.getDsNome());
		stmt.setInt(2, assunto.getIdAssunto());
		return stmt.executeUpdate();

	}

	public int apagar(int numero) throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_DBC_ASSUNTO WHERE ID_ASSUNTO=?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();

	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}

}
