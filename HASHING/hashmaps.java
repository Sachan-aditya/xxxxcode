1. Chaining (Linked List)

Formula: None (just store colliding elements in a linked list)
Program:
java

        Verify

Open In Editor
        Edit
Copy code
public class ChainingHashMap {
    private LinkedList<Entry>[] table;

    public ChainingHashMap(int size) {
        table = new LinkedList[size];
    }

    public void put(int key, String value) {
        int index = key % table.length;
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        table[index].add(new Entry(key, value));
    }

    public String get(int key) {
        int index = key % table.length;
        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    private static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
2. Linear Probing

Formula: index = (hash(key) + i) % tableSize
Program:
java

        Verify

Open In Editor
        Edit
Copy code
public class LinearProbingHashMap {
    private Entry[] table;

    public LinearProbingHashMap(int size) {
        table = new Entry[size];
    }

    public void put(int key, String value) {
        int index = hash(key);
        int i = 0;
        while (table[index] != null) {
            index = (index + i) % table.length;
            i++;
        }
        table[index] = new Entry(key, value);
    }

    public String get(int key) {
        int index = hash(key);
        int i = 0;
        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + i) % table.length;
            i++;
        }
        return null;
    }

    private int hash(int key) {
        return key % table.length;
    }

    private static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
3. Quadratic Probing

Formula: index = (hash(key) + i^2) % tableSize
Program:
java

        Verify

Open In Editor
        Edit
Copy code
public class QuadraticProbingHashMap {
    private Entry[] table;

    public QuadraticProbingHashMap(int size) {
        table = new Entry[size];
    }

    public void put(int key, String value) {
        int index = hash(key);
        int i = 0;
        while (table[index] != null) {
            index = (index + i * i) % table.length;
            i++;
        }
        table[index] = new Entry(key, value);
    }

    public String get(int key) {
        int index = hash(key);
        int i = 0;
        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + i * i) % table.length;
            i++;
        }
        return null;
    }

    private int hash(int key) {
        return key % table.length;
    }

    private static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
4. Double Hashing

Formula: index = (hash1(key) + i * hash2(key)) % tableSize
Program:
java

        Verify

Open In Editor
        Edit
Copy code
public class DoubleHashingHashMap {
    private Entry[] table;

    public DoubleHashingHashMap(int size) {
        table = new Entry[size];
    }

    public void put(int key, String value) {
        int index = hash1(key);
        int i = 0;
        while (table[index] != null) {
            index = (index + i * hash2(key)) % table.length;
            i++;
        }
        table[index] = new Entry(key, value);
    }

    public String get(int key) {
        int index = hash1(key);
        int i = 0;
        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + i * hash2(key)) % table.length;
            i++;
        }
        return null;
    }

    private int hash1(int key) {
        return key % table.length;
    }
