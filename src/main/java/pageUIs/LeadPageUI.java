package pageUIs;

public class LeadPageUI {
    public static class filterSearch {
        public static final String SEARCH_BY_NAME = "xpath=//input[@id='fullName']";
        public static final String SEARCH_BY_ADDRESS = "xpath=//input[@id='address']";
        public static final String TABLE_DATA_NAME = "xpath=//tr/td[@class='ivnd-table-cell'][2]";
        public static final String TABLE_DATA_ADDRESS = "xpath=//tr/td[@class='ivnd-table-cell'][4]";
        public static final String TABLE_DATA_TYPE = "xpath=//tr/td[@class='ivnd-table-cell'][3]";
        public static final String TABLE_DATA_ID = "xpath=//tr/td[@class='ivnd-table-cell'][1]";
        public static final String TABLE_DATA_STATUS = "xpath=//tr/td[@class='ivnd-table-cell'][5]";
        public static final String CLEAR_LEAD_NAME = "xpath=//span[@class='ivnd-input-clear-icon']//span[@aria-label='close-circle']//*[name()='svg']";
        public static final String CLEAR_LEAD_ADDRESS = "xpath=//span[@class='ivnd-input-clear-icon']//span[@aria-label='close-circle']//*[name()='svg']";
        public static final String FILTER_ICON = "xpath=//img[@alt='filterIcon']";
        public static final String APPLY_FILTER = "xpath=//span[contains(text(),'Áp dụng')]";
        public static final String ORGA_CHECKBOX = "xpath=//label[contains(@class,'ivnd-checkbox-wrapper ivnd-checkbox-wrapper-in-form-item')]//span[contains(text(),'Tổ chức')]";
        public static final String INDIVIDUAL_CHECKBOX = "xpath=//label[contains(@class,'ivnd-checkbox-wrapper ivnd-checkbox-wrapper-in-form-item')]//span[contains(text(),'Cá nhân')]";
        public static final String CHECKED_INDIVIDUAL_CHECKBOX = "xpath=//label//span[normalize-space()='Cá nhân']";
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
        public static final String UPLOAD_BUTTON = "xpath=//span[contains(text(),'Tải lên')]";
        public static final String DOWNLOAD_BUTTON = "xpath=//span[contains(text(),'Tải file mẫu')]";
        public static final String INPUT_FILE = "xpath=//input[@type='file']";
        public static final String UPLOAD_SUBMIT = "xpath=//span[contains(text(),'Xác nhận')]";
        public static final String UPLOAD_SUCCESS_MESSAGE = "xpath=//span[contains(text(),'Đã tải file lên thành công')]";
    }

    public class verifyLeadInfo {
        public static final String RECORD_01 = "xpath=//tbody/tr[2]/td[8]";
        public static final String EDIT_ICON = "xpath=//span[@class='anticon anticon-edit']";
        public static final String LEAD_NAME_VERIFY = "xpath=//div[@class='font-semibold'][contains(text(),'%s')]";
        public static final String DOB_VERIFY = "xpath=//div[contains(text(),'%s')]";
        public static final String MOBILEPHONE_VERIFY = "xpath=//div[contains(text(),'%s')]";
        public static final String EMAIL_VERIFY = "xpath=//div[contains(text(),'%s')]";
        public static final String LEAD_STATUS_VERIFY = "xpath=//div[contains(text(),'%s')]";
        public static final String LEAD_ID_VERIFY = "xpath=//div[contains(text(),'%s')]";
        public static final String ClOSE_INFO_POPUP = "xpath=//div[@class='w-full text-center uppercase font-bold text-xl']";
        public static final String MISSION_TAB = "xpath=//div[text()='Nhu cầu và nhiệm vụ']";
        public static final String MISSION_TAB_NAME_DETAIL = "xpath=//td[contains(text(),'%s')]";
        public static final String MISSION_TAB_NOTE_DETAIL = "xpath=//td[normalize-space()='%s']";
        public static final String EDIT_ICON_BLOCK = "xpath=//div[text()='%s']/parent::div/following-sibling::div";
    }

    public static class individualInfo {
        public static final String LEAD_FULLNAME_TEXTBOX = "xpath=//div[@class='Form__Block-sc-q08i0n-0 lckPld']//div//input[@id='fullName']";
        public static final String LEAD_DOB_TEXTBOX = "xpath=//input[@id='dateOfBirth']";
        public static final String MALE_GENDER_RADIO = "xpath=//span[normalize-space()='Nam']";
    }

    public static class editInfo {
        public static final String NAME_EDIT = "xpath=//div[@class='DetailInfo__Block-sc-ms262w-0 bIRBih']//div//div//input[@id='fullName']";
        public static final String INDI_DOB_EDIT = "xpath=//input[@id='dateOfBirth']";
        public static final String ORGAN_REPNAME_EDIT = "xpath=//input[@id='representative']";
        public static final String MOBILEPHONE_EDIT = "xpath=//input[@id='mobilePhone']";
        public static final String EMAIL_EDIT = "xpath=//input[@id='email']";
        public static final String SUBMIT_CHANGE = "xpath=//div[text()='%s']/parent::div/parent::div/following-sibling::div//button[@class='ivnd-btn ivnd-btn-primary']";
        public static final String MISSION_EDIT_ICON = "xpath=//span[@aria-label='form']//*[name()='svg']";
        public static final String MISSION_NAME_EDIT = "xpath=//input[@id='taskName']";
        public static final String MISSION_NOTE_EDIT = "xpath=//textarea[@id='description']";
        public static final String MISSION_SUBMIT_EDIT = "xpath=//button[@type='submit']";
        public static final String ADD_MISSION = "xpath=//div[@role='button']";
        public static final String ADD_MISSION_NAME = "xpath=//input[@id='taskName']";
        public static final String ADD_MISSION_TIME = "xpath=//input[@id='startTime']";
        public static final String ADD_MISSION_INTERACT_CHANNEL = "xpath=//input[@id='interactChannel']";
        public static final String ADD_MISSION_DESCRYPTION = "xpath=//textarea[@id='note']";
        public static final String ADD_MISSION_SUBMIT = "xpath=//button[@type='submmit']";
        public static final String ADD_INTERACT_CHANNEL_OPTION = "xpath=//div[@title='Email']";
    }

    public static class organizationInfo {
        public static final String LEAD_ORGANAME_TEXTBOX = "xpath=//div[@class='Form__Block-sc-q08i0n-0 lckPld']//div//input[@id='fullName']";
        public static final String REPRESENTATIVE_TEXTBOX = "xpath=//input[@id='representative']";
    }

}

