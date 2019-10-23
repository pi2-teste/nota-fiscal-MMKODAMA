package br.senac.sp.notafiscalmvc.model;

/**
 *
 * @author Matheus Makoto
 */
public class NotaFiscal {
    double valNota;
    String descricaoProduto;
    int numNota;
    
    public NotaFiscal() {
        System.out.println("NOTA FISCAL");
    }
    
    public String getDescricaoProduto(){
        return descricaoProduto;
    }
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("Obj nota Recebe : ");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("Obj nota recebe : ");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    public void setDescricaoProduto(String descricaoProduto){
        System.out.print("Obj nota recebe : ");
        System.out.println(descricaoProduto);
        this.descricaoProduto = descricaoProduto;
    }
    
    
}