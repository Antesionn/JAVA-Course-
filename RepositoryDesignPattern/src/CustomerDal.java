public class CustomerDal implements IEntityRepository <Customer>{
    @Override
    public void add(Customer entity) {
        System.out.println("Customer added");
    }

    @Override
    public void update(Customer entity) {
        System.out.println("Customer updated");
    }

    @Override
    public void delete(Customer entity) {
        System.out.println("Customer deleted");
    }
}
