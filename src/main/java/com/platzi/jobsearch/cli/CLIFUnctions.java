package com.platzi.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFUnctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();

        params.put("Description", cliArguments.getKeyword());
        params.put("location", cliArguments.getLocation());
        params.put("full_time", cliArguments.isFullTime());
        params.put("page", cliArguments.getPage());

        if(cliArguments.isMarkDown()){
            params.put("markdown", true);
        }

        return params;
    }
}
