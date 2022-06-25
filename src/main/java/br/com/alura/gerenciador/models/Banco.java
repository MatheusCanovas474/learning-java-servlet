package br.com.alura.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas = new ArrayList<>();
    private static Integer chaveSequencial = 0;

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.empresas.add(empresa);
    }

    public void remove(Empresa empresa) {
        Banco.empresas.remove(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return Banco.empresas;
    }

    public Empresa buscaEmpresaById(Integer id) {
        for (Empresa empresa :
                empresas) {
            if (id == empresa.getId())
                return empresa;
        }
        return null;
    }
}
