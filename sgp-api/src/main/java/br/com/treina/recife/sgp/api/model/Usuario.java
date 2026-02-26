package br.com.treina.recife.sgp.api.model;

import java.time.LocalDate;

import br.com.treina.recife.sgp.api.enums.StatusUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_USUARIOS")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // BIGINT PRIMARY KEY AUTO_INCREMENT

    /*Pata ser obrigatorio (NOT NULL) 
    VARCHAR(50) NOT NULL*/
    @Column(nullable=false, length = 50)
    private String nome;

    // VARCHAR(11) NOT NULL UNIQUE
    @Column(nullable=false, length = 11, unique = true)
    private String cpf;

    // VARCHAR(19) NOT NULL
    @Column(nullable=false, unique = true)
    private String email;

    // VARCHAR(19) NOT NULL
    @Column(nullable=false , length=19)
    private String senha;

    // DATETIME NOT NULL
    @Column(nullable=false)
    private LocalDate dataNascimento;

    //
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusUsuario status;


}
    /* 
    public Usuario() {

    }

    public Usuario(String cpf, LocalDate dataNascimento, String email, Long id, String nome, String senha, String status) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.status = status;
    }

    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    

}
*/