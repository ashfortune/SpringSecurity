package kr.co.rland.boot3.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {


    @Bean
    public PasswordEncoder getBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UrlBasedCorsConfigurationSource corsConfigSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(Arrays.asList("http://localhost/"));
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//        source.setAllowCredentials(true);
        config.addAllowedHeader("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return source;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http,
            CorsConfigurationSource corsConfigSource) throws Exception {
        http
                .authorizeHttpRequests((auth) ->
                                auth
                                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                                .requestMatchers("/admin/**").authenticated()
//                                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN") // role여러개 지정가능
                                        .anyRequest().permitAll()

                );
        http
                .formLogin((formConfig) ->
                                formConfig
                                        .loginPage("/user/signin")
                                        .loginProcessingUrl("/signin")
                                        .defaultSuccessUrl("/index", true)
//                                .successForwardUrl("/")   // post요청
//                                .successHandler()  직접 역할자마다 커스텀해서 성공시 해당url 요청가능
                );

        http
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/")
                );

        http
                .csrf(AbstractHttpConfigurer::disable);

        http
                .cors(cors -> cors.configurationSource(corsConfigSource));


        return http.build();
    }


    //JDBC 를 이용한 사용자 목록
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//
//        /* -> 원하는 결과모양:
//        ┌────────────┐───────────┐────────────┐
//        │  username  │  password │   enabled  │
//        └────────────┘───────────┘────────────┘
//         */
//        String userSql = "select username,pwd password,1 enabled from member where username = ?";
//
//         /* -> 원하는 결과모양:
//        ┌────────────┐───────────┐
//        │  username  │ authority │
//        │ ashfortune │ROLE_ADMIN │
//        │ ashfortune │ROLE_ADMIN │
//         */
//        String rolesSql = "select username, 'ROLE_ADMIN' authority from member where username = ? ";
//
//        JdbcUserDetailsManager maneger = new JdbcUserDetailsManager(dataSource);
//
//        maneger.setUsersByUsernameQuery(userSql);
//        maneger.setAuthoritiesByUsernameQuery(rolesSql);
//
//
//        return maneger;
//    }


    // 메모리상의 고정된 사용자 목록
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.builder()
//                .username("yjb")
//                .password("{noop}1234")
//                .roles("ADMIN", "MEMBER")
//                .build();
//
//        UserDetails user2 = User.builder()
//                .username("jy")
//                .password("{noop}1234")
//                .roles("MEMBER")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(user1, user2);
//    }


}
