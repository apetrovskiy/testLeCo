namespace main.java.problems.easy.MergeStringsAlternately;
public class MergeStringsAlternatelySolution
{
    public string MergeAlternately(string word1, string word2)
    {
        if (string.IsNullOrEmpty(word1) && string.IsNullOrEmpty(word2)) return "";
        // string addSpaces(string w1, int number) => w1.PadRight(number);

        var diff = word1.Length - word2.Length;
        if (diff > 0) word2 = word2.PadRight(diff, ' ');
        if (diff < 0) word1 = word1.PadRight(-diff, ' ');

        var collection = Enumerable.Range(0, word1.Length).Select(index => $"{word1[index]}{word2[index]}").ToList();
        return string.Concat(collection);
    }
}