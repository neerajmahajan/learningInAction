package org.customer.restful.bundle.impl;

import junit.framework.TestCase;
import org.customer.restful.bundle.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}