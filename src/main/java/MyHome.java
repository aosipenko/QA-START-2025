import java.util.Random;

public class MyHome {public static void main(String[] args) {
    int[] hotelRooms = new int[15];
    Random rand = new Random();
    for (int i = 0; i < hotelRooms.length; i++) {
        hotelRooms[i] = rand.nextInt(25);
    }

    //1. ми не знаємо скільки разів ми будем пробігати масивом
    //2. ми знаємо, що масив відсортовано тоді, коли ми не поміняли місцями жодних двох елементів
    //3. елементи порівнюються попарно, пичнаючи з інедксу 1, і "озираючись" назад. Тобто 1 і 0, 2 і 1
    //4. якщо поточний елемент менший за попредній, поміняти їх місцями

    boolean unsorted = hotelRooms.length > 1;

    while (unsorted) {
        boolean elementsSwitched = false;
        for (int i = 0; i < hotelRooms.length - 1; i++) {
            int currentElement = hotelRooms[i];//8
            int previousElement = hotelRooms[i + 1];//1

            if (previousElement > currentElement) {
                elementsSwitched = true;
                unsorted = true;
                hotelRooms[i] = previousElement;
                hotelRooms[i + 1] = currentElement;
            }

            if (!elementsSwitched) {
                unsorted = false;
            }
        }