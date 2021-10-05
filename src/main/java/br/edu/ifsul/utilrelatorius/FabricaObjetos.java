/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.utilrelatorius;

import br.edu.ifsul.model.Aluguel;
import br.edu.ifsul.model.Locatario;
import br.edu.ifsul.model.Mensalidades;
import br.edu.ifsul.model.UnidadeCondominial;
import br.edu.ifsul.model.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Eduar
 */
public class FabricaObjetos {

    public static List<Aluguel> carregaAluguel() {
        List<Aluguel> lista = new ArrayList<>();
        Aluguel a = new Aluguel();
        a.setId(5);
        a.setValor(400.44);
        a.setInicioContrato(Calendar.getInstance());
        a.setFimContrato(Calendar.getInstance());
        a.setDiaVencimento(23);
        UnidadeCondominial uc = new UnidadeCondominial();
        uc.setNumero("3435");
        a.setUnidadeCondominial(uc);
        Locatario l = new Locatario();
        l.setNome("Stephan");
        a.setLocatario(l);
        
        Usuario u = new Usuario();
        
        u.setNome("Alexandre");
        
        a.setNome_usuario(u);
        
       
        Mensalidades m = new Mensalidades();
        
        m.setValor(500.98);
        m.setVencimento(Calendar.getInstance());
        m.setValorPagamento(600.56);
        m.setDataPagamento(Calendar.getInstance());
        m.setAluguel(a);
        
        a.getListMensalidades().add(m);
        
        lista.add(a);
        return lista;

    }
}
