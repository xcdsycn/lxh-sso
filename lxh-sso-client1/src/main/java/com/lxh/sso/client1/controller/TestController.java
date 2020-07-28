package com.lxh.sso.client1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/normal")
    @PreAuthorize("hashAuthority('ROLE_NORMAL')")
    public String normal() {
        return "normal permission test success !!!";
    }

    @GetMapping("/medium")
    @PreAuthorize("hashAuthority('ROLE_MEDIUM')")
    public String medium() {
        return "medium permission test success !!!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hashAuthority('ROLE_ADMIN')")
    public String admin() {
        return "admin permission test success !!!";
    }
}
