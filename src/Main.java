//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

    CarMethod carMethod = new CarMethodImpl();
    Scanner scanner = new Scanner(System.in);
    boolean istrue = true;
    while (istrue) {

        System.out.println("""
                1. create Car
                2. get All Car
                3. get by id
                4. update Car
                5. delete Car
                """);

        System.out.println("Выбери : ");
        int a = scanner.nextInt();
        switch (a) {
            case 1: {
                Car car = new Car();
                System.out.println("Id jaz ");
                car.setId(scanner.nextLong());
                scanner.nextLine();

                System.out.println("Model jaz ");
                car.setModel(scanner.nextLine());

                System.out.println("Name jaz ");
                car.setName(scanner.nextLine());

                System.out.println("баасын жаз: ");
                car.setPrice(scanner.nextLong());
                scanner.nextLine();

                System.out.println("LocalDate жаз ");
                car.setIssuedDate(LocalDate.parse(scanner.nextLine()));

                System.out.println("Enum Car type жаз:");
                car.setCarType(CarType.valueOf(scanner.nextLine()));
                System.out.println(carMethod.createCar(car));

                break;
            }
            case 2: {
                System.out.println(Arrays.toString(carMethod.getAllCars()));
                break;
            }
            case 3: {
                System.out.println("Write id :");
                long id = scanner.nextLong();
                System.out.println(carMethod.getCarById(id));
                break;
            }
            case 4: {
                System.out.println("Write id: ");
                long id = scanner.nextLong();
                scanner.nextLine();
                Car car = new Car();
                System.out.println("Model");
                car.setModel(scanner.nextLine());
                System.out.println("Name");
                car.setName(scanner.nextLine());
                System.out.println("Price");
                car.setPrice(scanner.nextLong());
                scanner.nextLine();
                System.out.println("Localdate data");
                car.setIssuedDate(LocalDate.parse(scanner.nextLine()));
                System.out.println("Enum type");
                car.setCarType(CarType.valueOf(scanner.nextLine()));
                System.out.println(carMethod.updateCar(id, car));
                break;
            }
            case 5: {
                System.out.println("Inter to delete id");
                long id = scanner.nextLong();
                try {
                    System.out.println(carMethod.deleteCarById(id));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());

                }break;
            }
            case 6:{
                istrue=false;
                break;
            }
        }
    }
}








