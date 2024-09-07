package entidades;

public class Assento {

    private boolean[][] disponivel;

    public Assento(){
        this.disponivel = new boolean[5][4];
    }

    public boolean isDisponivel(int linha, int coluna){
        return this.disponivel[linha][coluna];
    }

    public String mostraLugares(){
        String retorno = "Os lugares marcados com (X) estão ocupados\n";
        for(int i=0; i<disponivel.length;i++){
            for(int j = 0; j<disponivel[i].length; j++){
                if(isDisponivel(i, j)){
                    retorno += "|X|";
                }else{
                    retorno += "| |";
                }
            }
            retorno+="\n";
        }
        return retorno;
    }

    public boolean venda(int linha, int coluna){
        if(!isDisponivel(linha, coluna)){
            this.disponivel[linha][coluna] = true;
            return true;
        }
        return false;
    }
    
}
