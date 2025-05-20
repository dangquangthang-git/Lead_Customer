# Cấu trúc thư mục
```
📦 project-root
│   .gitignore
│   pom.xml
│   README.md
├───.idea
├───htmlExtent
│       ExtentReport.html
├───src
    ├───main
    │   ├───java
    │   │   ├───commons
    │   │   │       BasePage.java
    │   │   │       BaseTest.java
    │   │   │       BrowserList.java
    │   │   │       GlobalConstants.java
    │   │   │       MethodListener.java
    │   │   │       VerificationFailures.java
    │   │   │
    │   │   ├───pageObjects
    │   │   │   │   PageGenerator.java
    │   │   │   │
    │   │   │   └───dsb
    │   │   │           HomePO.java
    │   │   │           LeadPO.java
    │   │   │           LoginPO.java
    │   │   │
    │   │   ├───pageUIs
    │   │   │       HomePageUI.java
    │   │   │       LeadPageUI.java
    │   │   │       LoginPageUI.java
    │   │   │
    │   │   ├───reportConfigs
    │   │   │       AnnotationTransformer.java
    │   │   │       ExtentListener.java
    │   │   │       ExtentManager.java
    │   │   │       RetryAnalyzer.java
    │   │   │
    │   │   └───utilities
    │   │           FakerConfig.java
    │   │
    │   └───resources
    │       ├───downloadFiles
    │       └───uploadFiles
    │               leadInfo.xlsx
    │
    └───test
        ├───java
        │   ├───common
        │   │       Testcase_Login.java
        │   │       Testcase_Search_Filter.java
        │   │
        │   ├───company
        │   │   ├───individual
        │   │   │       Testcase_Create_Individual_Lead.java
        │   │   │       Testcase_Verify_Edit_Individual_Info.java
        │   │   │
        │   │   └───organization
        │   │           Testcase_Create_Organization_Lead.java
        │   │           Testcase_Verify_Edit_Organizaton_Info.java
        │   │
        │   └───staticVariables
        │           staticVars.java
        │
        └───resources
                lead_Customer.xml

```

# Hướng dẫn quy trình xử lý Lead trong hệ thống DSB

## 1. Truy cập hệ thống
- Mở trình duyệt và truy cập địa chỉ hệ thống DSB.
- 📌 Lưu ý: Hệ thống cần kết nối vpn để truy cập

## 2. Đăng nhập
- Nhập thông tin tài khoản (username & password).
- Nhấn "Đăng nhập" để vào hệ thống.

## 3. Truy cập module Quản lý khách hàng
- Từ giao diện chính, chọn menu **"Quản lý khách hàng"**.

## 4. Tạo Lead mới
1. Nhấn nút **"Tạo Lead mới"**.
2. Chọn **Loại Lead**:
   - Cá nhân
   - Tổ chức
3. Nhập đầy đủ **thông tin cần thiết** (họ tên, địa chỉ, số điện thoại...).
4. Nhấn **"Lưu"** để hoàn tất.

---

## 5. Xác minh thông tin Lead
- Đối chiếu thông tin đã tạo dựa trên:
  - **Tên khách hàng**
  - **Địa chỉ**

---

## 6. Chỉnh sửa thông tin
- Có thể thực hiện chỉnh sửa:
  - **Thông tin Lead** (VD: thay đổi số điện thoại, email...)
  - **Nhiệm vụ liên quan** đến Lead

---

## 7. Tạo nhiệm vụ mới
- Từ trang chi tiết Lead, chọn **"Tạo nhiệm vụ mới"** để tiếp tục xử lý quy trình chăm sóc khách hàng.

---

> 📌 Lưu ý: Mọi thao tác phải tuân thủ quyền truy cập và phân quyền người dùng trên hệ thống.
