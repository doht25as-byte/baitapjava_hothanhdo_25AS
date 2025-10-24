public class TestAuthor {
    public static void main(String[] args) {
        Author ahteck = new Author("thanhdo"," hothanhdo.com ",'m');
        System.out.println(ahteck);
        ahteck.setEmail("hothanhdo.com");
        System.out.println("name is: "+ ahteck.getName());
        System.out.println("email: "+ ahteck.getEmai());
        System.out.println("gender: "+ ahteck.getGender());
    }

}
