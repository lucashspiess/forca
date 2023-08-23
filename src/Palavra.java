class Palavra extends ItemParaArmazenar{
    protected String palavra;
    protected int qtd_letras;
    protected String tema;

    Palavra(String palavra, int qtd_letras, String tema){
        this.palavra = palavra;
        this.qtd_letras = qtd_letras;
        this.tema = tema;
    }

    public boolean temLetra(char letra){
        if(palavra.indexOf(letra) != -1){
            return true;
        }else{
            return false;
        }    
    }

    public int posicaoLetra(char letra){
        return palavra.indexOf(letra);
    }

    public char letra(int posicao){
        return palavra.charAt(posicao);
    }

    public void setPalavra(String palavra){
        this.palavra = palavra;
    }

    public String getPalavra(){
        return this.palavra;
    }

    public void setQtd_letras(int qtd_letras){
        this.qtd_letras = qtd_letras;
    }

    public int getQtd_letras(){
        return this.qtd_letras;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public String getTema(){
        return this.tema;
    }

    @Override
    public boolean igual(ItemParaArmazenar ipa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'igual'");
    }
}