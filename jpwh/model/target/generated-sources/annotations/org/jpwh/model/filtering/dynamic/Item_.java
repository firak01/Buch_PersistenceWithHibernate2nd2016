package org.jpwh.model.filtering.dynamic;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, Long> id;
	public static volatile SingularAttribute<Item, Category> category;
	public static volatile SingularAttribute<Item, String> name;
	public static volatile SingularAttribute<Item, User> seller;

}

