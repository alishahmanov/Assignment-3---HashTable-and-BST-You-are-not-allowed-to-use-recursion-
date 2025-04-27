import java.util.Random;

public class TestMyHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Chef> table = new MyHashTable<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "ChefName" + random.nextInt(100000);
            MyTestingClass key = new MyTestingClass(id, name);
            Chef value = new Chef("Chef" + i, 1 + random.nextInt(40));
            table.put(key, value);
        }

        int[] bucketSizes = table.getBucketSizes();

        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i] + " elements");
        }
    }
}
