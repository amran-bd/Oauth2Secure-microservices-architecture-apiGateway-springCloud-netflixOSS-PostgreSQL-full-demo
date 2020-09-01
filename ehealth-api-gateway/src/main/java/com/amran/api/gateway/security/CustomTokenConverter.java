package com.amran.api.gateway.security;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Amran Hosssain on 6/23/2020
 */
@Slf4j
@Aspect
@Component
public class CustomTokenConverter extends JwtAccessTokenConverter {

    @Autowired private UserConfigMetaData userConfigMetaData;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        final Map<String, Object> additionalInfo = new HashMap<>();
        OAuth2AccessToken oAuth2AccessToken;
        additionalInfo.putAll(userConfigMetaData.getUserRelatedInformation(authentication.getName()));
        //If we want to Include information JWT Token then we used bellow line.
        //((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
        oAuth2AccessToken = super.enhance(accessToken, authentication);
        oAuth2AccessToken.getAdditionalInformation().putAll(additionalInfo);
        return oAuth2AccessToken;
    }
}
