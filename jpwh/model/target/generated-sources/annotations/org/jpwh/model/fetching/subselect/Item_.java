package org.jpwh.model.fetching.subselect;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, Long> id;
	public static volatile SingularAttribute<Item, String> name;
	public static volatile SetAttribute<Item, Bid> bids;
	public static volatile SingularAttribute<Item, Date> auctionEnd;
	public static volatile SingularAttribute<Item, User> seller;

}

