package Applications;

import Company.Company;

public class main {
    public static void main(String[] args){
        Company.generate();
        Company.printAllCompact();
        System.out.println();
        Company.printAllDetailed();

    }
}
