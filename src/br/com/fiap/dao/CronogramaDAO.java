package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cronograma;
import br.com.fiap.conexao.Conexao;

public class CronogramaDAO {

private Connection con; 
private PreparedStatement stmt;
private ResultSet rs;

public CronogramaDAO()throws Exception {
	con = Conexao.abrirConexao();
}
public String criarCronograma(Cronograma crn)throws Exception{
	stmt = con.prepareStatement
			("INSERT INTO T_DBC_CRONOGRAMA (ID_CRONOGRAMA,DT_DATA) VALUES (?,?)");
		stmt.setInt(1, crn.getIdCronograma());
		stmt.setString(2, crn.getDtData());
       stmt.executeUpdate();
       return "Inserido com sucesso";
}
public Cronograma consultarPorId(int numero)throws Exception{
	stmt = con.prepareStatement
			("SELECT * FROM  t_dbc_cronograma WHERE id_cronograma = ?");
	stmt.setInt(1, numero);
	rs = stmt.executeQuery();
	Cronograma crn = new Cronograma();
   if(rs.next()) {
	   crn.setIdCronograma(rs.getInt("id_cronograma"));
	   crn.setDtData(rs.getString("dt_data"));
   }
   rs.close();
   return crn;
}
public List<Cronograma> consultarPorData(String data)throws Exception{
	List<Cronograma> lista=new ArrayList<Cronograma>();
	stmt = con.prepareStatement
			("SELECT * FROM T_DBC_CRONOGRAMA WHERE dt_data = ?");
	stmt.setString(1, data);
	rs = stmt.executeQuery();	
	while(rs.next()) {
		lista.add(new Cronograma(
				rs.getInt("id_cronograma"),
				rs.getString("dt_data")
				));
	}
	rs.close();
	return lista;
}
  public int editarData(int numero)throws Exception{
	  stmt = con.prepareStatement
			  ("UPDATE T_DBC_CRONOGRAMA SET DT_DATE WHERE ID_CRONOGRAMA =?");
	  stmt.setInt(1, numero);
	  return stmt.executeUpdate();
  }
  public void fechar()throws Exception{
		stmt.close();
		con.close();
	}
  }

