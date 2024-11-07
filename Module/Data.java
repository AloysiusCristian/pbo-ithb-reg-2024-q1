package Module;

import java.util.HashMap;

public class Data {
    public static HashMap<String, Tiket> listTiket = new HashMap<String, Tiket>();

    public static int code = 0;

    public static HashMap<String, Tiket> getListTiket() {
        return listTiket;
    }

    public static void setListTiket(HashMap<String, Tiket> listTiket) {
        Data.listTiket = listTiket;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Data.code = code;
    }
}
