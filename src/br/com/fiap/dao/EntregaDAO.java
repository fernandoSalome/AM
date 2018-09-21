package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Entrega;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class EntregaDAO {
	private Connection con ;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public EntregaDAO() throws Exception{
		con=Conexao.abrirConexao();		
	}
	public String criarPacote(Entrega pct)throws Exception{
		stmt=con.prepareStatement
				("INSERT INTO T_DBC_ENTREGA (id_entrega ,id_usuario ,dt_entrega ,ds_pacote ,nm_remetente ,qt_entregas_espera) values (?,?,?,?,?,?)");
		stmt.setInt(1, pct.getIdEntrega());
		stmt.setInt(2, pct.getIdUsuario().getIdUsuario());
		stmt.setString(3, pct.getDtEntrega());
		stmt.setString(4, pct.getDsPacote());
		stmt.setString(5, pct.getRemetente());
		stmt.setInt(6, pct.getEntregasEspera());
		stmt.executeUpdate();
		return "Inserido com sucesso";
	}
	public Entrega consultarPorId(int numero) throws Exception{
		stmt=con.prepareStatement
				("SELECT * FROM T_DBC_ENTREGA INNER JOIN T_DBC_USUARIO ON (T_DBC_USUARIO.ID_USUARIO=T_DBC_ENTREGA.ID_USUARIO) WHERE ID_ENTREGA=?");
		stmt.setInt(1, numero);
		rs=stmt.executeQuery();
		Entrega pct=new Entrega();
		if(rs.next()) {
			pct.setAll(
					rs.getInt("ID_ENTREGA"),
					new Usuario(
							rs.getInt("ID_USUARIO")
							),
					rs.getString("DT_ENTREGA"),
					rs.getString("NM_REMETENTE"),
					rs.getString("DS_PACCOTE"),
					rs.getInt("QT_ENTREGAS_ESPERA"));			
		}
		rs.close();
		return pct;		
	}
	public List<Entrega> consultarPorData(String dt) throws Exception{
		List<Entrega> lista=new ArrayList<Entrega>();
		stmt=con.prepareStatement
				("SELECT * FROM T_DBC_ENTREGA INNER JOIN T_DBC_USUARIO ON (T_DBC_USUARIO.ID_USUARIO=T_DBC_ENTREGA.ID_USUARIO) WHERE DT_ENTREGA LIKE ?");
		stmt.setString(1, dt);
		rs=stmt.executeQuery();
		while(rs.next()) {
			lista.add(new Entrega(
					rs.getInt("ID_ENTREGA"),
					new Usuario(
							rs.getInt("ID_USUARIO")
							),
					rs.getString("DT_ENTREGA"),
					rs.getString("NM_REMETENTE"),
					rs.getString("DS_PACCOTE"),
					rs.getInt("QT_ENTREGAS_ESPERA")
					));			
		}
		rs.close();
		return lista;
	}
	public int atualizarDescricao(int numero)throws Exception{
		stmt = con.prepareStatement
 				("UPDATE T_DBC_ENTREGA SET  ds_pacote WHERE ID_ENTREGA = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
		}
	public int deletar(int numero)throws Exception{
		stmt = con.prepareStatement
				("DELETE * FROM T_DBC_ENTREGA WHERE ID_ENTREGA = ?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}
	 public void fechar()throws Exception{
			stmt.close();
			con.close();
		}

}
