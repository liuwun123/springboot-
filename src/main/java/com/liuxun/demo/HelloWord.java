package com.liuxun.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.liuxun.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWord {

    @Autowired
    private GirlProperties girlProperties;

    /*@RequestMapping(value = {"/say","/hi"},method = RequestMethod.GET)*/
    @GetMapping(value="/say")
    public Map<String, Object> sayHellWord(@RequestParam(value = "id",required = false,defaultValue = "01")  Long id){
        Map<String,Object> jsonMap = new HashMap<>();
            if(id==1l ){
                jsonMap.put("code",602);
                jsonMap.put("msg","id为默认值");
            }else {
                jsonMap.put("code", 601);
                jsonMap.put("msg", "id已传:" + id);
            }
            return jsonMap;
        }
}
