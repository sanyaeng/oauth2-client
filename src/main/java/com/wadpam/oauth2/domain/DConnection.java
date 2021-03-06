package com.wadpam.oauth2.domain;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import net.sf.mardao.core.domain.AbstractStringEntity;

/**
 * access_token is primary key
 * @author sosandstrom
 */
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"refreshToken"})})
public class DConnection extends AbstractStringEntity {
    
    /** Specify for each provider what this property contains.
     * For Salesforce, it is instance_url
     */
    @Basic
    private String appArg0;
    
    @Basic
    private String displayName;
    
    @Basic
    private Date expireTime;
    
    @Basic
    private String imageUrl;
    
    @Basic
    private String profileUrl;
    
    @Basic
    private String providerId;

    @Basic
    private String providerUserId;
    
    @Basic
    private String refreshToken;
    
    @Basic
    private String secret;
    
    @Basic
    private String userId;
    
    /** Comma-separated String, populated by registerFederated() */
    @Basic
    private String userRoles;

    @Override
    public String subString() {
        return String.format("%s, userId=%s, appArg0=%s, userRoles=%s", 
                super.subString(), userId, appArg0, userRoles);
    }

    public String getAccessToken() {
        return getId();
    }

    public void setAccessToken(String accessToken) {
        setId(accessToken);
    }

    public String getAppArg0() {
        return appArg0;
    }

    public void setAppArg0(String appArg0) {
        this.appArg0 = appArg0;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

}
