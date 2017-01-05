package module3.homeOrk4;

class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


     User(String name, int balance, int monthsOfEmployment,
                String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    void paySalary() {
        balance = getBalance() + salary;
    }


    int withdraw(int summ) {
        int commission;

        if(summ < 1000){
            commission = summ/20;
            return getBalance() - summ - commission;
        } else {
            commission = summ/10;
            return getBalance() - summ - commission;
        }
    }


    int companyNameLenght() {
        return companyName.length();
    }


    int monthsIncreaser(int addMonth) {
       return monthsOfEmployment = getMonthsOfEmployment() + addMonth;
      }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
