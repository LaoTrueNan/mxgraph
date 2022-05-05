package com.ruoyi.sfc.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.sfc.service.ISFCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/sfc")
public class SFCController extends BaseController {

    private final ISFCService sfcService;

    @Autowired
    public SFCController(ISFCService sfcService) {
        this.sfcService = sfcService;
    }

    @PostMapping("/sfcdownloadxml")
    public void downloadXml(String prettyXml,HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        try {
            response.getOutputStream().write(prettyXml.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
