package com.ylz.cdr.write.conf;

import com.ylz.cdr.write.pre.tool.JSONHelper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class XdsConfig {

    private JSONObject typeJson = new JSONObject();

    private JSONObject categoryJson = new JSONObject();

    @PostConstruct
    public void init() {
        JSONObject jsonObject = JSONHelper.ResolveJsonFileToObject("jdy/config.json");
        if (null == jsonObject) {
            return;
        }
        JSONObject cdaTypeJson = jsonObject.getJSONObject("cdaType");
        for (Object key : cdaTypeJson.keySet()) {
            JSONArray jsonArray = cdaTypeJson.getJSONArray(String.valueOf(key));
            int size = jsonArray.size();
            for (int i = 0; i < size; i++) {
                typeJson.put(jsonArray.getString(i), key);
            }
        }
        categoryJson = jsonObject.getJSONObject("category");
    }

    public JSONObject getCategoryJson() {
        return categoryJson;
    }

    public JSONObject getTypeJson() {
        return typeJson;
    }
}
