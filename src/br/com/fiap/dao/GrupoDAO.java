package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Grupo;
import br.com.fiap.conexao.Conexao;

public class GrupoDAO {
private Connection con ;
private PreparedStatement stmt;
private ResultSet rs;

 public GrupoDAO() throws Exception{
	 con = Conexao.abrirConexao();
 }
 public String criarGrupo(Grupo grp) throws  Exception{
	 stmt = con.prepareStatement
			 ("INSERT INTO T_DBC_GRUPO (ID_GRUPO,DS_NOME)VALUES (?,?)");
	 stmt.setInt(1, grp.getIdGrupo());
	 stmt.setString(2, grp.getDsNome());
     stmt.executeQuery();
     return "INSERIDO COM SUCESSO!";
 }
 
 public List<Grupo> consultarPorNome(String dt)throws Exception{
	 List<Grupo> lista=new ArrayList<Grupo>();
	 stmt = con.prepareStatement
			 ("SELECT * FROM T_DBC_GRUPO WHERE ID_GRUPO = ?");
	 stmt.setString(1, dt);
	 stmt.executeQuery();	 
	 while(rs.next()) {
		 lista.add(new Grupo(
				 rs.getInt("ID_GRUPO"),
				 rs.getString("ds_nome")
				 ));		 
	 }
	 rs.close();
	 return lista;
 }
 public int atualizarNome(Grupo gp)throws Exception{
	 stmt=con.prepareStatement
			 ("UPDATE T_DBC_GRUPO SET DS_NOME=? WHERE ID_GRUPO=?");
	 stmt.setString(1, gp.getDsNome());
	 stmt.setInt(2, gp.getIdGrupo());
	 return stmt.executeUpdate();
 }
 public int apagar(int numero)throws Exception{
	 stmt=con.prepareStatement
			 ("DELETE FROM T_DBC_GRUPO WHERE ID_GRUPO=?");
	 return stmt.executeUpdate();
 }
 
 public void fechar()throws Exception{
		stmt.close();
		con.close();
	}

 
}
