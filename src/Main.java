public class Main {
    public static void main(String[] args) {
        String phone = "+960-415 75 37";
        phone = phone.replace("-" , "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length()  == 10) {
            phone = '7' + phone;
        } else  if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else  if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7')  {
            throw new RuntimeException("Среди нас посторони");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        //Задание №1
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //Задание№2
        System.out.println("Задание №2");
        System.out.println(fullName.toUpperCase());
        //Задание№3
        System.out.println("Задаине №3");
        String firstName3 =  "Иванов";
        String middleName3 = "Семён";
        String lastName3 = "Семёнович";
        String fullName3 = firstName3 + " " + middleName3 + " " + lastName3;
        fullName3 =fullName3.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName3);
    }
}