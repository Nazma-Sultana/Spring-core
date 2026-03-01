
package com.ioc.coupling;

import com.ioc.coupling.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {


        //creating an object of an interface and assigning object of the class here
//        UserDataProvider databaseProvider = new UserDataBaseProvider();
        //here we are not instantiating an object but getting as bean over here!
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");
        UserManager userManagerWithDB = (UserManager) context.getBean(("userManagerWithUserDataProvider"));
        System.out.println(userManagerWithDB.getUserInfo());

        //UserDataProvider webServiceProvider = new WebServiceDataProvider();

        //UserManager userManagerWithWS = new UserManager(webServiceProvider);
        UserManager userManagerWithWS= (UserManager) context.getBean("userManagerWithWebServiceDataProvider");

        System.out.println(userManagerWithWS.getUserInfo());
    }
}
