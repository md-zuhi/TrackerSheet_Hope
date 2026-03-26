class Solution {
    public String defangIPaddr(String address) {
        String val = address.replace(".","[.]");
        return val;
    }
}