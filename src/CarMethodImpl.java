public class CarMethodImpl implements CarMethod {

    Car[] cars = new Car[4];
    int count = 0;

    @Override
    public String createCar(Car car) {
        cars[count++] = car;
        return "Ийгиликтуу катталды: ";
    }

    @Override
    public Car getCarById(Long id) {
        try {
            if (id <= 0) {
                throw new ArithmeticException("Мындай айди болбойт");
            }
            for (Car car : cars) {
                if (car.getId() == id) {
                    return car;
                } else {
                    throw new RuntimeException("Id туура эмес :");
                }
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public Car[] getAllCars() {
        return cars;
    }

    @Override
    public String updateCar(Long id, Car newCar) {
        newCar.setId(newCar.getId());
        newCar.setModel(newCar.getModel());
        newCar.setName(newCar.getName());
        newCar.setPrice(newCar.getPrice());
        newCar.setIssuedDate(newCar.getIssuedDate());
        newCar.setCarType(newCar.getCarType());

        return "Ийгиликтуу катталды жаны машина: ";
    }

    @Override
    public String deleteCarById(Long id) {
        try {
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] != null && cars[i].getId() == id) {
                    cars[i] = null;
                } else {
                    throw new RuntimeException("Индекс очурулгон жок: ");
                }
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }
        return "Ийгиликтуу очту:";
    }
    }
