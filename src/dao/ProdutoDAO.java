/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.OibProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Oscar Iago
 */
public class ProdutoDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(OibProduto.class);
        criteria.add(Restrictions.eq("id_oib_produto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibProduto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
        public List getNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibProduto.class);
        criteria.add(Restrictions.like("oibNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List getPreco(Double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(OibProduto.class);
        criteria.add(Restrictions.like("oibPreco", "%" + preco + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
