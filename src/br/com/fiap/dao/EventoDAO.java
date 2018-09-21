package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Evento;
import br.com.fiap.beans.Topico;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class EventoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public EventoDAO() throws Exception{
		con=Conexao.abrirConexao();
	}
	public String criarEvento(Evento evt) throws Exception{
		stmt=con.prepareStatement
		("INSERT INTO T_DBC_EVENTO (ID_EVENTO, ID_TOPICO, ID_USUARIO, DT_ABERTURA, DS_EVENTO, NM_EVENTO) VALUES (?,?,?,?,?,?)");
		stmt.setInt(1, evt.getIdEvento());
		stmt.setInt(2, evt.getIdTopico().getIdTopico());
		stmt.setInt(3, evt.getIdUsuario().getIdUsuario());
		stmt.setString(4, evt.getDtAbertura());
		stmt.setString(5, evt.getDsEvento());
		stmt.setString(6, evt.getDsNome());
		stmt.executeUpdate();
		return "Inserido com sucesso!";
	}
	public Evento consultarPorId(int numero) throws Exception{
		stmt=con.prepareStatement
		("SELECT * FROM T_DBC_EVENTO INNER JOIN T_DBC_USUARIO ON (T_DBC_EVENTO.ID_USUARIO=T_DBC_USUARIO.ID_USUARIO) INNER JOIN T_DBC_TOPICO ON(T_DBC_EVENTO.ID_TOPICO=T_DBC_TOPICO.ID_TOPICO) WHERE ID_EVENTO=?");
		stmt.setInt(1, numero);
		rs=stmt.executeQuery();
		Evento evt=new Evento();
		if(rs.next()) {
			evt.setIdEvento(rs.getInt("ID_EVENTO"));
			evt.setIdTopico(new Topico(
					rs.getInt("ID_TOPICO")
					));
			evt.setIdUsuario(new Usuario(
					rs.getInt("ID_USUARIO")
					));
			evt.setDtAbertura(rs.getString("DT_ABERTURA"));
			evt.setDsEvento(rs.getString("DS_EVENTO"));
			evt.setDsNome(rs.getString("NM_EVENTO"));
		}
		rs.close();		
		return evt;
	}
	public List<Evento> consultarPorNome(String nome) throws Exception{
		List<Evento> lista = new ArrayList<Evento>();
		stmt=con.prepareStatement("SELECT * FROM T_DBC_EVENTO INNER JOIN T_DBC_USUARIO ON (T_DBC_EVENTO.ID_USUARIO=T_DBC_USUARIO.ID_USUARIO) INNER JOIN T_DBC_TOPICO ON(T_DBC_EVENTO.ID_TOPICO=T_DBC_TOPICO) WHERE NM_EVENTO LIKE ?");
		stmt.setString(1, nome +"%");
		rs=stmt.executeQuery();
		while(rs.next()) {
			lista.add(new Evento(
					rs.getInt("ID_EVENTO"),
					new Usuario(
							rs.getInt("ID_USUARIO")
							),
					new Topico(
							rs.getInt("ID_TOPICO")
							),
					rs.getString("DT_ABERTURA"),
					rs.getString("DS_EVENTO"),
					rs.getString("NM_EVENTO")
					));
		}
		rs.close();
		return lista;
	}
	public int trocarNome(int numero) throws Exception{
		stmt=con.prepareStatement("UPDATE T_DBC_EVENTO SET NM_EVENTO WHERE ID_EVENTO=?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}
	public int apagar(int numero) throws Exception{
		stmt=con.prepareStatement("DELETE FROM T_DBC_EVENTO WHERE ID_EVENTO=?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}
	 public void fechar()throws Exception{
			stmt.close();
			con.close();
		}

	
	
}
