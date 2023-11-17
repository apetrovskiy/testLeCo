package testLeCo_test

import (
	"testing"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

func TestTestLeCo(t *testing.T) {
	RegisterFailHandler(Fail)
	RunSpecs(t, "TestLeCo Suite")
}
