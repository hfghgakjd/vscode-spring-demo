package com.snowfog.controller;

import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 首页控制器
 *
 * @author 邵静
 */
@RestController(value = "indexController")
@RequestMapping("/api/snowfog/demo")
public class IndexController extends AbstractController {

    /**
     * 构造函数
     * @author 邵静
     */
    public IndexController() {
        super();
    }

    /**
     * 首页内容
     *
     * @return {@link String}
     * @author 邵静
     */
    @RequestMapping(value = {"/test", "/"}, method = RequestMethod.GET, produces = {
            "application/json;charset=utf-8"})
    public String index() {
        Map<String, Object> params = new HashMap<>();
        params.put("test", "测试");
        params.put("hello", "你好!");

        Map<String, Object> result = new HashMap<>();
        result.put("name", "邵静");
        result.put("value", "世界!");
        List<Map<String, Object>> resultList = new ArrayList<>();
        resultList.add(params);
        resultList.add(result);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", resultList);

        LOGGER.error("错误: {}", resultMap);
        return new GsonBuilder().create().toJson(resultMap);
    }
}
