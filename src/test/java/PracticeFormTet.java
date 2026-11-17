package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTet {
    @Test
    void SuccessfulFormSubmissionWithRequiredFieldsTest () {
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Juli");
        $("[id=lastName]").setValue("Haneeva");
        $("[id=userEmail]").setValue("julihaneeva@mail.ru");
        $("[id=gender-radio-1]").click();
        $("[id=userNumber]").setValue("9876728722");

        $("[id=dateOfBirthInput]").click();
        $("[aria-label=\"Choose Thursday, November 5th, 2026\"]").click();
        $("[id=RightSide_Advertisement]").click();
        $("[id=hobbies-checkbox-3]").click();

        $("[id=currentAddress]").setValue("г. Москва, ул. Тверская, д. 1").pressEnter();
        $("[class=\"css-19bb58m\"]").click();



    }
}
