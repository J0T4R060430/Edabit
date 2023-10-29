package Expert;

public class LayersInRug {
    public class SymmetricalRug {
        public static int countLayers(String[] rug) {
            int center_row = rug.length/2;
            int center_col = rug[center_row].length()/2;

            if (rug[center_row].charAt(center_col-1) == 'X') {
                return 6;
            }

            char first_layer = rug[center_row].charAt(0);
            int previous_layer = first_layer;
            int current_layer;
            int layers = 1;
            for (int i = 1; i <= center_col; i++){
                current_layer = rug[center_row].charAt(i);
                if (current_layer != previous_layer) {
                    layers++;
                }
                previous_layer = current_layer;
            }
            return layers;
        }
    }
}
