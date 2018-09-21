package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cronograma;
import br.com.fiap.dao.CronogramaDAO;
import br.com.fiap.execao.Execao;

public class TesteCronograma {
	public static void main(String[] args) {

		try {
			CronogramaDAO dao = new CronogramaDAO();
			Cronograma obj = new Cronograma();
			/*char pesq = JOptionPane
					.showInputDialog(
							"Digite:\n " + "<N> para pesquisar por Data o codigo ou \n " + "<C> para pesquisar por Código a data")
					.toUpperCase().charAt(0);
			while (pesq == 'C' || pesq == 'N') {
				if (pesq == 'C') {
					// Cliente obj = new ClienteDAO().consultarPorNumero(1);
					
					obj = dao.consultarPorId(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
					System.out.println("DATA: " + obj.getDtData());
				} else {
					
					List<Cronograma> obj1 = new ArrayList<Cronograma>();
					obj1 = dao.consultarPorData(JOptionPane.showInputDialog("Digite a data" ));
					
					for(Cronograma cro : obj1)
					System.out.println("ID "+  cro.getIdCronograma());
					}

				}*/
			
			/*obj.setIdCronograma(Integer.parseInt(JOptionPane.showInputDialog("ID")));
			obj.setDtData(JOptionPane.showInputDialog("Data"));
			System.out.println(dao.criarCronograma(obj));*/
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Execao.tratarExecao(e));
		} finally {

		}
	}
}
