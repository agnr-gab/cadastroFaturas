public class Cliente {
    private String nome;
    private String email;
    private TipoCliente tipoCliente;

    public Cliente() {
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome, String email, TipoCliente tipoCliente) {
        this.nome = nome;
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " +nome);
        retorno.append("\tE-mail: " +email);
        retorno.append("\tDefinição da conta: " +tipoCliente);

        return retorno.toString();
    }
}
