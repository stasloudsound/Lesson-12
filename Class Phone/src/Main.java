public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("3","2","1");
        String[] arr = new String[]{"341241 ", "512451", "412431 "};
        phone.sendMassage(arr, "Добро пожаловать ");
        phone.receiveCall("Eduard ");

    }
}

