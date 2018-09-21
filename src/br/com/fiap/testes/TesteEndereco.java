package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Topico;
import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.dao.TopicoDAO;
import br.com.fiap.execao.Execao;

public class TesteEndereco {
             public static void main(String[] args) {
				try {
					EnderecoDAO dao = new EnderecoDAO();
					Endereco obj = new Endereco();
					List<Topico> topicos = new ArrayList<Topico>();
					 /* char pesq = JOptionPane.showInputDialog
		    					("Digite:\n "
		    						+ "<N> para pesquisar por Nome ou \n "
		    						+ "<C> para pesquisar por Código").toUpperCase().charAt(0);
		    				while (pesq=='C' || pesq=='N') {
		    					if (pesq=='C') {
		    						//Cliente obj = new ClienteDAO().consultarPorNumero(1);
		    						
		    						
		    						obj = dao.consultarId(Integer.parseInt
		    								(JOptionPane.showInputDialog("Digite o código")));
		    						System.out.println(" \n" + obj.getAll());
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
		    			/*obj.setIdEndereco(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		    			obj.setLogradouro(JOptionPane.showInputDialog("Cadastre Endereco"));
		    			obj.setCidade(JOptionPane.showInputDialog("Cidade"));
		    			obj.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
		    			obj.setEstado(JOptionPane.showInputDialog("Estado"));
		    			obj.setComplemento(JOptionPane.showInputDialog("Complemento"));
		    			System.out.println(dao.criarEndereco(obj));*/
		    			
						
						
						/*System.out.println(dao.apagar(.parseInt(JOptionPane.showInputDialog("ID"))));*/
		    			obj= dao.consultarId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		    			obj.setLogradouro(JOptionPane.showInputDialog("Trocar Endereco"));
		    			obj.setCidade(JOptionPane.showInputDialog("Trocar Cidade"));
		    			obj.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Trocar Numero")));
		    			obj.setEstado(JOptionPane.showInputDialog("Trocar Estado"));
		    			obj.setComplemento(JOptionPane.showInputDialog("Trocar Complemento"));
		    			System.out.println(dao.trocarEndereco(obj));
		    			
		    			dao.fechar();
		    			
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(Execao.tratarExecao(e));
				}finally {
					
				}
			}
}
