class Solution {
    int size;
    int[] keys;
    int[] values;

    void init(int sz) {
        size = sz;
        keys = new int[size];
        values = new int[size];
    }

    public int hash(int x) {
        x = ((x >> 16) ^ x) * 0x45d9f3b;
        x = ((x >> 16) ^ x) * 0x45d9f3b;
        x = (x >> 16) ^ x;
        return Math.floorMod(x, size);
    }

    void set(int key, int value) {
        int code = hash(key);
        int k = keys[code];
        int v = values[code];
        while (v != 0 && key != k) {
            code = (code + 1) % size;
            k = keys[code];
            v = values[code];
        }
        keys[code] = key;
        values[code] = value + 1;
    }

    int get(int key) {
        int code = hash(key);
        int k = keys[code];
        int v = values[code];
        while (v != 0 && key != k) {
            code = (code + 1) % size;
            k = keys[code];
            v = values[code];
        }
        return v - 1;
    }

    public int[] twoSum(int[] nums, int target) {
        init(nums.length * 2 + 1);
        int[] result = new int[2];

        for (int i = 0; i < nums.length; ++i) {
            int needed = target - nums[i];
            int got = get(needed);
            if (got != -1) {
                result[0] = i;
                result[1] = got;
                break;
            }
            set(nums[i], i);
        }

        return result;
    }
}