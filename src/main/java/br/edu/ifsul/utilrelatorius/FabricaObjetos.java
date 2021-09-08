/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.utilrelatorius;

import br.edu.ifsul.model.Aluguel;
import br.edu.ifsul.model.Locatario;
import br.edu.ifsul.model.UnidadeCondominial;
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
        a.setId(1);
        a.setValor(500.89);
        a.setInicioContrato(Calendar.getInstance());
        a.setFimContrato(Calendar.getInstance());
        a.setDiaVencimento(23);
        UnidadeCondominial uc = new UnidadeCondominial();
        uc.setNumero("3435");
        a.setUnidadeCondominial(uc);
        Locatario l = new Locatario();
        l.setNome("Alexandre");
        a.setLocatario(l);
        lista.add(a);
        return lista;

    }
}
