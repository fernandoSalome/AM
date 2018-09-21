package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Cronograma;
import br.com.fiap.beans.ReservaSalaoFesta;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class ReservaSalaoFestaDAO {
 
 private Connection con ;
 private PreparedStatement stmt; 
 private ResultSet rs;
 
        public ReservaSalaoFestaDAO() throws Exception{
        	con = Conexao.abrirConexao();
        }
       
        public  String criarReserva(ReservaSalaoFesta rsl)throws Exception{
           stmt = con.prepareStatement
        		   ("INSERT INTO  t_dbc_reserva_sala_festa (id_reserva,dt_reserva,dt_hora_reserva,) values(?,?,?)");
            stmt.setInt(1, rsl.getIdReserva());
            stmt.setString(2, rsl.getDtReserva());
            stmt.setString(3, rsl.getDtHoraReserva());
            
           stmt.executeUpdate();
            return "Inserido com sucesso";
        }
        public ReservaSalaoFesta consultarId(int numero)throws Exception{
        	stmt = con.prepareStatement
        			("SELECT * FROM T_DBC_reserva_sala_festa INNER JOIN T_DBC_USUARIO ON(t_dbc_usuario.id_usuario=T_DBC_reserva_sala_festa.id_usuario)"
        					+ "INNER JOIN T_DBC_CRONOGRAMA ON(T_DBC_CRONOGRAMA.ID_CRONOGRAMA=T_DBC_reserva_sala_festa.ID_CRONOGRAMA where id_reserva_sala_festa = ?");
        	         stmt.setInt(1, numero);
        	         rs = stmt.executeQuery();
                   ReservaSalaoFesta rsv = new ReservaSalaoFesta();
                   if(rs.next()) {
                	   rsv.setIdReserva(rs.getInt("ID_reserva"));
           			rsv.setIdCronograma(new Cronograma(
           					rs.getInt("ID_cronograma"),
           					rs.getString("dt_data")
           					));
           			rsv.setIdUsuario(new Usuario(
           					rs.getInt("ID_USUARIO")
           					));
                   }
                   rs.close();		
           		return rsv;
         }
        public int atualizarDtReserva(ReservaSalaoFesta reserva)throws Exception{
        	stmt = con.prepareStatement
        			("UPDATE T_DBC_ReservaSalaoFesta SET dt_reserva=?, dt_hora_reserva=? WHERE id_reserva=?");
        	stmt.setString(1, reserva.getDtReserva());
        	stmt.setString(2, reserva.getDtHoraReserva());
        	stmt.setInt(3, reserva.getIdReserva());
        	return stmt.executeUpdate();
        }
        public int deletar(int numero)throws Exception{
        	stmt = con.prepareStatement
        			("DELETE FROM T_dBC_ReservaSalaoFesta where id_ReservaSalaoFesta");
        	stmt.setInt(1, numero);
        	return stmt.executeUpdate();
        }
        public void fechar()throws Exception{
			stmt.close();
			con.close();
		}

        
}