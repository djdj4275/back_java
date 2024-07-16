package section11.Practice;

/*  
    ex.1 아래와 같이 출력되도록 코드를 완성하시오.
    Printing: Document1.pdf
    Scanning: Document2.pdf
 */

abstract class Printable {
    abstract void print(String document);
}

abstract class Scannable {
    abstract void scan(String document);
}

class SamsungPrinter extends Printable{
    @Override
    void print(String document) {
        System.out.println("Printing: "+ document);
    }
}
class SamsunScanner extends Scannable{
    @Override
    void scan(String document) {
        System.out.println("Scanning: "+ document);
    }
}

// ex.2 interface 버전
interface Printable2 {
    abstract void print(String document);
}

interface Scannable2 {
    abstract void scan(String document);
}

interface Multi extends Printable2, Scannable2 {
    abstract void fax(String document);
}

class MultiFunctionPrint implements Multi {
    @Override
    public void print(String document) {
        System.out.println("Printing: "+ document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: "+ document);
    }

    @Override
    public void fax(String document) {
        System.out.println("faxing: "+ document);
    }
}

public class Practice {
    public static void main(String[] args) {
        SamsungPrinter sp = new SamsungPrinter();
        SamsunScanner ss = new SamsunScanner();

        sp.print("Document1.pdf");
        ss.scan("Document2.pdf");

        MultiFunctionPrint mf = new MultiFunctionPrint();
        mf.print("Document1.pdf");
        mf.scan("Document2.pdf");
        mf.fax("faxing");
    }
}
