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
