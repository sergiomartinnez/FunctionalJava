package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )
    private String keyword;

    @Parameter(
            names = {"--location","-l"},
            description = "each search may have a location"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "Api returns 50 results, use a number for every page"


    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "Add if you want full time job"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown"},
            description = "get the results in markdown"
    )
    private boolean isMarkDown = false;

    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Show help"
    )
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}
