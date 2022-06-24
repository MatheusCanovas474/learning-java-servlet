package br.com.alura.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        empresas.add(empresa2);
        empresas.add(empresa);
    }

    public void adiciona(Empresa empresa) {
        Banco.empresas.add(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return Banco.empresas;
    }
}
