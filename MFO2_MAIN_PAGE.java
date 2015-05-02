package com.ge.capital.MFO2;

public enum MFO2_MAIN_PAGE  {

    MFO2_MAIN_PAGE_00001_TAG ("!DOCTYPE"),
    MFO2_MAIN_PAGE_00002_PLINK ("idams_global.css"),
    MFO2_MAIN_PAGE_00003_PLINK ("idams_register.css"),
    MFO2_MAIN_PAGE_00004_PLINK ("common_idams_auth_reg.css"),
    MFO2_MAIN_PAGE_00005_PLINK ("FaviconAnimatedtire16x16.ico"),
    MFO2_MAIN_PAGE_00006_CLASS ("bodycontent3"),
    MFO2_MAIN_PAGE_00007_CLASS ("tooltipindicator"),
    MFO2_MAIN_PAGE_00008_CLASS ("headPageWrapper"),
    MFO2_MAIN_PAGE_00009_ID ("utilitynav"),
    MFO2_MAIN_PAGE_00010_CLASS ("appImage_myfleetoffice"),
    MFO2_MAIN_PAGE_00011_ID ("deck"),
    MFO2_MAIN_PAGE_00012_CLASS ("pagehead"),
    MFO2_MAIN_PAGE_00013_ID ("contentwrapper"),
    MFO2_MAIN_PAGE_00014_CLASS ("columnfourth"),
    MFO2_MAIN_PAGE_00015_CLASS ("sidebar"),
    MFO2_MAIN_PAGE_00016_CLASS ("leftcolumn_spacer"),
    MFO2_MAIN_PAGE_00017_CLASS ("roundedtop"),
    MFO2_MAIN_PAGE_00018_CSS ("button[value='en_US']"),
    MFO2_MAIN_PAGE_00019_CSS ("button[value='es_MX']"),
    MFO2_MAIN_PAGE_00020_CSS ("button[value='fr_CA']"),
    MFO2_MAIN_PAGE_00021_ID ("loginlinks"),
    MFO2_MAIN_PAGE_00022_LINK ("forgotUserName.htm;jsessionid=30D03E83ECF4DE06F5B7347813B2602C.secauthnode1"),
    MFO2_MAIN_PAGE_00023_PLINK ("faq.html"),
    MFO2_MAIN_PAGE_00024_PLINK ("qafltgefleet.comfin.ge.com"),
    MFO2_MAIN_PAGE_00025_PLINK ("index.html"),
    MFO2_MAIN_PAGE_00026_PLINK ("SupplierLocator"),
    MFO2_MAIN_PAGE_00027_PLINK ("fuelpricemap"),
    MFO2_MAIN_PAGE_00028_CLASS ("rightcolumn"),
    MFO2_MAIN_PAGE_00029_CLASS ("columnthreefourth"),
    MFO2_MAIN_PAGE_00030_CLASS ("passkeyouter"),
    MFO2_MAIN_PAGE_00031_CLASS ("passkeyimg"),
    MFO2_MAIN_PAGE_00032_CLASS ("passkeyinner"),
    MFO2_MAIN_PAGE_00033_CLASS ("loginform"),
    MFO2_MAIN_PAGE_00034_CLASS ("validated"),
    MFO2_MAIN_PAGE_00035_CLASS ("header"),
    MFO2_MAIN_PAGE_00036_CSS ("input#USER"),
    MFO2_MAIN_PAGE_00037_CSS ("input#rememberUserName"),
    MFO2_MAIN_PAGE_00038_CSS ("input#pm_fp"),
    MFO2_MAIN_PAGE_00039_CLASS ("tooltipicon"),
    MFO2_MAIN_PAGE_00040_ID ("btnSubmit"),
    MFO2_MAIN_PAGE_00041_CLASS ("footerlogo"),
    MFO2_MAIN_PAGE_00042_CLASS ("footertext"),
    MFO2_MAIN_PAGE_00043_PLINK ("terms.html"),
    MFO2_MAIN_PAGE_00044_PLINK ("mfo-privacy"),
    MFO2_MAIN_PAGE_00045_CLASS ("copyright"),
    MFO2_MAIN_PAGE_00046_TAG ("HEAD");

    private final String enumValue;

    private MFO2_MAIN_PAGE(String s) {
        enumValue = s;
    }

    public String getValue () {
        return enumValue;
    }

    public String toString() {
        return getValue();
    }
}
