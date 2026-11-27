

class LRUCache {

    // Node of a Doubly LinkedList
    class Node {
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // HashMap stores key -> Node reference
    HashMap<Integer, Node> map;

    // Dummy head and tail nodes
    Node head;
    Node tail;

    int capacity;

    // Constructor
    public LRUCache(int capacity) {

        this.capacity = capacity;

        // Initialize HashMap
        map = new HashMap<>();

        // Create dummy nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);

        // Initially connect head and tail
        head.next = tail;
        tail.prev = head;
    }

    // Remove a node from its current position
    private void remove(Node node) {

        // Get previous and next nodes
        Node prevNode = node.prev;
        Node nextNode = node.next;

        // Connect them directly
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // Insert a node immediately after head
    private void insertAfterHead(Node node) {

        // Get current first node
        Node nextNode = head.next;

        // Connect new node
        node.prev = head;
        node.next = nextNode;

        // Update surrounding nodes
        head.next = node;
        nextNode.prev = node;
    }

    // Move an existing node to the front
    private void moveToFront(Node node) {

        remove(node);
        insertAfterHead(node);
    }

    // Get value corresponding to key
    public int get(int key) {

        // Key doesn't exist
        if (!map.containsKey(key)) {
            return -1;
        }

        // Get node directly from HashMap
        Node node = map.get(key);

        // Mark as recently used
        moveToFront(node);

        return node.value;
    }

    // Insert or update key-value pair
    public void put(int key, int value) {

        // Check if key already exists
        if (map.containsKey(key)) {

            // Get existing node
            Node node = map.get(key);

            // Update its value
            node.value = value;

            // Mark it as recently used
            moveToFront(node);
        }

        else {

            // Create a new node
            Node newNode = new Node(key, value);

            // Store key and node in HashMap
            map.put(key, newNode);

            // Insert new node at the front
            insertAfterHead(newNode);

            // Check whether capacity is exceeded
            if (map.size() > capacity) {

                // Last actual node is the LRU node
                Node lru = tail.prev;

                // Remove it from the linked list
                remove(lru);

                // Remove its key from HashMap
                map.remove(lru.key);
            }
        }
    }
}

