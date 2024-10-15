import database.DAO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DAO dao = new DAO();
        dao.run();
    }
}