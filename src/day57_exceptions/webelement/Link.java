package day57_exceptions.webelement;

public class Link implements WebElement{
    /*
create a class Link
    implement the WebElement interface and implement all abstract methods
 */
        @Override
        public void click() {
            System.out.println("Clicking Linked");
        }

        @Override
        public String getText() {
            return "Link Text";
        }

        @Override
        public void sendKeys(String txt) {
            System.out.println("Sending txt to link");
            System.out.println(txt);
        }
}
