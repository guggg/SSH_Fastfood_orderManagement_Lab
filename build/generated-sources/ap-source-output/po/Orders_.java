package po;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orders.class)
public abstract class Orders_ {

	public static volatile SingularAttribute<Orders, Date> tDate;
	public static volatile SingularAttribute<Orders, Integer> amount;
	public static volatile SingularAttribute<Orders, Integer> price;
	public static volatile SingularAttribute<Orders, Integer> subtotal;
	public static volatile SingularAttribute<Orders, String> name;
	public static volatile SingularAttribute<Orders, Long> id;
	public static volatile SingularAttribute<Orders, String> customerName;

}

