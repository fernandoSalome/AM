package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Topico;
import br.com.fiap.conexao.Conexao;

public class TopicoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public TopicoDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String criarTopico(Topico tpc) throws Exception {
		stmt = con.prepareStatement("INSERT INTO T_DBC_TOPICO(ID_TOPICO ,ds_nome_criador, NM_TOPICO) VALUES (?,?,?)");
		stmt.setInt(1, tpc.getIdTopico());
		stmt.setString(2, tpc.getNomeCriador());
		stmt.setString(3, tpc.getNomeTopico());
		stmt.executeUpdate();
		return "Inserido com sucesso!";
	}

	public Topico consultarPorId(int numero) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM T_DBC_TOPICO  WHERE ID_TOPICO = ?");
		stmt.setInt(1, numero);
		rs = stmt.executeQuery();
		Topico tpc = new Topico();
		if (rs.next()) {
			tpc.setIdTopico(rs.getInt("ID_TOPICO"));
			tpc.setNomeCriador(rs.getString("ds_nome_criador"));
			tpc.setNomeTopico(rs.getString("nm_topico"));

		}
		rs.close();
		return tpc;
	}

	public List<Topico> consultarPorNome(String nome) throws Exception {

		List<Topico> lista = new ArrayList<Topico>();

		stmt = con.prepareStatement("select * from t_dbc_topico where ds_nome_criador like ? ");
		stmt.setString(1, nome + "%");
		rs = stmt.executeQuery();
		while (rs.next()) {
			lista.add(new Topico(rs.getInt("id_topico"), rs.getString("ds_nome_criador"), rs.getString("nm_topico")));
		}

		rs.close();
		return lista;
	}

	public int trocarTopico(Topico topico) throws Exception {
		stmt = con.prepareStatement("UPDATE T_DBC_TOPICO SET NM_TOPICO =?,ds_nome_criador=? WHERE ID_TOPICO = ?");
		stmt.setString(1, topico.getNomeTopico());
		stmt.setString(2, topico.getNomeCriador());
		stmt.setInt(3, topico.getIdTopico());
		System.out.println("Passou");
		return stmt.executeUpdate();
	}

	public int apagarTopico(int numero) throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_DBC_TOPICO WHERE ID_TOPICO = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}

}
