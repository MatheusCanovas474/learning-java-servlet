package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class RemoveEmpresa implements Acao{

    public String run(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("SERVICE | Removendo empresa da lista");

        Banco banco = new Banco();

        Integer id = Integer.valueOf(req.getParameter("id"));
        List<Empresa> empresas = banco.getEmpresas();

        for (Empresa empresa : empresas) {
            if (empresa.getId() == id)
                empresas.remove(empresa);
        }

        req.setAttribute("empresas", empresas);

        return "redirect:entrada?acao=ListaEmpresa";
    }

}
