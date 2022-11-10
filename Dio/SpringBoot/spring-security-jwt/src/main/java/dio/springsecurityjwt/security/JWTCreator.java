package dio.springsecurityjwt.security;

import io.jsonwebtoken.*;

import java.util.List;
import java.util.stream.Collectors;

public class JWTCreator {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String key, JTWObject jtwObject){
        String token = Jwts.builder().setSubject(jtwObject.getSubject()).setIssuedAt(jtwObject.getIssuedAt()).setExpiration(jtwObject.getExpiration())
                .claim(ROLES_AUTHORITIES, checkRoles(jtwObject.getRoles())).signWith(SignatureAlgorithm.HS512, key).compact();
        return prefix + " " + token;
    }

    public static JTWObject create(String token,String prefix,String key) throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException{
        JTWObject object = new JTWObject();
        token = token.replace(prefix,"");
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        object.setSubject(claims.getSubject());
        object.setExpiration(claims.getExpiration());
        object.setIssuedAt(claims.getIssuedAt());
        object.setRoles((List) claims.get(ROLES_AUTHORITIES));
        return object;
    }

    private static List<String> checkRoles(List<String> roles){
        return roles.stream().map(s -> "ROLE_".concat(s.replaceAll("ROLE_", ""))).collect(Collectors.toList());
    }
}
