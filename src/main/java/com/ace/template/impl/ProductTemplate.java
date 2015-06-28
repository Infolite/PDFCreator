package com.ace.template.impl;

import com.ace.constants.ProductReportConstants;
import com.ace.template.ReportTemplate;

import java.io.InputStream;

public class ProductTemplate implements ReportTemplate {

    public InputStream getReportTemplate() {
        return getClass().getResourceAsStream(ProductReportConstants.REPORT_XML);
    }
}