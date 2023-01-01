public class RegexPracticeP2 {
    public static void main(String[] args) {
//        System.out.println("lat".matches("\\wat"));//chir word character theo sau là at
//
//        //\\d chỉ cho phép số không cho phép chữ
//        System.out.println("1ta".matches("\\dta"));
//        System.out.println("1a4".matches("\\d\\d\\d"));
//
//        //phúc tạp hơn muốn khớp với phone number thì sao?
//
//        System.out.println("126-637-5537".matches("\\d{3}[.-]\\d{3}[.-]\\d{4}"));
//        System.out.println("126-637 5537".matches("\\d{3}[-.,\\s]\\d{3}[-,.\\s]\\d{4}"));
//        //nếu nhiều cái bên trong [] thì phải làm sao
//        System.out.println("126-------    637 5537".matches("\\d{3}[-.,\\s]+\\d{3}[-,.\\s]+\\d{4}"));// + :one or more bên trong[]
//        //nếu nhập vào mà không có khoảng trắng thì phải làm sao
//        System.out.println("1266375537".matches("\\d{3}[-.,\\s]*\\d{3}[-,.\\s]*\\d{4}"));// *: zero or more trong dấu[]
//        System.out.println("1266375537".matches("\\d{3}[-.,\\s]?\\d{3}[-,.\\s]?\\d{3,4}"));// ?: zero or one trong dấu []
        //viết tắt
        System.out.println("126-637-5537".matches("(\\d{3}[-.,\\s]){2}\\d{4}"));
        System.out.println("1-126-637-5537".matches("(\\d[-,.\\s]?)?((\\d{3}[-,.\\s]?){2})\\d{4}"));







    }
}
