import java.time.LocalDate;

public class Car{

    private long id;
    private String model;
    private String name;
    private double price;
    private LocalDate issuedDate;
    private CarType carType;

    public Car() {
    }

    public Car(long id, String model, String name, double price, LocalDate issuedDate, CarType carType) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.price = price;
        this.issuedDate = issuedDate;
        this.carType = carType;
    }

    public Car(String daniel, String m5F90, String bmw, int price, int i, CarType carType) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", issuedDate=" + issuedDate +
                ", carType=" + carType +
                '}';
    }
}






































