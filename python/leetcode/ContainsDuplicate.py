def containsDuplicate(nums):
    newArray = set()
    for num in nums:
        if num in newArray:
            return True
        newArray.add(num)
    return False