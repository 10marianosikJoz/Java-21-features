package record;

import java.util.List;

record Shipment(String sender, String receiver, List<String> items) {

    //Canonical constructor useful when defensive copy is needed.
    Shipment(String sender, String receiver, List<String> items) {
        this.sender = sender;
        this.receiver = receiver;
        this.items = List.copyOf(items);
    }
}
