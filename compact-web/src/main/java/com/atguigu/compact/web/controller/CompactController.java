package com.atguigu.compact.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.atguigu.htm.bean.LoanContract;
import com.atguigu.htm.service.CompactService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CompactController {
    private static final Logger LOGGER = Logger.getLogger(CompactController.class);
    @Reference
    private CompactService compactService;

    @RequestMapping("index")
    public String index(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("compactList")
    public String compactList(HttpServletRequest request){
        return "compactList";
    }

    @RequestMapping("queryCompactList")
    @ResponseBody
    public Map<String, Object> queryCompactList(@RequestParam Map<String,Object> params){

        return null;
    }

    private Map handlerResult(Integer total,List res){
        Map<String,Object> result = new HashMap<>();
        result.put("total",total);
        result.put("rows",res);
        return result;
    }

    private Map sumPageParam(Map params){
        Integer now = (Integer.parseInt((String) params.get("page"))-1)*Integer.parseInt((String) params.get("rows"));
        params.put("pageNo",now);
        params.put("pageSize",Integer.parseInt((String) params.get("rows")));
        return params;
    }

}
