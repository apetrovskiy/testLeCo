package problems.easy.GreatestCommonDivisorOfStrings;

import java.util.Arrays;

@SuppressWarnings("PMD")
class Solution {
  public String gcdOfStrings(String str1, String str2) {
    var result = "";
    final var maxDivisorLength =
        Arrays.stream(new int[] {str1.length(), str2.length()}).min().getAsInt();
    var currentDivisor = "";
    final var str1AsArray = str1.toCharArray();
    for (var i = 0; i < maxDivisorLength; i++) {
      currentDivisor += str1AsArray[i];
      if (isDivisorOf(currentDivisor, str1) && isDivisorOf(currentDivisor, str2))
        result = currentDivisor;
    }
    return result;
  }

  private Boolean isDivisorOf(final String divisor, final String data) {
    var result = false;
    if (divisor.length() > data.length()) return result;
    if (divisor.equals(data)) return true;
    final var listFromData = data.split(divisor);
    result = Arrays.asList(listFromData).stream().allMatch(item -> "".equals(item));
    return result;
  }
}
