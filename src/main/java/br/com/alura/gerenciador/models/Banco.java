package br.com.alura.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas = new ArrayList<>();
    private static Integer chaveSequencial = 0;

    private static List<Usuario> listaUsuarios = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        empresa.setId(chaveSequencial++);
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        empresa2.setId(chaveSequencial++);
        empresas.add(empresa2);
        empresas.add(empresa);

        Usuario usuario1 = new Usuario();
        usuario1.setLogin("matheus");
        usuario1.setSenha("2804");

        Usuario usuario2 = new Usuario();
        usuario2.setLogin("livia");
        usuario2.setSenha("2804");

        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
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

    public Empresa buscaEmpresaById(Integer id) {
        for (Empresa empresa :
                empresas) {
            if (id == empresa.getId())
                return empresa;
        }
        return null;
    }
}
