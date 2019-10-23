package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author Matheus Makoto
 */
import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import javax.swing.table.AbstractTableModel;

public class NotaFiscalTable extends AbstractTableModel {

    private String[] columnNames = {"NumNota", " DescriçãoDoProduto ", "ValNota"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return NotaFiscalDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        
        NotaFiscal nota;
        nota = NotaFiscalDAO.linha(row);
        
        if (col == 0) {
            return nota.getNumNota();
        }
        if (col == 1) {
            return nota.getDescricaoProduto();
        }

        return nota.getValNota();
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
