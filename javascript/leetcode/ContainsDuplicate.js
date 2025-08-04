function containsDuplicate(nums) {
    let newArray = new Set();
    for (let i = 0; i < nums.length; i++) {
        if (newArray.has(nums[i])) {
            return true;
        }
        newArray.add(nums[i]);
    }
    return false;
}
