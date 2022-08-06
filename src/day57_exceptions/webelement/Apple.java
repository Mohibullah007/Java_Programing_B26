package day57_exceptions.webelement;

import day50_inheritance.book.Library;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for (WebElement each : elements){
            System.out.println(each.getText());

            if (each instanceof Form){
                ((Form)each).submit();
            }
        }
        System.out.println("-------------------------");

        WebElement logo = new Image();
        logo.click(); // click method is accessible by the WebElement interface reference,
        // then execution happens on object


        // logo.extension = ".png"; WebElement interface does not have accessibility to the variable.

        ((Image)logo).extension = ".png"; // the reference is cast fot this line

        // ((Image)logo) --> cast the logo (WebElement reference) to a Image reference as access to the extension variable

        Image logoAsImage = ((Image)logo);
        logoAsImage.extension = ".png";
    }
}
