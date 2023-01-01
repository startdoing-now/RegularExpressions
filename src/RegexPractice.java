public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("[c]at"));//kiểu tra xem cos bắt đầu bằng c và theo sau là at không
        System.out.println("tat".matches("[a-z]at"));//true
        System.out.println("cat".matches("[^c]at"));//tất trả các kí tự ngoại trừ kí tự c kết quả ra false



    }
}
