package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();

        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.contains("allama iqbal")) {
            return "Allama Iqbal (09 November 1977 - 21 April 1938) was " +
                    "a Pakistano Poet known to be the poest of East.";
        }
        return "";
    }
}
