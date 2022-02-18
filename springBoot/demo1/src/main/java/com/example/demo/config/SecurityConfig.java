package com.example.demo.config;


import com.example.demo.jwt.AuthTokenFilter;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter() {
        return new AuthTokenFilter();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO configure authentication manager
        auth.userDetailsService(userServiceImpl).passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


//
////    @Bean
////    public UserDetailsService userDetailsService() {
////        return new iUserService();
////    }
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//        auth.setUserDetailsService(userService);
//        auth.setPasswordEncoder(passwordEncoder());
//        return auth;
//    }
//
//    // Token stored in Memory (Of Web Server).
//    @Bean
//    public PersistentTokenRepository persistentTokenRepository() {
//        return new InMemoryTokenRepositoryImpl();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO configure web security

        // Enable CORS and disable CSRF
        http.cors().and().csrf().disable();

        // Set session management to stateless
//        http.sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and();

        // Set unauthorized requests exception handler
        http.exceptionHandling()
                .authenticationEntryPoint(
//                        (request, response, ex) -> {
//                            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getMessage());
//                        }
                        authenticationEntryPoint
                )
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);// Set session management to stateless

//        http.authorizeRequests()
//                .antMatchers("/login").permitAll()      // không check authen trên link "login"
//                .antMatchers("/sign-up**", "/forgot**", "/reset**", "/js/**", "/css/**", "/img/**").permitAll().antMatchers("/").permitAll()    // chỉ cho phép các user có GrantedAuthority là ROLE_roleName mới được phép truy cập
//                .antMatchers("/user").hasRole("ROLE_USER")     // chỉ cho phép các user có GrantedAuthority là ROLE_roleName mới được phép truy cập
//                .antMatchers("/admin").hasRole("ROLE_ADMIN").anyRequest().authenticated()                       // check authen trên tất cả các link khác
//                .and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/chat") // sau khi login thành công
//                .and().logout().invalidateHttpSession(true).clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout").permitAll()
//                .and().exceptionHandling().accessDeniedPage("/403").and().rememberMe().tokenValiditySeconds(604800);//luu trong 7 ngay
////                .userDetailsService(userService);
        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);

//           .rememberMe().key("rem-me-key").rememberMeParameter("remember") // it is name of checkbox at login page
//                .rememberMeCookieName("rememberlogin") // it is name of the cookie
//                .tokenValiditySeconds(100); // remember for number of seconds
    }




}