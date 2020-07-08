import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        ArrayList<Signal> handshake = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            if (((number >> i) & 1) == 1) handshake.add(Signal.values()[i]);
        }
        if (number >= (1 << 4)) Collections.reverse(handshake);
        return handshake;
    }
}