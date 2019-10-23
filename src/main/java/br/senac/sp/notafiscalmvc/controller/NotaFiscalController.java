package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author Matheus Makoto
 */
public class NotaFiscalController {
    
    public static boolean salvar(int numeroNota, String descricaoProduto,double valorNota){
        System.out.println("Agora estou no controller");
        // Instanciar
        NotaFiscal NFiscal = new NotaFiscal();
        NFiscal.setNumNota(numeroNota);
        NFiscal.setDescricaoProduto(descricaoProduto);
        NFiscal.setValNota(valorNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(NFiscal);
        
        return true;
    }

}
