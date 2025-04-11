package staticVariables;

import commons.BasePage;

public class staticVars extends BasePage {
    public static class loginData {
        public static final String userName = "ipa\\a.mg";
        public static final String password = "Dsb@2024";
    }

    public static class commonLeadData {
        public static final String address = "Quận Ba Đình, TP Hà Nội";
        public static final String leadSource = "Hội thảo";
        public static final String descryptionText = address;
        public static final String missionName = generateTaskName();
        public static final String missionTime = getTomorrow() + " 10:00:00";
        public static final String interactOption = "Call";
        public static final String missionNote = interactOption;
        public static final String province = "TP Hà Nội";
        public static final String district = "Quận Ba Đình";
        public static final String ward = "Phường Phúc Xá";
        public static final String specificAddress = "Số nhà " + getHouseNumberGenerate();
    }

    public static class individualLeadData {
        public static final String fullName = getRandomName();
        public static final String dateOfBirth = "21/04/1998";
        public static String individualEmail = getEmailGenerate("individual");
        public static String indiMobilePhone = getPhoneGenerate();
    }

    public static class organizationLeadData {
        public static final String leadOrgaName = getCompanyNameGenerate();
        public static final String repName = getRandomName();
        public static String organizationEmail = getEmailGenerate("entrepreneur");
        public static String organMobilePhone = getPhoneGenerate();
    }

    public static class editInfo {
        public static final String editLeadName = getRandomName();
        public static final String editDOB = "22/04/1998";
        public static final String editPhone = getPhoneGenerate();
        public static final String editEmail = getEmailGenerate("editEmail");
        public static final String editOrgaName = getCompanyNameGenerate();
        public static final String editRepName = getRandomName();
        public static final String editOrgaPhone = getPhoneGenerate();
        public static final String editOrgaEmail = getEmailGenerate("editEmailCompany");
    }

}
