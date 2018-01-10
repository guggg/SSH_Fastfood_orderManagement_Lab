package dao;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import po.Fastfood;

public class FastfoodDAO extends HibernateDaoSupport {
    
    public Fastfood create(Fastfood food) {
        getHibernateTemplate().setCheckWriteOperations(false);
        getHibernateTemplate().save(food);
        return food;
    }
    
    public List<Fastfood> query() {
        List list = getHibernateTemplate().find("from Fastfood", null);
        return list;    
    }
    
    public Fastfood get(long id) {
        List list = getHibernateTemplate().find("from Fastfood where id=?", 
                new Long[]{id});
        if (list.size() >= 1) {
            return (Fastfood) list.get(0);
        } else {
            return null;
        }
    }
    
    public boolean update(Fastfood fastFood) {
        getHibernateTemplate().bulkUpdate("Update Fastfood SET name=?, price=?, amount=? where id=?", 
                new Object[]{fastFood.getName(), fastFood.getPrice(), fastFood.getAmount(), fastFood.getId()});
        return true;
    }
    
    public boolean delete(long id) {
        getHibernateTemplate().bulkUpdate("Delete Fastfood Food where id=?", 
                new Long[]{id});
        return true;
    }
    
}
