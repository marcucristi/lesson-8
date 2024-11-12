package task1;

 class Details {
    public static void main(String[] args){
        Employee emp1 = new Employee("John Wick", 27, "Dog care");

        System.out.println("Nume : " + emp1.getName());
        System.out.println("Varsta : " + emp1.getAge());
        System.out.println("Department : " + emp1.getDepartment());

        emp1.setName("James Bond");
        emp1.setAge(31);
        emp1.setDepartment("Cia");

        System.out.println();

        System.out.println("New Nume : " + emp1.getName());
        System.out.println("New Varsta : " + emp1.getAge());
        System.out.println("New Department : " + emp1.getDepartment());

    }
}
