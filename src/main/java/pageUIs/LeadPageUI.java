package pageUIs;

public class LeadPageUI {
    public static class filterSearch {
        public static final String SEARCH_BY_NAME = "xpath=//input[@id='fullName']";
        public static final String SEARCH_BY_ADDRESS = "xpath=//input[@id='address']";
        public static final String TABLE_DATA_NAME = "xpath=//tr/td[@class='ivnd-table-cell'][2]";
        public static final String TABLE_DATA_ADDRESS = "xpath=//tr/td[@class='ivnd-table-cell'][4]";
        public static final String TABLE_DATA_TYPE = "xpath=//tr/td[@class='ivnd-table-cell'][3]";
        public static final String TABLE_DATA_STATUS = "xpath=//tr/td[@class='ivnd-table-cell'][5]";
        public static final String CLEAR_LEAD_NAME = "xpath=//span[@class='ivnd-input-clear-icon']//span[@aria-label='close-circle']//*[name()='svg']";
        public static final String CLEAR_LEAD_ADDRESS = "xpath=//span[@class='ivnd-input-clear-icon']//span[@aria-label='close-circle']//*[name()='svg']";
        public static final String FILTER_ICON = "xpath=//img[@alt='filterIcon']";
        public static final String APPLY_FILTER="xpath=//span[contains(text(),'Áp dụng')]";
        public static final String ORGA_CHECKBOX = "xpath=//label[contains(@class,'ivnd-checkbox-wrapper ivnd-checkbox-wrapper-in-form-item')]//span[contains(text(),'Tổ chức')]";
        public static final String INDIVIDUAL_CHECKBOX = "xpath=//label[contains(@class,'ivnd-checkbox-wrapper ivnd-checkbox-wrapper-in-form-item')]//span[contains(text(),'Cá nhân')]";
        public static final String CHECKED_INDIVIDUAL_CHECKBOX="xpath=//label//span[normalize-space()='Cá nhân']";
        public static final String NEW_STATUS = "xpath=//input[@value='NEW']";
        public static final String CHECKED_NEW_STATUS = "xpath=//label[@class='ivnd-checkbox-wrapper ivnd-checkbox-wrapper-checked ivnd-checkbox-wrapper-in-form-item']//span[contains(text(),'New')]";
        public static final String CONNECTED_STATUS = "xpath=//input[@value='CONNECTED']";
        public static final String OPEN_DEAL_STATUS = "xpath=//input[@value='OPEN_DEAL']";
    }

    public static class commonLeadInfo {
        public static final String CREATE_LEAD_BUTTON = "xpath=//span[contains(text(),'Tạo lead')]";
        public static final String INDIVIDUAL_LEAD_CREATE = "xpath=//span[text()='Cá nhân']";
        public static final String ORGANIZATION_LEAD_CREATE = "xpath=//span[text()='Tổ chức']";
        public static final String MOBILEPHONE_TEXTBOX = "xpath=//input[@id='mobilePhone']";
        public static final String EMAIL_TEXTBOX = "xpath=//input[@id='email']";
        public static final String ADDRESS_TEXTBOX = "xpath=//div[@class='Form__Block-sc-q08i0n-0 lckPld']//div//input[@id='address']";
        public static final String LEAD_SOURCE = "xpath=//input[@id='leadSourceId']";
        public static final String LEAD_OPTION = "xpath=//div[@title='Hội thảo']";
        public static final String DESCRYPTION_TEXTBOX = "xpath=//textarea[@id='note']";
        public static final String MISSION_NAME_TEXTBOX = "xpath=//input[@id='leadTasks_0_taskName']";
        public static final String EXECUTIVE_TIME = "xpath=//input[@id='leadTasks_0_startTime']";
        public static final String INTERACT_CHANNEL_PARENT = "xpath=//input[@id='leadTasks_0_interactChannel']";
        public static final String INTERACT_CHANNEL_OPTION = "xpath=//div[@title='Call']";
        public static final String MISSTION_NOTE = "xpath=//textarea[@id='leadTasks_0_description']";
        public static final String SAVE_BUTTON = "xpath=//button[@class='ivnd-btn ivnd-btn-primary']";
        public static final String PROVINCE = "xpath=//input[@id='province']";
        public static final String DISTRICT = "xpath=//input[@id='district']";
        public static final String WARD = "xpath=//input[@id='ward']";
        public static final String SPECIFIC_ADDRESS = "xpath=//form[@class='ivnd-form ivnd-form-vertical flex-1']//input[@id='address']";
        public static final String ADDRESS_SAVE_BUTTON = "xpath=//button[@type='submit']";
        public static final String PROVINCE_OPTION = "xpath=//div[text()='TP Hà Nội']";
    }

    public static class individualInfo {
        public static final String LEAD_FULLNAME_TEXTBOX = "xpath=//div[@class='Form__Block-sc-q08i0n-0 lckPld']//div//input[@id='fullName']";
        public static final String LEAD_DOB_TEXTBOX = "xpath=//input[@id='dateOfBirth']";
        public static final String MALE_GENDER_RADIO = "xpath=//span[normalize-space()='Nam']";
    }

    public static class organizationInfo {
        public static final String LEAD_ORGANAME_TEXTBOX = "xpath=//div[@class='Form__Block-sc-q08i0n-0 lckPld']//div//input[@id='fullName']";
        public static final String REPRESENTATIVE_TEXTBOX = "xpath=//input[@id='representative']";
    }


}

