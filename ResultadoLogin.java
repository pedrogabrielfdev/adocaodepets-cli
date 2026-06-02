public class ResultadoLogin {
    private boolean loginT;
    private Pessoa pessoa;
    
    public ResultadoLogin(boolean loginT, Pessoa pessoa) {
        this.loginT = loginT;
        this.pessoa = pessoa;
    }

    public boolean isLoginT() {
        return loginT;
    }

    public void setLoginT(boolean loginT) {
        this.loginT = loginT;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
