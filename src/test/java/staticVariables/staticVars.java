package staticVariables;

import commons.BasePage;

public class staticVars extends BasePage {
    public static class loginData {
        public static final String userName = "ipa\\a.mg";
        public static final String password = "Dsb@2024";
    }

    public static class commonLeadData {
        public static String mobilePhone = getPhoneGenerate();
        public static String email = getEmailGenerate("email");
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
    }

}
