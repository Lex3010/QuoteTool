package com.QuoteTool.QuoteTool.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteToolController {

    @GetMapping(path = "/info")
    public String quoteToolInformation()
    {
        return "quote_tool/quote_tool_info";
    }
}
