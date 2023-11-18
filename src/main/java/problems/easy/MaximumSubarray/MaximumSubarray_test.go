package MaximumSubarray

import (
	"fmt"
	"log"
	"os"
	"testing"

	"github.com/dailymotion/allure-go"
	"github.com/joho/godotenv"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
	"github.com/stretchr/testify/assert"
)

const (
	Epic    = "epic Problems"
	Feature = "feature Easy"
	Story   = "story Maximum subarray"
)

var _ = Describe("CountBits()", func() {
	It("basic tests", func() {
		Expect(MaxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4})).To(Equal(6))
		Expect(MaxSubArray([]int{1})).To(Equal(1))
		Expect(MaxSubArray([]int{5, 4, -1, 7, 8})).To(Equal(23))
		Expect(MaxSubArray([]int{5, -3, 6, -7, 6})).To(Equal(8))
		Expect(MaxSubArray([]int{6, -7, 6, -3, 5})).To(Equal(8))
		Expect(MaxSubArray([]int{-2, -3, 4, -1, -2, 1, 5, -3})).To(Equal(7))
		Expect(MaxSubArray([]int{-1})).To(Equal(1))
		Expect(MaxSubArray([]int{-2, -1})).To(Equal(1))
	})
})

// https://towardsdatascience.com/use-environment-variable-in-your-next-golang-project-39e17c3aaa66
// use godot package to load/read the .env file and
// return the value of the key
func goDotEnvVariable(key string) string {

	// load .env file
	err := godotenv.Load("../../../../../../variables.env")

	if err != nil {
		log.Fatalf("Error loading .env file")
	}

	fmt.Println("var: " + os.Getenv(key))

	return os.Getenv(key)
}

func dotest(input []int, exp int) {
	var ans = MaxSubArray(input)
	Expect(ans).To(Equal(exp))
}

func TestStepBitCounting(t *testing.T) {
	goDotEnvVariable("ALLURE_RESULTS_PATH")
	t.Parallel()
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 01"),
		allure.Action(func() {
			Expect(MaxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4})).To(Equal(6))
			assert.Equal(t, MaxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6, "The two arrays should be the same.")
			// if MaxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}) != 6 {
			// 	t.Errorf("%q", 1)
			// 	t.Fail()
			// }
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 02"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{1})).To(Equal(1))
			assert.Equal(t, MaxSubArray([]int{1}), 1, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 03"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{5, 4, -1, 7, 8})).To(Equal(23))
			assert.Equal(t, MaxSubArray([]int{5, 4, -1, 7, 8}), 23, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 04"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{5, -3, 6, -7, 6})).To(Equal(8))
			assert.Equal(t, MaxSubArray([]int{5, -3, 6, -7, 6}), 8, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 05"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{6, -7, 6, -3, 5})).To(Equal(8))
			assert.Equal(t, MaxSubArray([]int{6, -7, 6, -3, 5}), 8, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 06"),
		allure.Action(func() {
			Expect(MaxSubArray([]int{-2, -3, 4, -1, -2, 1, 5, -3})).To(Equal(7))
			assert.Equal(t, MaxSubArray([]int{-2, -3, 4, -1, -2, 1, 5, -3}), 7, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 07"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{-1})).To(Equal(1))
			assert.Equal(t, MaxSubArray([]int{-1}), 1, "The two arrays should be the same.")
		}))
	allure.Test(t,
		allure.Epic(Epic),
		allure.Feature(Feature),
		allure.Story(Story),
		allure.Description("test Maximum subarray 08"),
		allure.Action(func() {
			// Expect(MaxSubArray([]int{-2, -1})).To(Equal(1))
			assert.Equal(t, MaxSubArray([]int{-2, -1}), 1, "The two arrays should be the same.")
		}))
}
