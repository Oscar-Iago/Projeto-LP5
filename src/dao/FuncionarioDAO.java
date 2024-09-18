/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.OibFuncionario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Oscar Iago
 */
public class FuncionarioDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibFuncionario.class);
        criteria.add(Restrictions.eq("id_oib_funcionario", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibFuncionario.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List getNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibFuncionario.class);
        criteria.add(Restrictions.like("oibNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List getFuncao(String funcao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibFuncionario.class);
        criteria.add(Restrictions.like("oibFuncao", "%" + funcao + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

        public List getNomeFuncao(String nome, String funcao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibFuncionario.class);
        criteria.add(Restrictions.like("oibNome", "%" + nome + "%"));
        criteria.add(Restrictions.like("oibFuncao", "%" + funcao + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }
    
}
