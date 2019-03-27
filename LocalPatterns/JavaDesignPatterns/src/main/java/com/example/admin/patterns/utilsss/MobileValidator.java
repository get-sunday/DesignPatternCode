package com.example.admin.patterns.utilsss;

public class MobileValidator  implements Validator.IValidater {
    @Override
    public boolean verify(String content, String tip) {
        if (content.equals("123")) {
            return true;
        }
        return false;
    }
}
