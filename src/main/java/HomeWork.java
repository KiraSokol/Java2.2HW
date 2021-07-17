public class HomeWork {

        public static void main(String[] args) {


            String[][] arr = new String[][]{
                    {"11", "23", "47", "5"},
                    {"5", "3", "2", "7"},
                    {"7", "4", "8", "10"},
                    {"4", "7", "8", "4"}};


            if (arr.length != 4) try {
                throw new MyArraySizeException("Wrong array size");
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try { sum += Integer.parseInt(arr[i][j]);
                        throw new MyArrayDataException("Invalid data format"); //Куда это засунуть, чтобы не выскакивало, когда не надо?
                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(sum);

        }

    }

    class MyArrayDataException extends Throwable {
        public MyArrayDataException(String string) {
            super(string);
        }
    }
    class MyArraySizeException extends Throwable {
        public MyArraySizeException(String string) {
            super(string);
        }
    }

