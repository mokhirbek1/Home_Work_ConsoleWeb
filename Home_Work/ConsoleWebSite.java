package PDP.Home_Work;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleWebSite {
    {
        System.out.println(INTRODUCE);
    }

    private static final String INTRODUCE = "Assolomu aleykum PDP ga hush kelibsiz";
    private static final String CHOOSE_FIRST_STEP = "Iltimos kerakli bo'limni tanlang:";
    private static final String LOG_IN = "Shaxsiy kabinetga kirish";
    private static final String SIGN_UP = "Registratsiyadan o'tish";
    private static final String INFO = "Kurslarimiz haqida ma'lumot olish";
    private static final String USERNAME = "Login kiriting";
    private static final String PASSWORD = "Password kiriting";
    private static final String HELLO = "Assolomu aleykum!";
    private static final String SHOW_COURSE = "Sizning kurslaringiz: ";
    private static final String COURSE_INFO = "Kurs haqida ma'lumot:";
    private static final String CONFIRM_FEE = "Iltimos to'lov turini tanlang: ";
    private static final String BUY_COURSE = "Harid qilmoqchi bo'lgan kurs nomini tanlang: ";
    private static final String ERROR_BUY_COURSE = "Harid qilishda hatolik yuzaga keldi, iltimos boshqatdan urinnib ko'ring!";
    private static final String BALANCE = "Sizning balansingiz: ";
    private static final String FILL_BALANCE = "Qancha miqdorda balansingizni to'ldirmoqchisiz?";
    private static final String AGAIN_FILL_BALANCE = "Hatolik iltimos boshqatdan kiriting";
    private static final String SUCCESS_FILL_BALANCE = "Balansingiz muvafaqiyatli to'ldirildi!";
    private static final String REFUND_BALANCE = "Balansingizni qancha miqdorini qaytarmoqchisiz?";
    private static final String SUCCESS_REFUND_BALANCE = "Muvafaqiyatli pulingiz qaytarildi!";
    private static final String NUMBER_CARD = "Karta raqamingizni kiriting:";
    private static final String NUMBER_CARD_SUCCESS = "Karta raqamingiz muvafaqiyatli qo'shildi!";
    private static final String NUMBER_CARD_FIRST_NUMBERS_FAIL = "Karta raqami kiritilishida hatolik yuzaga keldi, karta raqami 8600 yoki 9860 dan boshlanishi kerak!";
    private static final String NUMBER_CARD_FAIL = "Karta raqamining uzunligi 16 ta raqam bo'lishi kerak! Iltimos boshqatdan kiritib ko'ring!";
    private static final String REFUND_BALANCE_ERROR = "Siz ko'p miqdorda kiritdingiz!, iltimos boshqattan kiritib ko'ring";
    private static final String AGREEMENT = "Siz chindanham akkauntingizdan chiqmoqchimisiz?";
    private static String PRE_METHOD;
    private static String PRE_GUEST_METHOD;
    private static List<User> userInfo = new ArrayList<>();
    private static ArrayList<String> listPersonalAcc = new ArrayList<>(Arrays.asList("Kurslarim", "Kurs sotib olish", "Balansim", "Shaxsiy ma'lumotlarim", "Chiqish"));
    private static ArrayList<String> listPersonalCourse = new ArrayList<>(Arrays.asList("Kurs sotib olish", "Orqaga", "Bosh menyuga qaytish", "Chiqish"));
    private static ArrayList<String> listPersonalBalance = new ArrayList<>(Arrays.asList("Balansni to'ldirish", "To'lovni qaytarish", "Orqaga", "Bosh menyuga qaytish", "Chiqish"));
    private static ArrayList<String> listCourses = new ArrayList<>(Arrays.asList("C#/.Net", "Java/Spring", "Python/Django", "JavaScript/React.js", "Go/Golang", "Orqaga"));
    private static ArrayList<String> shopCourse = new ArrayList<>(Arrays.asList("Harid qilish", "Orqaga", "Bosh menyuga qaytish", "Chiqish"));
    private static ArrayList<String> shopCourseGuest = new ArrayList<>(Arrays.asList("Harid qilish", "Orqaga", "Bosh menyuga qaytish"));
    private static ArrayList<String> listAgreement = new ArrayList<>(Arrays.asList("Ha", "Yo'q"));
    private static ArrayList<String> listPayments = new ArrayList<>(Arrays.asList("Click", "Payme", "UzumPay", "Oson", "Orqaga"));
    private static ArrayList<String> listMainMenu = new ArrayList<>(Arrays.asList("Shaxsiy kabinetga kirish", "Registratsiyadan o'tish", "Kurslarimiz haqida ma'lumot olish"));
    private static Scanner scanner = new Scanner(System.in);
    private  List<Course> allCourseList = new ArrayList<>();
    private static ConsoleWebSite webConsole = new ConsoleWebSite();
    private static int countId = 0;


    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        String javaInfo = "Java dasturlash tili, Oracle Corporation tomonidan yaratilgan va o'rnatilgan, og'ir tizimlarda va o'yinlarda ishlatiladigan yuqori darajali obyektga yo'naltirilgan dasturlash tili hisoblanadi. Java, ko'p platformalar uchun ishlatilishi mumkin bo'lgan yuqori darajali bir dasturlash tilidir. Bu, barcha operatsion tizimlari uchun yozilgan dasturlarni bajarishni osonlashtiradi. Java, yuqori darajali, obyektga yo'naltirilgan, keng tarqalgan dasturlash tili hisoblanadi. Bu, ko'p platformalar uchun ishlatilishi mumkin bo'lgan yuqori darajali bir dasturlash tilidir. Bu til orqali, dasturchilar yarim avtomatik yoki to'liq avtomatik ko'rinishda dasturlar yozishlari mumkin.";
        String goInfo = "Go, Google tomonidan ishlab chiqilgan va ochiq manbalarni qo'llab-quvvatlash maqsadida yaratilgan bir dasturlash tili hisoblanadi. Bu til, o'rta darajadagi umumiy maqsadli dasturlash uchun ishlatiladi va keng ko'lamdagi tizimlarni yaratish uchun qo'llaniladi. Go tilida yozilgan kodlar, kuchli va tez ishlovchi, katta ko'lamdagi tizimlarni yaratishda juda foydali bo'ladi. Go tilida yozilgan kodlar, turli operatsion tizimlarida ishlaydi va xavfsizlik va yorqinlikni ta'minlaydigan funksiyalarga ega.";
        String cSharpInfo = "C# (C sharp), Microsoft tomonidan yaratilgan va .NET Framework orqali ishlatiladigan yuqori darajali obyektga yo'naltirilgan dasturlash tili hisoblanadi. Bu, Windows platformasi uchun yozilgan dasturlarni bajarishni osonlashtiradi. C#, Java tiliga o'xshash, lekin Microsoft platformalari uchun mo'ljallangan. Bu til orqali, dasturchilar yarim avtomatik yoki to'liq avtomatik ko'rinishda dasturlar yozishlari mumkin.";
        String pythonInfo = "Python, o'qish yozishga qulay til hisoblanadi va barcha sohada ishlatiladi. Bu til, odatda ma'lumotlar analizini, ma'lumotlar bazalarini, yadroli tizimlarni va mashinalarning boshqarilishini yaratish uchun ishlatiladi. Python tilida yozilgan kodlar, oddiy va qulay sintaksisiga ega bo'lib, dasturchilar uchun ishlashni osonlashtiradi. Python tilida yozilgan dasturlar, o'zining keng ko'lamli kutubxonasi bilan birga ishlaydi va bu til, ilgari dasturchilik tajribasi bo'lmagan insonlar uchun ham o'rganishga qulay hisoblanadi.";
        String javaScriptInfo = "JavaScript, brauzerlar va veb ilovalarini yaratish uchun ishlatilgan bir dasturlash tili hisoblanadi. Bu til, veb sahifalarni interaktiv qilish va dinamik xususiyatlar qo'shish uchun ishlatiladi. JavaScript tilida yozilgan kodlar, brauzerlarda ishlaydi va foydalanuvchilar bilan interaktiv tarzda ishlashni ta'minlaydi. Bu til, HTML va CSS bilan birga ishlatiladi va veb ilovalarni yaratishda katta ko'lamli dasturlash tili hisoblanadi.";
        Course javaCourse = new Course("Java/Spring", 10, 22_000_000, javaInfo);
        Course pythonCourse = new Course("Python/Django", 11, 20_000_000, pythonInfo);
        Course cSharpCourse = new Course("C#/.Net", 9, 18_000_000, cSharpInfo);
        Course javaScriptCourse = new Course("JavaScript/React.js", 8, 21_000_000, javaScriptInfo);
        Course goCourse = new Course("Go/Golang", 7, 17_000_000, goInfo);

        Payment payment = new Payment(PaymentName.Click, "8600550419012944", "1125");
        courseList.add(javaCourse);
        webConsole.allCourseList.add(cSharpCourse);
        webConsole.allCourseList.add(pythonCourse);
        webConsole.allCourseList.add(javaCourse);
        webConsole.allCourseList.add(javaScriptCourse);
        webConsole.allCourseList.add(goCourse);
        User user = new User("mmokhirbek", "test123", "Moxirbek", "Maxkamov", 23);

        user.setCourses(courseList);
        user.setBalance(120000);
        webConsole.addUser(user);
        webConsole.mainMenu();
    }

    public void buyCourse(User currentUser) {
        PRE_METHOD = "buyCourse";
        int chosenOption;
        showUserInfo(currentUser);
        System.out.println(BUY_COURSE);
        chosenOption = getOption(listCourses);
        if (chosenOption > 0) {
            showCoursesInfo(listCourses.get(chosenOption-1), currentUser);
        } else {
            System.out.println(ERROR_BUY_COURSE);
            buyCourse(currentUser);
        }
    }

    public void buyCourseForGuest() {
        PRE_GUEST_METHOD = "buyCourseForGuest";
        int chosenOption;
        System.out.println("Sizni qiziqtirayotgan kursni tanlang");
        chosenOption = getOption(listCourses);
        if (chosenOption > 0) {
            showCoursesInfoForGuest(listCourses.get(chosenOption-1));
        } else {
            System.out.println("Kerakli bo'limni tanlang!");
            buyCourseForGuest();
        }
    }


    public void showUserInfo(User currentUser) {
        System.out.println("--------------------------------------------------------------");
        System.out.println(currentUser.getName() + " " + currentUser.getSurName());
    }

    public void showCoursesInfo(String nameCourse, User currentUser) {
        PRE_METHOD = "showCoursesInfo";
        showUserInfo(currentUser);
        System.out.println(COURSE_INFO);
        for (Course course : allCourseList) {
            if (course.getName().equals(nameCourse)) {
                System.out.println("Kurs nomi: " + course.getName());
                System.out.println("Kurs narhi: " + course.getCost());
                System.out.println("Kurs davomiyligi: " + course.getMonth());
                System.out.println("Kurs haqida: " + course.getInfo());
                currentUser.addShopCourses(course);
            }
        }
        int choice = getOption(shopCourse);
        if (choice > 0) {
            transferTo(shopCourse.get(choice-1), currentUser);
        } else {
            System.out.println(ERROR_BUY_COURSE);
            showCoursesInfo(nameCourse, currentUser);
        }

    }

    public void showCoursesInfoForGuest(String nameCourse) {
        PRE_GUEST_METHOD = "showCoursesInfoForGuest";
        System.out.println(COURSE_INFO);
        for (Course course : allCourseList) {
            if (course.getName().equals(nameCourse)) {
                System.out.println("Kurs nomi: " + course.getName());
                System.out.println("Kurs narhi: " + course.getCost());
                System.out.println("Kurs davomiyligi: " + course.getMonth());
                System.out.println("Kurs haqida: " + course.getInfo());
            }
        }
        int choice = getOption(shopCourseGuest);
        if (choice > 0) {
            transferGuestTo(shopCourseGuest.get(choice-1));
        } else {
            System.out.println("Kursni tanlashda hatolik!\n" + "Iltimos boshqatdan urinib ko'ring!");
            showCoursesInfoForGuest(nameCourse);
        }

    }

    public void guestShopCourse() {
        System.out.println("Kurslarimizni harid qilmoqchi bo'lsangiz,\n" + "iltimos shahsiy akkauntingizga kiring!");
        logIn();
    }

    public boolean checkBalance(User currentUser, String chosenCourse) {
        Course course = currentUser.getShopCourseByName(chosenCourse);
        if (course.getCost() <= currentUser.getBalance()) {
            return true;
        } else {
            return false;
        }
    }

    public void payForCourseFromBalance(User currentUser) {
        showUserInfo(currentUser);
        showBalanceInfo(currentUser);
        System.out.println("Qaysi kursingizni sotib olmoqchisiz?");
        int choice = getOption(shopCourse);
        List<String> shopCourse = new ArrayList<>();
        for (Course course : currentUser.getShopCourse()) {
            shopCourse.add(course.getName());
        }
        if (choice > 0) {
            if (checkBalance(currentUser, shopCourse.get(choice-1))) {
                System.out.println("Siz muvafaqiyatli kursni sotil oldingiz!\n" + "Kursning nimi: " + shopCourse.get(choice-1));
                currentUser.addCourseList(currentUser.getShopCourseByName(shopCourse.get(choice-1)));
                currentUser.removeShopCourses(currentUser.getShopCourseByName(shopCourse.get(choice-1)));
                personalAccount(currentUser.getUserName(), currentUser.getPassWord());
            } else {
                System.out.println("Sizni balansingizda yetarli mablag' mavjud emas!\n" + "Iltimos balansingizni to'ldirib, qaytadan urinib ko'ring!");
                personalAccount(currentUser.getUserName(), currentUser.getPassWord());
            }
        } else {
            System.out.println("Iltimos boshqatdan tanlab ko'ring!");
            payForCourseFromBalance(currentUser);
        }
    }

    public void showBalanceInfo(User currentUser) {
        System.out.println("Sizning balansingiz: " + currentUser.getBalance());
    }

    public boolean finishFillingBalance(User currentUser, int moneyForPay) {
        PRE_METHOD = "finishFillingBalance";
        boolean result = false;
        int choiceOption;
        String cardNumber;
        System.out.println(CONFIRM_FEE);
        choiceOption = getOption(listPayments);
        if (choiceOption > 0) {
            if (listPayments.get(choiceOption-1).equals("Orqaga")) {
                transferTo(listPayments.get(choiceOption-1), currentUser);
            } else {
                if (checkPaymentName(listPayments.get(choiceOption-1))) {
                    System.out.println(NUMBER_CARD);
                    cardNumber = scanner.nextLine();
                    if (checkCardNumber(cardNumber)) {
                        System.out.println("Balansingiz muvafaqiyatli " + moneyForPay + "so'mga to'ldirildi!");
                        currentUser.setBalance(moneyForPay);
                        result = true;
                    } else {
                        System.out.println("Karta raqamingiz noto'g'ri kiritildi!\n" + "Iltimos boshqattan urinib ko'ring!");
                        finishFillingBalance(currentUser, moneyForPay);
                    }
                } else {
                    System.out.println("Notog'ri to'lov tizmini tanladingiz!\n" + "Iltimos boshqatdan urinib ko'ring!");
                    finishFillingBalance(currentUser, moneyForPay);
                }
            }
        } else {
            finishFillingBalance(currentUser, moneyForPay);
        }
        return result;
    }

    public boolean checkPaymentName(String payment) {
        boolean result = false;
        for (PaymentName paymentName : PaymentName.values()) {
            if (paymentName.name().equals(payment)) {
                result = true;
            }
        }
        return result;
    }

    public boolean checkCardNumber(String cardNumber) {
        if (cardNumber.substring(0, 3).equals("8600") && cardNumber.substring(0, 3).equals("9860")) {
            if (cardNumber.length() == 16 && cardNumber.matches("\\d+")) {
                System.out.println(NUMBER_CARD_SUCCESS);
                return true;
            } else {
                System.out.println(NUMBER_CARD_FAIL);
                return false;
            }
        } else {
            System.out.println(NUMBER_CARD_FIRST_NUMBERS_FAIL);
            return false;
        }
    }

    public void transferTo(String option, User currentUser) {
        switch (option) {
            case "Kurslarim"://+
                ownCourse(currentUser);
                break;
            case "Harid qilish"://+
                payForCourseFromBalance(currentUser);
                break;
            case "Balansim"://+
                getBalance(currentUser);
                break;
            case "Kurs sotib olish"://+
                buyCourse(currentUser);
                break;
            case "Balansni to'ldirish"://+
                fillBalance(currentUser);
                break;
            case "To'lovni qaytarish"://+
                refundMoney(currentUser);
                break;
            case "Shaxsiy ma'lumotlarim"://+
                personalInformation(currentUser);
                break;
            case "Bosh menyuga qaytish"://+
                personalAccount(currentUser.getUserName(), currentUser.getPassWord());
                break;
            case "Chiqish"://+
                acceptOfQuit(currentUser);
                break;
            case "Ha":
                mainMenu();
                break;
            case "Yo'q":
                personalAccount(currentUser.getUserName(), currentUser.getPassWord());
                break;
            case "Orqaga":
                switch (PRE_METHOD) {
                    case "ownCourse":
                        personalAccount(currentUser.getUserName(), currentUser.getPassWord());
                        break;
                    case "logIn":
                        mainMenu();
                        break;
                    case "personalAccount":
                        acceptOfQuit(currentUser);
                        break;
                    case "getBalance":
                        personalAccount(currentUser.getUserName(), currentUser.getPassWord());
                        break;
                    case "buyCourse":
                        personalAccount(currentUser.getUserName(), currentUser.getPassWord());
                        break;
                    case "showCoursesInfo":
                        buyCourse(currentUser);
                        break;
                    case "finishFillingBalance":
                        fillBalance(currentUser);
                        break;
                }
            default:
                break;
        }
    }

    public void mainMenu() {
        PRE_METHOD = "mainMenu";
        int choice;
        choice = getOption(listMainMenu);
        if (choice > 0) {
            transferGuestTo(listMainMenu.get(choice-1));
        } else {
            System.out.println("Iltimos boshqatdan urinib ko'ring!");
            mainMenu();
        }
    }

    public void signUp() {
        String name;
        String surname;
        String username;
        String password;
        int old;
        System.out.println("Registratsiyadan o'tish uchun,\n" + "barcha ma'lumotlaringizni behato kiriting!");
        System.out.print("Ism: ");
        name = scanner.nextLine();
        System.out.print("Familiya: ");
        surname = scanner.nextLine();
        System.out.print("Username: ");
        username = scanner.nextLine();
        old = Integer.parseInt(scanner.nextLine());
        password = setPassword();
        if (password.equals("0")) {
            signUp();
        }
        System.out.println("Siz muvafaqaiyatli registratsiyadan o'tdingiz!");
        User user = new User(username, password, name, surname, old);
        webConsole.addUser(user);
        mainMenu();
    }

    public String setPassword() {
        String passWord_1;
        String passWord_2;
        System.out.println("Parol: ");
        passWord_1 = scanner.nextLine();
        System.out.println("Qaytadan kiriting: ");
        passWord_2 = scanner.nextLine();
        if (passWord_1.equals(passWord_2)) {
            System.out.println("Parollar mos keldi!");
            return passWord_1;
        } else {
            System.out.println("Parollar mos kelmadi!\n" + "Iltimos boshqatdan urinib ko'ring!");
            return "0";

        }
    }

    public void transferGuestTo(String option) {
        switch (option) {
            case "Kurslarimiz haqida ma'lumot olish":
                buyCourseForGuest();
                break;
            case "Registratsiyadan o'tish":
                signUp();
                break;
            case "Shaxsiy kabinetga kirish":
                logIn();
                break;
            case "Orqaga":
                switch (PRE_GUEST_METHOD) {
                    case "buyCourseForGuest":
                        mainMenu();
                        break;
                    case "showCoursesInfoForGuest":
                        buyCourseForGuest();
                        break;
                }
                break;
            case "Harid qilish":
                guestShopCourse();
                break;
            case "Bosh menyuga qaytish":
                mainMenu();
                break;
            default:
                mainMenu();
                break;
        }
    }

    public void logIn() {
        PRE_METHOD = "logIn";
        System.out.println(USERNAME);
        String userName = scanner.nextLine();
        System.out.println(PASSWORD);
        String password = scanner.nextLine();
        if (checkUser(userName, password)) {
            System.out.println("Muvafaqiyatli akkauntingizga kirdingiz!");
            personalAccount(userName, password);
        }else {
            System.out.println("Sizning akkauntingiz topilmadi!\n"+"Iltimos boshqatdan urinib ko'ring!");
            logIn();
        }
    }

    public void personalAccount(String username, String password) {
        PRE_METHOD = "personalAccount";
        User currentUser = getUser(username, password);
        showUserInfo(currentUser);
        int chosenOption = getOption(listPersonalAcc);
        transferTo(listPersonalAcc.get(chosenOption-1), currentUser);
    }

    public int getOption(List<String> listOption) {
        int count = 1;
        String choice;
        int optionNumber;
        System.out.println(CHOOSE_FIRST_STEP);
        for (String option : listOption) {
            System.out.println(count + ": " + option);
            count++;
        }
        choice = scanner.nextLine();
        if (checkNumber(choice)) {
            optionNumber = parseToInt(choice);
            return optionNumber;
        } else {
            optionNumber = -1;
        }
        return optionNumber;
    }

    public boolean checkUser(String username, String password) {
        for (User user : userInfo) {
            if (user.getUserName().equals(username) && user.getPassWord().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNumber(String number) {
        if (number.isEmpty()) {
            return false;
        } else if (number.matches(".*\\d.*")) {
            return true;
        } else {
            return false;
        }
    }

    public int parseToInt(String number) {
        if (checkNumber(number)) {
            return Integer.parseInt(number);
        } else
            return 0;
    }

    public User getUser(String username, String password) {
        for (User user : userInfo) {
            if (user.getUserName().equals(username) && user.getPassWord().equals(password)) {
                return user;
            }
        }
        return new User();
    }

    public void addUser(User user) {
        user.setId(countId);
        userInfo.add(user);
        countId++;
    }

    public void ownCourse(User currentUser) {
        PRE_METHOD = "ownCourse";
        int chosenOption;
        showUserInfo(currentUser);
        System.out.println(SHOW_COURSE);
        List<Course> ownCourse = currentUser.getCourses();
        for (Course course : ownCourse) {
            System.out.println("Kurs nomi: " + course.getName());
            System.out.println("Kurs narhi: " + course.getCost()+" so'm");
            System.out.println("Kurs davomiyligi: " + course.getMonth()+" oy");
            System.out.println("Kurs haqida: " + course.getInfo());
        }
        chosenOption = getOption(listPersonalCourse);
        transferTo(listPersonalCourse.get(chosenOption-1), currentUser);
    }

    public void getBalance(User currentUser) {
        PRE_METHOD = "getBalance";
        int chosenOption;
        showUserInfo(currentUser);
        showBalanceInfo(currentUser);
        chosenOption = getOption(listPersonalBalance);
        transferTo(listPersonalBalance.get(chosenOption-1), currentUser);
    }

    public void acceptOfQuit(User currentUser) {
        int chosenOption;
        System.out.println(AGREEMENT);
        chosenOption = getOption(listAgreement);
        transferTo(listAgreement.get(chosenOption-1), currentUser);
    }

    public void fillBalance(User currentUser) {
        String amountMoney;
        int moneyForPay = 0;
        showUserInfo(currentUser);
        System.out.println(FILL_BALANCE);
        amountMoney = scanner.nextLine();
        if (checkNumber(amountMoney)) {
            moneyForPay = parseToInt(amountMoney);
            System.out.println("To'lov miqdori: " + moneyForPay);
            if (finishFillingBalance(currentUser, moneyForPay)) {
                System.out.println(SUCCESS_FILL_BALANCE + " +" + amountMoney);
                getBalance(currentUser);
                payForCourseFromBalance(currentUser);
            } else {
                System.out.println("Balansingizni to'ldirishda hatolik yuzaga keldi!\n" + "iltimos boshqatdan urinib ko'ring!");
                finishFillingBalance(currentUser, moneyForPay);
            }

        } else {
            System.out.println(AGAIN_FILL_BALANCE);
            fillBalance(currentUser);
        }
    }

    public void personalInformation(User currentUser) {
        int count = 0;
        List<String> list = new ArrayList<>(Arrays.asList("Bosh menyuga qaytish", "Chiqish"));
        System.out.println("Shaxsiy ma'lumotlarim: ");
        System.out.println("Isim: " + currentUser.getName());
        System.out.println("Familiya: " + currentUser.getSurName());
        System.out.println("Username: " + currentUser.getUserName());
        System.out.println("Balansim: " + currentUser.getBalance());
        System.out.println("Harid qilgan kurslarim: ");
        for (Course course : currentUser.getCourseList()) {
            System.out.println("---" + count + "---");
            System.out.println("Kurs nomi: " + course.getName());
            System.out.println("Kurs narhi: " + course.getCost());
            System.out.println("Kurs davomiyligi: " + course.getMonth());
            System.out.println("Kurs haqida: " + course.getInfo());
            count++;
        }
        int choice = getOption(list);
        if (choice > 0) {
            transferTo(list.get(choice-1), currentUser);
        } else {
            System.out.println("Hatolik, boshqatdan urinib ko'ring!");
            personalInformation(currentUser);
        }

    }

    public void refundMoney(User currentUser) {
        showUserInfo(currentUser);
        System.out.println(REFUND_BALANCE);
        String refund;
        refund = scanner.nextLine();
        if (checkNumber(refund)) {
            if (currentUser.getBalance() - parseToInt(refund) >= 0) {
                currentUser.setBalance(currentUser.getBalance() - parseToInt(refund));
                System.out.println(SUCCESS_REFUND_BALANCE);
                getBalance(currentUser);
            } else {
                System.out.println(REFUND_BALANCE_ERROR);
                refundMoney(currentUser);
            }
        }
    }

}
