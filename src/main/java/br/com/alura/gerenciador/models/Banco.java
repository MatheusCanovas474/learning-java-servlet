package br.com.alura.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        empresa.setId(chaveSequencial++);
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        empresa2.setId(chaveSequencial++);
        empresas.add(empresa2);
        empresas.add(empresa);
    }

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
}
