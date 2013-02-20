/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.oauth2.web;

import com.wadpam.oauth2.service.OAuth2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}")
public class OAuth2Controller {
    
    private OAuth2Service service;

    @RequestMapping(value="federated/v11", method={RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> registerFederated(
            @RequestParam String access_token, 
            @RequestParam String providerId,
            @RequestParam String providerUserId,
            @RequestParam(required=false) String secret,
            @RequestParam(required=false) Integer expires_in
            ) {
        
        ResponseEntity<String> res = service.registerFederated(access_token, 
                providerId, providerUserId, 
                secret, expires_in);
        
        return res;
    }

    @Autowired
    public void setService(OAuth2Service oauth2Service) {
        this.service = oauth2Service;
    }
    
    
}