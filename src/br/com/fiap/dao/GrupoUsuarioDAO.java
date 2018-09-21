package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Grupo;
import br.com.fiap.beans.GrupoUsuario;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class GrupoUsuarioDAO {
	private Connection con ;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public GrupoUsuarioDAO() throws Exception{
		con = Conexao.abrirConexao();
	}
	public GrupoUsuario consultarPorIdUsuario(int numero) throws Exception{
		stmt=con.prepareStatement
				("SELECT * FROM T_DBC_GRUPO_USUARIO INNER JOIN T_DBC_USUARIO ON(T_DBC_USUARIO.ID_USUARIO=T_DBC_GRUPO_USUARIO) INNER JOIN T_DBC_GRUPO ON(T_DBC_GRUPO.ID_GRUPO=T_DBC_GRUPO_USUARIO) WHERE ID_USUARIO=?");	
		stmt.setInt(1, numero);
		stmt.executeQuery();
		GrupoUsuario gpus=new GrupoUsuario();
		if(rs.next()) {
			gpus.setIdGrupo(new Grupo (
					rs.getInt("ID_GRUPO"),
					rs.getString("DS_NOME")
					));
			gpus.setIdUsuario(new Usuario(
   				 rs.getInt("ID_USUARIO"),
   				 rs.getString("ds_java"),
   				 rs.getInt("ds_tipo"),
   				 rs.getString("ds_nome"),
   				 rs.getString("nr_cpf"),
   				 rs.getString("dt_nascimento"),
   				 rs.getString("ds_email"),
   				 rs.getString("nr_fone"),
   				 new Endereco(
   							rs.getInt("id_endereco"),
   	    					rs.getString("ds_logradouro"),
   	    					rs.getString("ds_cidade"),
   	    					rs.getInt("ds_numero"),
   	    					rs.getString("ds_estado"),
   	    					rs.getString("ds_completamento")
   				 )));
		}
		rs.close();
		return gpus;
		
	}
	public GrupoUsuario consultarPorIdGrupo(int numero) throws Exception{
		stmt=con.prepareStatement
				("SELECT * FROM T_DBC_GRUPO_USUARIO INNER JOIN T_DBC_USUARIO ON(T_DBC_USUARIO.ID_USUARIO=T_DBC_GRUPO_USUARIO) INNER JOIN T_DBC_GRUPO ON(T_DBC_GRUPO.ID_GRUPO=T_DBC_GRUPO_USUARIO) WHERE ID_GRUPO=?");	
		stmt.setInt(1, numero);
		stmt.executeQuery();
		GrupoUsuario gpus=new GrupoUsuario();
		if(rs.next()) {
			gpus.setIdGrupo(new Grupo (
					rs.getInt("ID_GRUPO"),
					rs.getString("DS_NOME")
					));
			gpus.setIdUsuario(new Usuario(
   				 rs.getInt("ID_USUARIO"),
   				 rs.getString("ds_java"),
   				 rs.getInt("ds_tipo"),
   				 rs.getString("ds_nome"),
   				 rs.getString("nr_cpf"),
   				 rs.getString("dt_nascimento"),
   				 rs.getString("ds_email"),
   				 rs.getString("nr_fone"),
   				 new Endereco(
   							rs.getInt("id_endereco"),
   	    					rs.getString("ds_logradouro"),
   	    					rs.getString("ds_cidade"),
   	    					rs.getInt("ds_numero"),
   	    					rs.getString("ds_estado"),
   	    					rs.getString("ds_completamento")
   				 )));
		}
		rs.close();
		return gpus;
		
	}
}
