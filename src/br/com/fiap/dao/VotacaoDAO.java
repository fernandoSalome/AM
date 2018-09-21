package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Topico;
import br.com.fiap.beans.Usuario;
import br.com.fiap.beans.Votacao;
import br.com.fiap.conexao.Conexao;

public class VotacaoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public VotacaoDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String criarVotacao(Votacao vtc) throws Exception {
		stmt = con.prepareStatement("INSERT INTO t_tdc_votacao(id_votacao,id_evento,dt_termino) VALUES (?,?,?)");
		stmt.setInt(1, vtc.getIdEvento());
		stmt.setInt(2, vtc.getIdEvento());
		stmt.setString(3, vtc.getDtTermino());
		return "Inserido com Sucesso";
	}

	public Votacao consultarId(int numero) throws Exception {
		stmt = con.prepareStatement(
				"SELECT * FROM T_DBC_VOTACAO INNER JOIN ON (T_DBC_VOTACAO.ID_EVENTO=T_DBC_EVENTO.ID_EVENTO) WHERE id_votacao = ? ");
		stmt.setInt(1, numero);
		rs = stmt.executeQuery();
		Votacao vtc = new Votacao();
		if (rs.next()) {
			vtc.setAll(rs.getInt("ID_EVENTO"), new Usuario(rs.getInt("ID_USUARIO")), new Topico(rs.getInt("id_Topico")),
					rs.getString("dt_Abertura"), rs.getString("ds_Evento"), rs.getString("nm_evento"),
					rs.getInt("ID_VOTACAO"), rs.getString("DT_TERMINO"));
		}
		rs.close();
		return vtc;
	}

	public List<Votacao> consultaDataTermina(String data) throws Exception {
		List<Votacao> lista = new ArrayList<Votacao>();
		stmt = con.prepareStatement(
				"SELECT * FROM T_DBC_VOTACAO INNER JOIN ON (T_DBC_EVENTO.ID_EVENTO=T_DBC_VOTACAO.ID_EVENTO) WHERE DT_TERMINO LIKE ?");
		stmt.setString(1, data);
		rs = stmt.executeQuery();
		while (rs.next()) {
			lista.add(new Votacao(rs.getInt("ID_EVENTO"), new Usuario(rs.getInt("ID_USUARIO")),
					new Topico(rs.getInt("ID_TOPICO")), rs.getString("dt_Abertura"), rs.getString("ds_Evento"),
					rs.getString("nm_evento"), rs.getInt("id_Votacao"), rs.getString("dt_Termino")));
		}
		rs.close();
		return lista;
	}

	public int apagarVotacao(int numero) throws Exception {
		stmt = con.prepareStatement("delete from t_dbc_votacao where id_Votacao = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public int AlterarVotacao(Votacao votacao) throws Exception {
		stmt = con.prepareStatement("update t_dbc_votacao set dt_termino=? where id_Votacao = ?");
		stmt.setString(1, votacao.getDtTermino());
		stmt.setInt(2, votacao.getIdVotacao());
		return stmt.executeUpdate();

	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}
}
