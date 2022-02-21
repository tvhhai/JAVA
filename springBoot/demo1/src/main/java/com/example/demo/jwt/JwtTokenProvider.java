package com.example.demo.jwt;

import com.example.demo.service.impl.CustomUserDetailImpl;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;


@Component
@Slf4j
public class JwtTokenProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenProvider.class);

    @Value("${jwt.secret}")
    private String jwtSecretKey;

    @Value("${jwt.expiration}")
    private long jwtExpiration;

    public String generateJwtToken(Authentication authentication) throws UnsupportedEncodingException {
        CustomUserDetailImpl userPrincipal = (CustomUserDetailImpl) authentication.getPrincipal();

        return Jwts.builder()
//                .setClaims(userPrincipal.getUsername())
                .setSubject(userPrincipal.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration ))
                .signWith(SignatureAlgorithm.HS256, jwtSecretKey)
                .compact();
    }

    public String getUsernameFromToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(token).getBody().getSubject();
//        return getClaimFromToken(token, Claims::getSubject);
    }


    public boolean validateToken(String authToken){
        try {
            Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e){
            LOGGER.error("Invalid JWT Signature: {}", e.getMessage());
        } catch (MalformedJwtException e){
            LOGGER.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e){
            LOGGER.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e){
            LOGGER.error("JWT token is Unsupported : {}", e.getMessage());
        } catch (IllegalArgumentException e){
            LOGGER.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }


















}
