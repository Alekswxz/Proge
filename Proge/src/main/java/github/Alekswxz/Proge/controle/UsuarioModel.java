package github.Alekswxz.Proge.controle;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "usuario")
public class UsuarioModel {
    @Id
    public Integer codigo;
    @Column(name = "nome", nullable = false, length = 50)
    public String nome;
    @Column(name = "login", nullable = false, length = 10)
    public String login;
    @Column(name = "senha", nullable = false, length = 10)
    public String senha;





    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
