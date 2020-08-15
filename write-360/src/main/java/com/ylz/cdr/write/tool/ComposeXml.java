package com.ylz.cdr.write.tool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class ComposeXml {

    private static final Logger log = LoggerFactory.getLogger(ComposeXml.class);


    public static String getAnnex(String path, String sysUniqueId, String uniqueId, String annexPrefix) {
        String suffix = path.substring(path.indexOf("/"));
        String annexPath = new StringBuffer().append(annexPrefix).append(sysUniqueId).append("/").append(uniqueId).append("_").append(UUID.randomUUID().toString()).append(suffix).toString();
        return annexPath;
    }
}
