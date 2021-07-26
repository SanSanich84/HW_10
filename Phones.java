package HomeWork_10;
import java.util.*;
public class Phones {

        private HashMap<String, List<Long>> numberPhone;
        public Phones() {
            this.numberPhone = new HashMap<String, List<Long>>();
        }
        public void add(String s, Long l) {
            List<Long> num = new ArrayList<Long>();

            if (this.numberPhone.containsKey(s)){
                num = this.numberPhone.get(s);
                num.add(l);
                this.numberPhone.put(s, num);
            }
            else {
                num.add(l);
                this.numberPhone.put(s, num);
            }
        }
        public String get(String s){
            String res = "";

            if (this.numberPhone.containsKey(s)) {
                res = "Телефон абонента " + s + ": " + this.numberPhone.get(s).toString();
            } else {
                res = "Такого абонента не существует";
            }
            return res;
        }
    }

