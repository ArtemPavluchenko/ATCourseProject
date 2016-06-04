package ATcom.InternetStore.CartCore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanya on 31.05.2016.
 */
public class Customer {
    protected String customerName;
    protected String customerSurname;
    protected long customerCreditCardNumber;
    protected int customerCreditCardBalance;
    private static List<Customer> customers=new ArrayList<>();

    public enum CustomerStatus {
        NEW("new"), ACTIVE("active");

        private final String name;

        private CustomerStatus(String name){
            this.name=name;
        }

        public boolean equalsName(String otherName){
            return (otherName==null)?false:name.equals(otherName);
        }
        @Override
        public String toString() {
            return "CustomerStatus{" +
                    "name='" + name + '\'' +
                    '}';
        }
        public void indicateStatus(){
            for (CustomerStatus value: CustomerStatus.values()){
                System.out.println("status: "+value.name());
            }
        }
    }

    public Customer() {

    }

    public Customer(String customerName, String customerSurname, long customerCreditCardNumber,
                    int customerCreditCardBalance) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerCreditCardBalance = customerCreditCardBalance;
        this.customerCreditCardNumber=customerCreditCardNumber;


    }

    public static void addToCustomersArray(Customer customer) {
        if (!isNew(customer)) {
            //Мне кажется такая проверка не совсем корректна, так как довольно часто случается такое что имена и
            //фамилии совпадают, если проводить подобную проверку, тогда лучше ввести параметр "логин" или "ник", и
            //сравнивать по нему
            System.out.println("A customer with such a name already exists.");
        } else if (isNew(customer)) {
            customers.add(customer);
        }
    }


    public List getFromCustomersArray(){
        return customers;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public Customer setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
        return this;
    }

    public long getCustomerCreditCardNumber() {
        return customerCreditCardNumber;
    }

    public Customer setCustomerCreditCardNumber(long customerCreditCardNumber) {
        this.customerCreditCardNumber = customerCreditCardNumber;
        return this;
    }

    public int getCustomerCreditCardBalance() {
        return customerCreditCardBalance;
    }

    public Customer setCustomerCreditCardBalance(int customerCreditCardBalance) {
        this.customerCreditCardBalance = customerCreditCardBalance;
        return this;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer setCustomers(List<Customer> customers) {
        this.customers = customers;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerCreditCardNumber != customer.customerCreditCardNumber) return false;
        if (customerCreditCardBalance != customer.customerCreditCardBalance) return false;
        if (customerName != null ? !customerName.equals(customer.customerName) : customer.customerName != null)
            return false;
        if (customerSurname != null ? !customerSurname.equals(customer.customerSurname) : customer.customerSurname != null)
            return false;
        return customers != null ? customers.equals(customer.customers) : customer.customers == null;

    }

    @Override
    public int hashCode() {
        int result = customerName != null ? customerName.hashCode() : 0;
        result = 31 * result + (customerSurname != null ? customerSurname.hashCode() : 0);
        result = 31 * result + (int) (customerCreditCardNumber ^ (customerCreditCardNumber >>> 32));
        result = 31 * result + customerCreditCardBalance;
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerCreditCardNumber=" + customerCreditCardNumber +
                ", customerCreditCardBalance=" + customerCreditCardBalance+
                '}';
    }

    public static boolean isNew(Customer customer) {
        for (Customer cst:customers)
            if (cst.getCustomerName()==customer.getCustomerName()) {
                CustomerStatus cs = CustomerStatus.ACTIVE;
                return false;
            } else {
                CustomerStatus cs = CustomerStatus.NEW;
                return true;
            }
        return true;
    }

    public static String showCustomerList(){
        return customers.toString();
    }
}
