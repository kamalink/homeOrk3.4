package module3.homeOrk4;

class Main {
    public static void main(String[] args) {
        User Mark = new User("Mark", 2000, 7, "Voltex", 850, "USD");

        /*paying salary test*/
        Mark.paySalary();
        System.out.println(Mark.getBalance());

        /* Withdraw test*/
        System.out.println(Mark.withdraw(600));

        /*Company name test*/
        System.out.println(Mark.companyNameLenght());

        /*Months increaser test*/
        System.out.println(Mark.monthsIncreaser(1));
    }
}
