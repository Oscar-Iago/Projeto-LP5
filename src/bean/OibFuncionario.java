package bean;
// Generated 14/08/2024 11:12:40 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OibFuncionario generated by hbm2java
 */
@Entity
@Table(name = "oib_funcionario",
        catalog = "db_oscar_iago"
)
public class OibFuncionario implements java.io.Serializable {

    private int idOibFuncionario;
    private String oibNome;
    private String oibSobrenome;
    private String oibCpf;
    private Date oibDatanascimento;
    private String oibTelefone;
    private String oibFuncao;

    public OibFuncionario() {
    }

    public OibFuncionario(int idOibFuncionario) {
        this.idOibFuncionario = idOibFuncionario;

    }

    public OibFuncionario(int idOibFuncionario, String oibNome, String oibSobrenome, String oibCpf, Date oibDatanascimento, String oibTelefone, String oibFuncao) {
        this.idOibFuncionario = idOibFuncionario;
        this.oibNome = oibNome;
        this.oibSobrenome = oibSobrenome;
        this.oibCpf = oibCpf;
        this.oibDatanascimento = oibDatanascimento;
        this.oibTelefone = oibTelefone;
        this.oibFuncao = oibFuncao;

    }

    @Id

    @Column(name = "id_oib_funcionario", unique = true, nullable = false)
    public int getIdOibFuncionario() {
        return this.idOibFuncionario;
    }

    public void setIdOibFuncionario(int idOibFuncionario) {
        this.idOibFuncionario = idOibFuncionario;
    }

    @Column(name = "oib_nome", nullable = false, length = 45)
    public String getOibNome() {
        return this.oibNome;
    }

    public void setOibNome(String oibNome) {
        this.oibNome = oibNome;
    }

    @Column(name = "oib_sobrenome", nullable = false, length = 45)
    public String getOibSobrenome() {
        return this.oibSobrenome;
    }

    public void setOibSobrenome(String oibSobrenome) {
        this.oibSobrenome = oibSobrenome;
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

    @Column(name = "oib_telefone", nullable = false, length = 15)
    public String getOibTelefone() {
        return this.oibTelefone;
    }

    public void setOibTelefone(String oibTelefone) {
        this.oibTelefone = oibTelefone;
    }

    @Column(name = "oib_funcao", nullable = false, length = 15)
    public String getOibFuncao() {
        return this.oibFuncao;
    }

    public void setOibFuncao(String oibFuncao) {
        this.oibFuncao = oibFuncao;
    }

    @Override
    public String toString() {
        return this.oibNome;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof OibFuncionario) {
            OibFuncionario oibFuncionario = (OibFuncionario) object;
            if (this.getIdOibFuncionario() == oibFuncionario.getIdOibFuncionario()) {
                return true;
            }
        }
        return false;
    }

}
