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
                5. deleete CAr
                """);

        System.out.println("Выбери : ");
        int a = scanner.nextInt();
        switch (a) {
            case 1: {
                Car car = new Car();
                System.out.println();
                car.setId(scanner.nextLong());
                car.setModel(scanner.nextLine());
                car.setName(scanner.nextLine());
                car.setPrice(scanner.nextLong());
                car.setIssuedDate(LocalDate.parse(scanner.nextLine()));
                car.setCarType(CarType.valueOf(scanner.nextLine()));
carMethod.createCar(car);

                break;
            }
            case 2: {
                System.out.println(Arrays.toString(carMethod.getAllCars()));
                break;
            }
            case 3: {
                System.out.println("Write id :");
                long id = scanner.nextLong();
                carMethod.getCarById(id);
                break;
            }
            case 4: {
                System.out.println("Write id: ");
                long id = scanner.nextLong();
                Car car = new Car();
                car.setModel(scanner.nextLine());
                car.setName(scanner.nextLine());
                car.setPrice(scanner.nextDouble());
                car.setIssuedDate(LocalDate.parse(scanner.nextLine()));
                car.setCarType(CarType.valueOf(scanner.nextLine()));
                carMethod.updateCar(id, car);
                break;
            }
            case 5: {
                System.out.println("Inter to delete id");
                long id = scanner.nextLong();
                try {
                    carMethod.deleteCarById(id);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
            case 6:{
                istrue=false;
                break;
            }
        }
    }
}