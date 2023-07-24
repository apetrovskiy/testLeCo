namespace main.java.problems.easy.MergeStringsAlternately;
public class MergeStringsAlternatelySolution
{
    public string MergeAlternately(string word1, string word2)
    {
        if (string.IsNullOrEmpty(word1) && string.IsNullOrEmpty(word2)) return "";

        var diff = word1.Length - word2.Length;
        var commonLength = word1.Length > word2.Length ? word2.Length : word1.Length;

        var tail = "";
        if (diff > 0) tail = word1[commonLength..];
        if (diff < 0) tail = word2[commonLength..];

        var collection = Enumerable.Range(0, commonLength).Select(index => $"{word1[index]}{word2[index]}").ToList();
        return string.Concat(collection) + tail;
    }
}