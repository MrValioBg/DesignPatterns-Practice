package com.codewithmosh.behavioural.mediator_done;

import java.util.Set;

public class SignUpDialogBox {

    private final CheckBox checkBoxTerms = new CheckBox();
    private final Button signUpButton = new Button();
    private final TextBox userName = new TextBox();
    private final TextBox password = new TextBox();


    public void simulateScenario() {
        checkBoxTerms.setChecked(true);
        userName.setContent("asd");
        System.out.println(signUpButton.isEnabled());
        password.setContent("asdd");
        System.out.println(signUpButton.isEnabled());
        password.setContent("");
        System.out.println(signUpButton.isEnabled());
    }

    public SignUpDialogBox() {
        Set<UIControl> uiControlSet = Set.of(userName, password, checkBoxTerms);
        uiControlSet.forEach(e -> e.addEventHandler(this::checkIfFieldsAreFilled));
    }

    private void checkIfFieldsAreFilled() {
        var userNameContent = userName.getContent();
        var passwordContent = password.getContent();

        var isUserNameEmpty = (userNameContent == null || userNameContent.isEmpty());
        var isPasswordEmpty = (passwordContent == null || passwordContent.isEmpty());


        var isEverythingFilled = checkBoxTerms.isChecked() && !isPasswordEmpty && !isUserNameEmpty;
        signUpButton.setEnabled(isEverythingFilled);
    }

    private void ifTrueDisable() {
        if (signUpButton.isEnabled()) {
            signUpButton.setEnabled(false);
        }
    }

}
