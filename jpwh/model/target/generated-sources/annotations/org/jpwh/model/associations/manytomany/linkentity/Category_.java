package org.jpwh.model.associations.manytomany.linkentity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, Long> id;
	public static volatile SetAttribute<Category, CategorizedItem> categorizedItems;
	public static volatile SingularAttribute<Category, String> name;

}

