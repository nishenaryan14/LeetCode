## String[] wordsArray = s.trim().split("\\s+");
    Explanation:
      s.trim():
        Removes leading and trailing white spaces from the string s.
        For example, if s = " Hello World ", after trim(), it becomes "Hello World".
      split("\\s+"): 
        Splits the string into an array of words based on one or more spaces.
        The regular expression \\s+ matches any sequence of one or more whitespace characters (spaces, tabs, etc.).
        So, if s = "Hello World", it will split into ["Hello", "World"], ignoring the extra spaces between the words. 
      Resulting wordsArray:
        This will be an array of words from the string s, where words are separated by any amount of whitespace

## str2.indexOf(str1);
    The expression str2.indexOf(str1) is a method call used in Java (or similar languages) to find the first occurrence of a        substring str1 within the string str2 .
    ### => int index = flow.indexOf(flower);
    str2: The string in which you are searching for the substring.
    str1: The substring you are trying to find within the string str2.
    Return Value:
    If the substring str1 is found in str2, the method returns the index (starting from 0) of the first occurrence.
    If the substring is not found, the method returns -1.

## to check if s2 is rotation of s1:
    just make a string concat and initialize it to s1+s1 and check by an inbuilt method .contains . Like concat.contains(s2)     , if it return true then s2 is rotation of s1 otherwise not. Why ?? you ask....

    Example 1:
    Input: s = "abcde", goal = "cdeab"
    here concat = abcdeabcde <= here you can notice that when s is appended to itself in concat goal can be noticed .            Keeping this in mind we can use this to get the output i.e.,
    Output: true
