package lesson_27;

import java.util.Arrays;

/*
Ассоциация - это связь, при которой один объект связан с другим объектом

Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое"

Композиция - это более жесткая форма агрегации. НО где часть не может существовать без целого.

Ассоциации (в том числе и Агрегация, и Композиция) реализуется через создание ссылок в классе на другие объекты.
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Автобус содержит Водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса

Автобус содержит Автопилот HAS-A. Композиция. Автопилот является неотъемлимой частью автобуса.
Жесткая / неразрывная связь

Важные аспекты ассоциации.

Направленность. Ассоциация может однонаправленная или двунаправленная связь

Кардинальность связи. Определяет сколько объектов одного класса может быть ассоциировано с
объектом

One-to-One, One-to-many, Many-to-Many

1 : 1. Автобус и двигатель
Каждый автобус может иметь ровно однин двигатель.

1 : Many
Автобус и много пассажиров

Many-to-Many -> Список автобусов и список автобусных остановок


 */
public class Autobus {
    private static int counter = 1;
    //Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // Агрегация
    private Autopilot autopilot; // Композиция

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v001");
        this.passengers = new Passenger[capacity];
    }

    // Переписываем метод toString() с помощью StringBuilder
    //Применив StringBuilder мы экономим память и время
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus {");
        sb.append("id=").append(id).append(", ");
        sb.append("driver=").append(driver.toString()).append(", ");
        sb.append("autopilot=").append(autopilot.toString()).append(", ");
        sb.append("capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }


//    @Override
//    public String toString() {
//        return "Autobus {" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autopilot=" + autopilot.toString() +
//                ", capacity=" + capacity +
//                '}';
//    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        1. Надо проверить свободное место
        2. Находится ли этот пассажир в автобусе
        3. Если есь место и пассажир еще не в автобусе - садим на борт
            true
        4. Иначе (3.3) что-то пошло не так
        false
         */
        if (countPassengers < capacity) {
            // Место есть
            //Надо проверить п.2
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n"
                        , passenger.getId(), this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобусе с id %d\n"
                    , passenger.getId(), this.id);
            return true;
        }
        System.out.printf("В автобусе с id %d свободных мест нет"
                , passenger.getId());
        return false;
    }

    /*
    Реализация метода dropPassenger
    1. Проверяем на корректность объект Passenger.
    2. Находим пассажира в массиве.
    3. Если пассажир найден, сдвигаем оставшиеся элементы массива влево.
    4. Обнуляем последний элемент массива (чтобы избежать дубликатов).
    5. Уменьшаем счетчик countPassengers.
    6. Выводим сообщение об успешной высадке.
    7. Если пассажир не найден, выводим сообщение и возвращаем false.
     */

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) return false;

        // Проверяем, есть ли пассажир в автобусе
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // Смещаем всех пассажиров после удаляемого влево
                for (int j = i; j < countPassengers - 1; j++) {
                    passengers[j] = passengers[j + 1];
                }

                // Убираем последний элемент (избегаем дубликатов)
                passengers[countPassengers - 1] = null;

                // Уменьшаем счетчик пассажиров
                countPassengers--;

                System.out.printf("Пассажир с id %d вышел из автобуса с id %d\n",
                        passenger.getId(), this.id);
                return true;
            }
        }

        System.out.printf("Пассажир с id %d не найден в автобусе с id %d\n",
                passenger.getId(), this.id);
        return false;
    }


    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        //нет в массиве пассажиров нет пассажира с таким id
        return false;
    }

    //    public void setDriver(BusDriver driver) {
//        this.driver = driver;
//    }
    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);

    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }



}