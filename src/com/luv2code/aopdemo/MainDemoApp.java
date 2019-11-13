package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        theAccountDAO.addAccount(new Account("Madhu","Platinum"),true);

        theAccountDAO.doWork();
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");
        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();


        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();

        context.close();
    }
}
