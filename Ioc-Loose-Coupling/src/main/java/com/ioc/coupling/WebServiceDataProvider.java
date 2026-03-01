
package com.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    public String getUserDetails(){
        return "Fetch data from web service";
    }
}
