package MaximumSubarray

func maxSubArray(nums []int) int {
	currentMax := -2_000_000_000
	currentMaxPlusNext := 0
	for i := 0; i < len(nums); i++ {
		currentMaxPlusNext += nums[i]
		if currentMax < currentMaxPlusNext {
			currentMax = currentMaxPlusNext
		}
		if currentMaxPlusNext < 0 {
			currentMaxPlusNext = 0
		}
	}
	return currentMax
}
