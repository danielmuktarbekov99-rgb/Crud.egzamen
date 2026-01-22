public interface CarMethod {

    String createCar(Car car);
    Car getCarById(Long id);
    Car[] getAllCars();
    String updateCar(Long id,Car car);
    String deleteCarById(Long id);

}






