import sys
from array import *

# list - hold any item, replace any item, changes size
lst = list()            # List<Object> lst = new ArrayList<>(); // (LinkedList<>, etc)
lst = []
lst = [1, 'one', 5.5]   # List<Object> lst = Arrays.asList(1, "one", 5.5);
print("List")
print(lst)

# tuple - hold any item, can't replace items, can't change size
tup = tuple()           # closest java equivalent is an array
tup = ()                # Object[] arr = new Object[5];
tup = (1, 'one', 5.5)   # Object[] arr = {1, "one", 5.5};
print("\nTuple")
print(tup)

# sets - hold any item, unordered, no duplicate items (last item used)
my_set = set()              # Set<Object> my_set = new HashSet<>();
my_set = {1, 'one', 5.5}    # my_set.add(1); my_set.add("one"); my_set.add(5.5);
# my_set = {} # Not a set, this creates an empty dictionary
print("\nSet")
print(my_set)

# dictionary - key-value pairs, any type, unique keys (keys are sets)
dic = dict()            # Map<Object, Object> map = new HashMap<>();
dic = {}                # map.put("key1", 100); map.put("key2", 200); map.put(5.5, 500);
dic = {'key1' : 100, 'key2' : 200, 3.3 : 500}
print("\nDictionary")
print(dic)

# array - hold only 1 type, fixed size, sequentially stored items
# b = byte, i = integer, f = float
arr = array('f', [0, 1])
print("\nArray")
print(arr)
# print(sys.getsizeof(arr) - 32)
