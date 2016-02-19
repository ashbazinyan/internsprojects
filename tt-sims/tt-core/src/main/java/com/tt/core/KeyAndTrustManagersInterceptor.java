package com.tt.core;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.Conduit;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.log4j.Logger;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import java.io.FileInputStream;
import java.security.KeyStore;

public class KeyAndTrustManagersInterceptor extends
        AbstractPhaseInterceptor<Message> {
    private String keyStoreType;
    private String keyStoreFile;
    private String keyStorePassword;

    public KeyAndTrustManagersInterceptor() {
        super(Phase.PREPARE_SEND);
    }

    public void handleMessage(Message message) throws Fault {
        System.out.printf("test");
    }

    public void setKeyStoreType(String keyStoreType) {
        if (keyStoreType == null)
            throw new IllegalArgumentException("keyStoreType must not be null");
        this.keyStoreType = keyStoreType;
    }

    public void setKeyStoreFile(String keyStoreFile) {
        if (keyStoreFile == null)
            throw new IllegalArgumentException("keyStoreFile must not be null");
        this.keyStoreFile = keyStoreFile;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        if (keyStorePassword == null)
            throw new IllegalArgumentException(
                    "keyStorePassword must not be null");
        this.keyStorePassword = keyStorePassword;
    }

}