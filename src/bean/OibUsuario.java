package bean;
// Generated 14/08/2024 11:12:40 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OibUsuario generated by hbm2java
 */
@Entity
@Table(name = "oib_usuario", catalog = "db_oscar_iago"
)
public class OibUsuario implements java.io.Serializable {

    private int idOibUsuario;
    private String oibNome;
    private String oibApelido;
    private String oibCpf;
    private Date oibDatanascimento;
    private String oibSenha;
    private int oibNivel;
    private String oibAtivo;

    public OibUsuario() {
    }

    public OibUsuario(int idOibUsuario) {
        this.idOibUsuario = idOibUsuario;
    }

    public OibUsuario(int idOibUsuario, String oibNome, String oibApelido, String oibCpf, Date oibDatanascimento, String oibSenha, int oibNivel, String oibAtivo) {
        this.idOibUsuario = idOibUsuario;
        this.oibNome = oibNome;
        this.oibApelido = oibApelido;
        this.oibCpf = oibCpf;
        this.oibDatanascimento = oibDatanascimento;
        this.oibSenha = oibSenha;
        this.oibNivel = oibNivel;
        this.oibAtivo = oibAtivo;
    }

    @Id

    @Column(name = "id_oib_usuario", unique = true, nullable = false)
    public int getIdOibUsuario() {
        return this.idOibUsuario;
    }

    public void setIdOibUsuario(int idOibUsuario) {
        this.idOibUsuario = idOibUsuario;
    }

    @Column(name = "oib_nome", nullable = false, length = 45)
    public String getOibNome() {
        return this.oibNome;
    }

    public void setOibNome(String oibNome) {
        this.oibNome = oibNome;
    }

    @Column(name = "oib_apelido", nullable = false, length = 20)
    public String getOibApelido() {
        return this.oibApelido;
    }

    public void setOibApelido(String oibApelido) {
        this.oibApelido = oibApelido;
    }

    @Column(name = "oib_cpf", nullable = false, length = 14)
    public String getOibCpf() {
        return this.oibCpf;
    }

    public void setOibCpf(String oibCpf) {
        this.oibCpf = oibCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "oib_datanascimento", nullable = true, length = 10)
    public Date getOibDatanascimento() {
        return this.oibDatanascimento;
    }

    public void setOibDatanascimento(Date oibDatanascimento) {
        this.oibDatanascimento = oibDatanascimento;
    }

    @Column(name = "oib_senha", nullable = false, length = 15)
    public String getOibSenha() {
        return this.oibSenha;
    }

    public void setOibSenha(String oibSenha) {
        this.oibSenha = oibSenha;
    }

    @Column(name = "oib_nivel", nullable = false)
    public int getOibNivel() {
        return this.oibNivel;
    }

    public void setOibNivel(int oibNivel) {
        this.oibNivel = oibNivel;
    }

    @Column(name = "oib_ativo", nullable = false, length = 1)
    public String getOibAtivo() {
        return this.oibAtivo;
    }

    public void setOibAtivo(String oibAtivo) {
        this.oibAtivo = oibAtivo;
    }

}
