package com.bee.controller;

import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zrd
 * @E-mail 13552066077@163.com
 * @date 2021-5-18
 * @version 1.0
 * @Description Hello Controller
 */
@RestController
public class HelloController {
    /**
     * 在权限表中 | 访问资源需要角色 ROLE_1
     *
     * @return String
     */
    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    /**
     * 在权限表中 | 访问资源需要角色 ROLE_2
     *
     * @return String
     */
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    /**
     * 在权限表中 | 访问资源需要角色 ROLE_3
     *
     * @return String
     */
    @GetMapping("/hello3")
    public String hello3() {
        return "hello3";
    }

    /**
     * 在权限表中 | 允许匿名访问
     *
     * @return String
     */
    @GetMapping("/hello4")
    public String hello4() {
        return "hello4";
    }

    /**
     * 不在权限表中 | 匹配 /hello1/** | 访问资源需要 ROLE_1
     *
     * @return String
     */
    @GetMapping("/hello1/sub")
    public String hello1Sub() {
        return "hello1_sub";
    }

    /**
     * 不在权限表中 | 不匹配 /hello3 | 访问资源需要登录
     *
     * @return String
     */
    @GetMapping("/hello3/sub")
    public String hello3Sub() {
        return "hello3_sub";
    }

    /**
     * 在权限表中 | 访问资源不需要角色 | 访问资源需要登录
     *
     * @return String
     */
    @GetMapping("/hello5")
    public String hello5() {
        return "Hello5";
    }


    @GetMapping("/test/{group}/**/hello5")
    public String hello6( @PathVariable String group, HttpServletRequest request) {

//        final String path =
//                request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString();
//        final String bestMatchingPattern =
//                request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE).toString();
//        String arguments = new AntPathMatcher().extractPathWithinPattern(bestMatchingPattern, path);
//        String moduleName;
//        if (null != arguments && !arguments.isEmpty()) {
//            moduleName = group + '/' + arguments;
//        } else {
//            moduleName = group;
//        }
//        return "module name is: " + moduleName;
        return "module name is: " + group;
    }

}
