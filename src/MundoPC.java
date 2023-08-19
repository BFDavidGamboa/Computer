import com.gm.mundopc.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MundoPC {
    public static void main(String[] args) {

        ///Toshiba computers
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Keyboard keyboardToshi = new Keyboard("bluetooth", "Toshiba");
        Mouse mouseToshi = new Mouse("bluetooth", "Toshiba");
        Computer compuToshiba = new Computer("Computer Toshiba", monitorToshi, keyboardToshi, mouseToshi);

        //Dell computer creation
        Monitor monitorDell = new Monitor("Dell", 15);
        Keyboard keyboardDell = new Keyboard("usb", "Dell");
        Mouse mouseDell = new Mouse("USB", "dell");
        Computer compuDell = new Computer("Computadora dell", monitorDell, keyboardDell, mouseDell);

        //armada computers creation
        Computer buildedComputer = new Computer("Builded computer", monitorDell, keyboardDell, mouseDell);

        //We aggregate the computers to the order
        Order order1 = new Order();
        order1.addComputer(compuToshiba);
        order1.addComputer(compuDell);
        order1.addComputer(buildedComputer);
        System.out.println("");
        order1.showOrder();

        //Agragate a second order
        Order order2 = new Order();
        order2.addComputer(buildedComputer);
        order2.addComputer(compuDell);
        System.out.println("");
        order2.showOrder();

        //Agregate a third order
        Order order3 = new Order();
        order3.addComputer(buildedComputer);
        order3.addComputer(compuDell);
        System.out.println("");
        order3.showOrder();

    }
}