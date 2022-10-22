import java.util.ArrayList;

public class FlipImage {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> image = new ArrayList<>(3);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(0);
        list2.add(0);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(1);

        image.add(list1);
        image.add(list2);
        image.add(list3);

        System.out.println(solution(image));

    }

    public static ArrayList<ArrayList<Integer>> solution(ArrayList<ArrayList<Integer>> image) {
        ArrayList<ArrayList<Integer>> image1 = new ArrayList<>(3);

        for (int i = 0; i < image.size(); i++) {
            image1.add(new ArrayList<>());
        }

        for (int i = 0; i < image.size(); i++) {
            for (int j = image.get(i).size() - 1; j >= 0; j--) {
                image1.get(i).add(image.get(i).get(j));
            }
        }

        for (int i = 0; i < image1.size(); i++) {
            for (int j = 0; j < image1.get(i).size(); j++) {
                if (image1.get(i).get(j) == 0) {
                    image1.get(i).remove(j);
                    image1.get(i).add(j, 1);
                } else {
                    image1.get(i).remove(j);
                    image1.get(i).add(j, 0);
                }
            }
        }

        return image1;
    }
}
