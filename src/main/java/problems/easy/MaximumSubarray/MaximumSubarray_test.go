package MaximumSubarray

import (
	"log"
	"os"
	"testing"

	"github.com/dailymotion/allure-go"
	"github.com/joho/godotenv"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
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

	return os.Getenv(key)
}

func dotest(input []int, exp int) {
	var ans = MaxSubArray(input)
	Expect(ans).To(Equal(exp))
}

func TestStepBitCounting(t *testing.T) {
	goDotEnvVariable("ALLURE_RESULTS_PATH")
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4})).To(Equal(6))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{1})).To(Equal(1))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{5, 4, -1, 7, 8})).To(Equal(23))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{5, -3, 6, -7, 6})).To(Equal(8))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{6, -7, 6, -3, 5})).To(Equal(8))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{-2, -3, 4, -1, -2, 1, 5, -3})).To(Equal(7))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{-1})).To(Equal(1))
	}))
	allure.Test(t, allure.Action(func() {
		Expect(MaxSubArray([]int{-2, -1})).To(Equal(1))
	}))
}
