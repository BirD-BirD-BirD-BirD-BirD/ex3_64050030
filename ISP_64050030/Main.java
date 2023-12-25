public class Main {
    public static void main(String[] args){
        System.out.println("--CEO roles---");
        CEO ceo = new CEO();
        ceo.salary();
        ceo.addbonus();
        ceo.makeDecisions();
        ceo.addStocks();

        System.out.println("--Manger roles---");
        Manager manager = new Manager();
        manager.salary();
        manager.addbonus();
        manager.hire();
        manager.train();

        System.out.println("--Employee roles---");
        Employee employee = new Employee();
        employee.salary();
    }
}
