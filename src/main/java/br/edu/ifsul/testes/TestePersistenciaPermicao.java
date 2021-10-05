/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.model.Pessoa;
import br.edu.ifsul.model.Permissao;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio
 */
public class TestePersistenciaPermicao implements Serializable{
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-2021-1-Trabalho2-modelPU");
        EntityManager em = emf.createEntityManager();
        Permissao admin = new Permissao();
        admin.setNome("ADMINISTRADOR");
        admin.setDescricao("Permissão com poderes irrestritos");
        Permissao user = new Permissao();
        user.setNome("USUARIO");
        user.setDescricao("Permissão comum");           
               
        
        em.getTransaction().begin();
        em.persist(admin);
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
