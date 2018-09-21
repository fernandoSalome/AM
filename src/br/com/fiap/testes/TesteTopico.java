package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import br.com.fiap.beans.Topico;

import br.com.fiap.dao.TopicoDAO;
import br.com.fiap.execao.Execao;

public class TesteTopico {
      public static void main(String[] args) {
		
    	  try {
    		  	TopicoDAO dao = new TopicoDAO();
				Topico obj = new Topico();
				List<Topico> topicos = new ArrayList<Topico>();
    		  
    		 /* char pesq = JOptionPane.showInputDialog
    					("Digite:\n "
    						+ "<N> para pesquisar por Nome ou \n "
    						+ "<C> para pesquisar por Código").toUpperCase().charAt(0);
    				while (pesq=='C' || pesq=='N') {
    					if (pesq=='C') {
    						//Cliente obj = new ClienteDAO().consultarPorNumero(1);
    						
    						obj = dao.consultarPorId(Integer.parseInt
    								(JOptionPane.showInputDialog("Digite o código")));
    						System.out.println("Nome: " + obj.getNomeCriador());
    					}else {
    						
    						topicos = new TopicoDAO().consultarPorNome
    								(JOptionPane.showInputDialog("Digite o nome")
    										);
    						for (Topico tpc  : topicos) {
    							System.out.println("ID..............: " + tpc.getIdTopico());
    							System.out.println("NomeCriador.....: " + tpc.getNomeCriador());
    							System.out.println("Topcio..........: " + tpc.getNomeTopico());
    						}
    					    							
    					}
    			
    				}*/
				
				obj = dao.consultarPorId(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
						obj.setNomeCriador(JOptionPane.showInputDialog("Digite o novo nome do topico"));
						obj.setNomeTopico(JOptionPane.showInputDialog("Digite o novo nome do criador"));
						
						System.out.println(dao.trocarTopico(obj));
				
    				
    			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Execao.tratarExecao(e));
		}finally {
			
		}
	}
}
