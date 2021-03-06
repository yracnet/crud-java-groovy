/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.yracnet.gen.spec;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yracnet
 */
public class FactoryImpl extends FactoryAbstract {

    public Map createReactPage(String name) {
        Map map = new HashMap();
        String nameSufix = upperFirst(name);
        map.put("name", nameSufix + "Page");
        map.put("create", nameSufix + "Create");
        map.put("update", nameSufix + "Update");
        map.put("remove", nameSufix + "Remove");
        map.put("detail", nameSufix + "Detail");
        map.put("search", nameSufix + "Search");
        map.put("proc01", nameSufix + "Proc01");
        map.put("inbox", nameSufix + "Inbox");
        map.put("crud", nameSufix + "CRUD");
        map.put("path", toPath(nameSufix) + "/page");
        return map;
    }

    public Map createReactPage(String name, String classifier) {
        Map map = new HashMap();
        name = toName(name + classifier);
        String nameSufix = upperFirst(name);
        map.put("name", nameSufix);
        map.put("logic", nameSufix + "Logic");
        map.put("state", nameSufix + "State");
        map.put("props", nameSufix + "Props");
        map.put("event", nameSufix + "Event");
        map.put("path", toPath(nameSufix) + "/page");
        map.put("url", toPath(nameSufix));
        return map;
    }

    public Map createReactPart(String name) {
        Map map = new HashMap();
        name = toName(name);
        String nameSufix = upperFirst(name);
        map.put("name", nameSufix + "Part");
        map.put("form", nameSufix + "Form");
        map.put("view", nameSufix + "View");
        map.put("query", nameSufix + "Query");
        map.put("table", nameSufix + "Table");
        map.put("path", toPath(nameSufix) + "/part");
        return map;
    }

    public Map createReactPart(String name, String classifier) {
        Map map = new HashMap();
        name = toName(name + classifier);
        String nameSufix = upperFirst(name);
        map.put("name", nameSufix);
        map.put("logic", nameSufix + "Logic");
        map.put("state", nameSufix + "State");
        map.put("props", nameSufix + "Props");
        map.put("event", nameSufix + "Event");
        map.put("path", toPath(nameSufix) + "/part");
        return map;
    }

    public Map createReactModel(String name) {
        Map map = new HashMap();
        name = toName(name);
        String nameSufix = upperFirst(name);
        map.put("name", nameSufix + "Model");
        map.put("text", toText(nameSufix) );
        map.put("data", nameSufix);
        map.put("filter", nameSufix + "Filter");
        map.put("message", nameSufix + "Message");
        map.put("validate", nameSufix + "Validate");
        map.put("path", toPath(nameSufix));
        return map;
    }

    public Map createReactRest(String name) {
        Map map = new HashMap();
        name = toName(name);
        String nameSufix = upperFirst(name);
        String varName = lowerFirst(name);
        map.put("name", nameSufix + "Rest");
        map.put("ping", varName);
        map.put("create", varName + "Create");
        map.put("update", varName + "Update");
        map.put("remove", varName + "Remove");
        map.put("filter", varName + "Filter");
        map.put("query", varName + "Query");
        map.put("path", toPath(nameSufix));
        return map;
    }

}
