package org.oscm.identity.oidc.request;

import lombok.Getter;

public abstract class AuthorizationRequest {

    @Getter
    private String baseUrl;

    @Getter
    private String redirectUrl;

    @Getter
    private String clientId;

    @Getter
    private String responseType;

    @Getter
    private String responseMode;

    @Getter
    private String scope;

    @Getter
    private String nonce;

    public AuthorizationRequest baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public AuthorizationRequest redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public AuthorizationRequest clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public AuthorizationRequest responseType(String responseType) {
        this.responseType = responseType;
        return this;
    }

    public AuthorizationRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public AuthorizationRequest responseMode(String responseMode) {
        this.responseMode = responseMode;
        return this;
    }

    public AuthorizationRequest nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public abstract String buildUrl();

}