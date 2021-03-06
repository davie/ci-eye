package org.netmelody.cieye.core.observation;

public interface Contact {

    <T> T makeJsonRestCall(String url, Class<T> type);

    void performBasicLogin(String loginUrl);

    void performBasicAuthentication(String username, String password);

    void doPost(String url);

    void doPut(String url, String content);

}