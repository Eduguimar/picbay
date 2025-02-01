package dev.edu.picbay.dominio.entidades;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica() {}

    public PessoaFisica(Long id, String nome, String email, String senha, String cpf) {
        super(id, nome, email, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
