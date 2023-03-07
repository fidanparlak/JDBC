public class JDBC01_Query01 {
    public static void main(String[] args) throws ClassNotFoundException{

        // 1 - Ilgili Driver'i yuklemeliyiz. MySQL kullandigimizi bildiriyoruz.
        // Driver'i bulamama ihtimaline karsi forName metodu icin ClassNotFoundException
        // method signature'imiza axception olarak firlatmamizi istiyor.

        Class.forName("com.mysql.cj.jdbc.Driver");



    }
}
    git init
    git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/fidanparlak/JDBC.git
        git push -u origin main