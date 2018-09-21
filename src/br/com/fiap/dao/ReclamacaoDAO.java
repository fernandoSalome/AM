package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import br.com.fiap.beans.Reclamacao;
import br.com.fiap.beans.Topico;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class ReclamacaoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public ReclamacaoDAO() throws Exception {
		con = Conexao.abrirConexao();
	}

	public String CriarReclamacao(Reclamacao rcl) throws Exception {
		stmt = con.prepareStatement(
				"INSERT INTO t_dbc_reclamacao(id_reclamacao,id_evento,ds_nome_adm,ds_nome_usuario,imagem) VALUES(?,?,?,?,?)");
		stmt.setInt(1, rcl.getIdReclamacao());
		stmt.setString(2, rcl.getNomeAdm());
		stmt.setString(3, rcl.getNomeUsuario());
		stmt.setString(4, rcl.getImagem());
		stmt.executeUpdate();
		return "Inserido com sucesso!";
	}
       public Reclamacao consultarPorId(int numero)throws Exception{
    	   stmt= con.prepareStatement
    			   ("SELECT * FROM t_dbc_reclamacao INNER JOIN t_dbc_evento ON (t_dbc_evento.id_evento=t_dbc_reclamacao.id_evento) WHERE ID_RECLAMACAO = ?");
           stmt.setInt(1, numero);
          
           stmt.executeQuery();
          Reclamacao rcl = new Reclamacao();
           if(rs.next()) {
        	   
        	   new Reclamacao(rs.getInt("ID_EVENTO"),
		    			new Usuario(
		    					rs.getInt("ID_USUARIO")
						),
				new Topico(
						rs.getInt("id_Topico")
						),
				rs.getString("dt_Abertura"),
				rs.getString("ds_Evento"),
				rs.getString("nm_evento"),
   			rs.getInt("ID_RECLAMACAO"),
   			rs.getString("ds_nome_adm"),
   		    rs.getString("ds_nome_usuario"),
   		    rs.getString("imagem")
   			);
           }
           rs.close();
           return rcl;
       }
       
       
	public List<Reclamacao> consultarNomeADM(String adm) throws  Exception{
		   List<Reclamacao> lista = new ArrayList<Reclamacao>();
		   
		   stmt = con.prepareStatement
				   (" SELECT  * FROM T_DBC_RECLAMACAO INNER t_dbc_evento JOIN ON (t_dbc_evento.id_evento=t_dbc_reclamacao.id_evento) WHERE ds_nome_adm like ?");
 		   stmt.setString(1,"%"+ adm  + "%");
 		   
 		  rs = stmt.executeQuery();
		    while(rs.next()) {
		    	lista.add(new Reclamacao(rs.getInt("ID_EVENTO"),
		    			new Usuario(
		    					rs.getInt("ID_USUARIO")
						),
				new Topico(
						rs.getInt("id_Topico")
						),
				rs.getString("dt_Abertura"),
				rs.getString("ds_Evento"),
				rs.getString("nm_evento"),
    			rs.getInt("ID_RECLAMACAO"),
    			rs.getString("ds_nome_adm"),
    		    rs.getString("ds_nome_usuario"),
    		    rs.getString("imagem")
    			));
						
		    	rs.close();
		    	stmt.executeQuery();

		    }
		    
		   return lista ;
	   }

	public int apagar(int numero) throws Exception {
		stmt = con.prepareStatement("delete from t_tbc_reclmacao where id_Reclamacao=?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}

	public int atualizararReclamacao(Reclamacao rec) throws Exception {
		stmt = con.prepareStatement("UPDATE T_DDD_RECLAMACAO SET ds_nome_adm=?,ds_nome_usuario=?,imagem=? WHERE ID_RECLAMACAO = ?");
		stmt.setString(1, rec.getNomeAdm());
		stmt.setString(2, rec.getNomeUsuario());
		stmt.setString(3, rec.getImagem());
		stmt.setInt(1, rec.getIdReclamacao());
		return stmt.executeUpdate();

	}

	public void fechar() throws Exception {
		stmt.close();
		con.close();
	}
}
